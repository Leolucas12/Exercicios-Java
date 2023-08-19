package com.example.livraria.model;

import java.util.ArrayList;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import java.util.List;

@Entity
@Table(name = "vendas")
public class Venda {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private static int numVendas = 0;
  private int numero;
  @ManyToMany
  @JoinTable(name = "venda_livro", joinColumns = @JoinColumn(name = "venda_id"), inverseJoinColumns = @JoinColumn(name = "livro_id"))
  private List<Livro> livros = new ArrayList<>();

  private String cliente;
  private double valor;

  public Venda() {
  }

  // Constructor
  public Venda(String cliente) {
    numVendas++;
    this.numero = numVendas;
    this.cliente = cliente;
    // Initialize the livros array with a certain size
    this.livros = new ArrayList<Livro>(); // You can adjust the size as needed
    this.valor = 0;
  }

  public List<Livro> getLivros() {
    return this.livros;
  }

  public void setLivros(List<Livro> livros) {
    this.livros = livros;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public void addLivro(Livro livro, int index) {
    if (index >= 0 && index < livros.size()) {
      livros.add(index, livro);
      valor += livro.getPreco();
    }
  }

  public void listarLivros() {
    System.out.println("Livros da Venda " + numero + " para " + cliente + ":");
    for (Livro livro : livros) {
      if (livro != null) {
        System.out.println(livro);
      }
    }
  }

  @Override
  public String toString() {
    return String.format("| %-10d | %-30s | %-10.2f |",
        numero, cliente, valor);
  }

  public static void updateNumVendas(EntityManager em) {
    CriteriaBuilder builder = em.getCriteriaBuilder();
    CriteriaQuery<Long> query = builder.createQuery(Long.class);
    query.select(builder.count(query.from(Venda.class)));

    Long count = em.createQuery(query).getSingleResult();
    numVendas = count.intValue();
  }
}
