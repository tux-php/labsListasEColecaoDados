package br.com.alura.lab03.model;

public class Mamifero implements Animal{
    @Override
    public String move() {
        return "anda ou nada";
    }
    public void amamenta(){
        System.out.println("Amamaenta!");
    }
}
