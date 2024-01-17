package br.com.alura.lab03.geometria;

import java.util.ArrayList;

public class TesteForma {
    public static void main(String[] args) {
        ArrayList<Forma> listaForma = new ArrayList<>();

        Circulo circ1 = new Circulo(5.0);
        Circulo circ2 = new Circulo(10.0);
        Circulo circ3 = new Circulo(15.0);

        Quadrado quad1 = new Quadrado(2);
        Quadrado quad2 = new Quadrado(4);
        Quadrado quad3 = new Quadrado(6);

        listaForma.add(circ1);
        listaForma.add(circ2);
        listaForma.add(circ3);

        listaForma.add(quad1);
        listaForma.add(quad2);
        listaForma.add(quad3);

        for (Forma area : listaForma
             ) {
            System.out.println(area);
        }

    }
}
