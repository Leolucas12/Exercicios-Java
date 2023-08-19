package com.example.livraria.model;

import javax.persistence.*;

@Entity
@DiscriminatorValue("impresso")
public class Impresso extends Livro {
    private double frete;
    private int estoque;

    public Impresso() {
        super();
    }

    // Constructor
    public Impresso(String titulo, String autores, String editora, double preco, double frete, int estoque) {
        super(titulo, autores, editora, preco);
        this.frete = frete;
        this.estoque = estoque;
    }

    // Getters and setters for frete and estoque
    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void atualizarEstoque() {
        if (estoque > 0) {
            estoque--;
        }
    }

    @Override
    public String toString() {
        return String.format("| %-30s | %-30s | %-30s | %10.2f | %10.2f | %10d |",
                getTitulo(), getAutores(), getEditora(), getPreco(), getFrete(), getEstoque());
    }
}
