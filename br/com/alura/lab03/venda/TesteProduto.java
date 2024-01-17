package br.com.alura.lab03.venda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteProduto {
    public static void main(String[] args) {
        //lab 04
        ArrayList<Produto> listaProduto = new ArrayList<>();
        Double total = 0.0;

        Produto produto1 = new Produto("sapato",100.00);
        Produto produto2 = new Produto("tenis",250.00);
        Produto produto3 = new Produto("cordao",120.00);
        Produto produto4 = new Produto("camisa",80.00);
        Produto produto5 = new Produto("meia",360.00);

        listaProduto.add(produto1);
        listaProduto.add(produto2);
        listaProduto.add(produto3);
        listaProduto.add(produto4);
        listaProduto.add(produto5);

        Collections.sort(listaProduto);
        for (Produto compra: listaProduto
             ) {
            System.out.println(compra);
            total += compra.getPreco();
        }

        System.out.println("Preco medio: " + total/listaProduto.size());
        System.out.println("soma: " + total);
        System.out.println("quantidade: " + listaProduto.size());
    }
}
