package br.com.alura.lab03.principal;

import br.com.alura.lab03.model.Cachorro;
import br.com.alura.lab03.model.Mamifero;

import java.util.ArrayList;
import java.util.Comparator;

public class Principal {
    //Desafio01
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        String nome1 = "Fernano";
        String nome2 = "Dayanne";
        String nome3 = "Guilherme";
        String nome4 = "Eep";
        String nome5 = "Baby";

        lista.add(nome1);
        lista.add(nome2);
        lista.add(nome3);
        lista.add(nome4);
        lista.add(nome5);
        lista.sort(Comparator.naturalOrder());
        for (String nome : lista
        ) {
            System.out.println("Nome " + nome);
        }
        //lab 02
        Mamifero mamifero = new Cachorro();
        //lab03
        if(mamifero instanceof Cachorro){
            Cachorro cao = (Cachorro) mamifero;
            System.out.println("Sou um cachorro.");
            System.out.println(cao);
            System.out.println(mamifero);
        }else{
            System.out.println("nao sou dog.");
        }


        //lab03

    }
}
