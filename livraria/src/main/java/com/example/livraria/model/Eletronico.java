package com.example.livraria.model;

import javax.persistence.*;

@Entity
@DiscriminatorValue("eletronico")
public class Eletronico extends Livro {
  private int tamanho;

  public Eletronico() {
    super();
  }

  // Constructor
  public Eletronico(String titulo, String autores, String editora, double preco, int tamanho) {
    super(titulo, autores, editora, preco);
    this.tamanho = tamanho;
  }

  // Getter and setter for tamanho
  public int getTamanho() {
    return tamanho;
  }

  @Override
  public String toString() {
    return String.format("| %-30s | %-30s | %-30s | %10.2f | %10d KB |",
        getTitulo(), getAutores(), getEditora(), getPreco(), getTamanho());
  }
}
