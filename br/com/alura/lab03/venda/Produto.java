package br.com.alura.lab03.venda;

import java.util.Comparator;

public class Produto implements Comparable<Produto> {
    private String nome;
    private Double preco;


    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    @Override
    public int compareTo(Produto outroProduto) {
        return this.getNome().compareTo(outroProduto.getNome());
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + " - " + "Preco: " + getPreco();
    }
}
