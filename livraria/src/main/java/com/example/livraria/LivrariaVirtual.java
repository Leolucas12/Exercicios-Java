package com.example.livraria;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import com.example.livraria.model.Eletronico;
import com.example.livraria.model.Impresso;
import com.example.livraria.model.Venda;

import java.util.List;

public class LivrariaVirtual {
  private static final int MAX_IMPRESSOS = 100; // Example maximum values
  private static final int MAX_ELETRONICOS = 100;
  private static final int MAX_VENDAS = 100;

  private Impresso[] impressos = new Impresso[MAX_IMPRESSOS];
  private Eletronico[] eletronicos = new Eletronico[MAX_ELETRONICOS];
  private Venda[] vendas = new Venda[MAX_VENDAS];

  private int numImpressos = 0;
  private int numEletronicos = 0;
  private int numVendas = 0;
  private char opcao;

  private Scanner scanner = new Scanner(System.in);

  private EntityManagerFactory emf = Persistence.createEntityManagerFactory("livraria");

  private EntityManager em = emf.createEntityManager();

  public char getOpcao() {
    return opcao;
  }

  public void setOpcao(char opcao) {
    this.opcao = opcao;
  }

  public void cadastrarLivro() {
    System.out.println("Cadastro de Livro");
    System.out.println("Selecione o tipo de livro:");
    System.out.println("1. Livro Impresso");
    System.out.println("2. Livro Eletrônico");
    System.out.print("Escolha uma opção: ");
    int tipoLivro = scanner.nextInt();
    scanner.nextLine(); // Consume the newline character

    if (tipoLivro == 1) {
      System.out.println("Cadastro de Livro Impresso");
      System.out.print("Título: ");
      String titulo = scanner.nextLine();
      System.out.print("Autores: ");
      String autores = scanner.nextLine();
      System.out.print("Editora: ");
      String editora = scanner.nextLine();
      System.out.print("Preço: ");
      double preco = scanner.nextDouble();
      System.out.print("Frete: ");
      double frete = scanner.nextDouble();
      System.out.print("Estoque: ");
      int estoque = scanner.nextInt();

      this.em.getTransaction().begin();

      Impresso impresso = new Impresso(titulo, autores, editora, preco, frete, estoque);
      this.em.persist(impresso);
      this.em.getTransaction().commit();

      impressos[numImpressos++] = impresso;

      System.out.println("Livro Impresso cadastrado com sucesso.");
    } else if (tipoLivro == 2) {
      System.out.println("Cadastro de Livro Eletrônico");
      System.out.print("Título: ");
      String titulo = scanner.nextLine();
      System.out.print("Autores: ");
      String autores = scanner.nextLine();
      System.out.print("Editora: ");
      String editora = scanner.nextLine();
      System.out.print("Preço: ");
      double preco = scanner.nextDouble();
      System.out.print("Tamanho (KB): ");
      int tamanho = scanner.nextInt();

      this.em.getTransaction().begin();

      Eletronico eletronico = new Eletronico(titulo, autores, editora, preco, tamanho);
      this.em.persist(eletronico);
      this.em.getTransaction().commit();

      eletronicos[numEletronicos++] = eletronico;

      System.out.println("Livro Eletrônico cadastrado com sucesso.");
    } else {
      System.out.println("Opção inválida.");
    }
  }

  public void realizarVenda() {
    System.out.println("Realização de Venda");

    System.out.print("Nome do cliente: ");
    String cliente = scanner.nextLine();

    System.out.print("Quantidade de livros que deseja comprar: ");
    int quantidadeLivros = scanner.nextInt();
    scanner.nextLine(); // Consume the newline character

    Venda.updateNumVendas(em);
    Venda venda = new Venda(cliente);

    for (int i = 0; i < quantidadeLivros; i++) {
      System.out.println("Selecionar tipo de livro para o livro " + (i + 1));
      System.out.println("1. Livro Impresso");
      System.out.println("2. Livro Eletrônico");
      System.out.print("Escolha uma opção: ");
      int tipoLivro = scanner.nextInt();
      scanner.nextLine(); // Consume the newline character

      if (tipoLivro == 1) {
        System.out.println("Escolher um livro impresso:");
        listarLivrosImpressos();
        System.out.print("Escolha o índice do livro impresso: ");
        int livroIndex = scanner.nextInt();

        if (livroIndex >= 1 && livroIndex < numImpressos + 1) {
          venda.addLivro(impressos[livroIndex - 1], i);
          venda.setValor(venda.getValor() + impressos[livroIndex - 1].getPreco());
        } else {
          System.out.println("Índice inválido.");
        }
      } else if (tipoLivro == 2) {
        System.out.println("Escolher um livro eletrônico:");
        listarLivrosEletronicos();
        System.out.print("Escolha o índice do livro eletrônico: ");
        int livroIndex = scanner.nextInt();

        if (livroIndex >= 1 && livroIndex < numEletronicos + 1) {
          venda.addLivro(eletronicos[livroIndex - 1], i);
          venda.setValor(venda.getValor() + eletronicos[livroIndex - 1].getPreco());
        } else {
          System.out.println("Índice inválido.");
        }
      } else {
        System.out.println("Opção inválida.");
      }
    }

    this.em.getTransaction().begin();
    this.em.persist(venda);
    this.em.getTransaction().commit();
    vendas[numVendas++] = venda;

    System.out.println("Venda realizada com sucesso.");
  }

  public void listarLivrosImpressos() {
    em.getTransaction().begin();

    CriteriaBuilder builder = em.getCriteriaBuilder();

    CriteriaQuery<Impresso> query = builder.createQuery(Impresso.class);
    query.from(Impresso.class);

    List<Impresso> impressos = em.createQuery(query).getResultList();

    this.impressos = impressos.toArray(new Impresso[impressos.size()]);
    this.numImpressos = impressos.size();

    System.out.println(
        String.format("| %-1s | %-30s | %-30s | %-30s | %10s | %10s | %10s |", " ", "Título", "Autores", "Editora",
            "Preço",
            "Frete", "Estoque"));
    int index = 1;
    for (Impresso impresso : impressos) {
      System.out.println(index + " - " + impresso.toString());
      index++;
    }

    em.getTransaction().commit();
  }

  public void listarLivrosEletronicos() {
    em.getTransaction().begin();

    CriteriaBuilder builder = em.getCriteriaBuilder();

    CriteriaQuery<Eletronico> query = builder.createQuery(Eletronico.class);
    query.from(Eletronico.class);

    List<Eletronico> eletronicos = em.createQuery(query).getResultList();

    this.eletronicos = eletronicos.toArray(new Eletronico[eletronicos.size()]);
    this.numEletronicos = eletronicos.size();

    System.out.println(
        String.format("| %-1s | %-30s | %-30s | %-30s | %10s | %10s |", " ", "Título", "Autores", "Editora", "Preço",
            "Tamanho"));
    int index = 1;
    for (Eletronico eletronico : eletronicos) {
      System.out.println(index + " - " + eletronico.toString());
      index++;
    }

    em.getTransaction().commit();
  }

  public void listarLivros() {
    listarLivrosImpressos();
    listarLivrosEletronicos();
  }

  public void listarVendas() {
    this.em.getTransaction().begin();
    Venda.updateNumVendas(this.em);

    CriteriaBuilder builder = em.getCriteriaBuilder();

    CriteriaQuery<Venda> query = builder.createQuery(Venda.class);
    query.from(Venda.class);

    List<Venda> vendas = em.createQuery(query).getResultList();

    this.vendas = vendas.toArray(new Venda[vendas.size()]);
    this.numVendas = vendas.size();

    System.out.println(String.format("| %-10s | %-30s | %-10s |", "Número", "Cliente", "Valor"));
    for (Venda venda : vendas) {
      System.out.println(venda.toString());
    }

    em.getTransaction().commit();
  }

  public static void main(String[] args) {
    LivrariaVirtual livraria = new LivrariaVirtual();
    livraria.setOpcao('z');
    livraria.runMenu();
  }

  public void runMenu() {
    while (this.getOpcao() == 'z') {
      System.out.println("Menu:");
      System.out.println("a) Cadastrar livro");
      System.out.println("b) Realizar uma venda");
      System.out.println("c) Listar livros");
      System.out.println("d) Listar vendas");
      System.out.println("e) Sair do programa");
      System.out.print("Escolha uma opção: ");
      String option = scanner.nextLine();

      switch (option) {
        case "a":
          this.setOpcao('a');
          cadastrarLivro();
          break;
        case "b":
          this.setOpcao('b');
          realizarVenda();
          break;
        case "c":
          this.setOpcao('c');
          listarLivros();
          break;
        case "d":
          this.setOpcao('d');
          listarVendas();
          break;
        case "e":
          this.setOpcao('e');
          System.out.println("Encerrando o programa...");
          break;
        default:
          System.out.println("Opção inválida.");
      }
    }
  }
}
