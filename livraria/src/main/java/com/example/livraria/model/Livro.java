package com.example.livraria.model;

import javax.persistence.*;

@Entity
@Table(name = "livros")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_livro", discriminatorType = DiscriminatorType.STRING)
public abstract class Livro {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String titulo;
  private String autores;
  private String editora;
  private double preco;

  public Livro() {
  }

  // Constructor
  public Livro(String titulo, String autores, String editora, double preco) {
    this.titulo = titulo;
    this.autores = autores;
    this.editora = editora;
    this.preco = preco;
  }

  // Getters and setters (implement as needed)
  public void setPreco(double preco) {
    this.preco = preco;
  }

  public double getPreco() {
    return preco;
  }

  public String getTitulo() {
    return titulo;
  }

  public String getAutores() {
    return autores;
  }

  public String getEditora() {
    return editora;
  }

  @Override
  public String toString() {
    return String.format("| %-30s | %-30s | %-30s | %10.2f |",
        titulo, autores, editora, preco);
  }
}
