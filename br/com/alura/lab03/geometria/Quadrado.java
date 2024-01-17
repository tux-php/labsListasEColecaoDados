package br.com.alura.lab03.geometria;

public class Quadrado implements Forma{
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public String toString() {
        return "Área do quadrado: " + calcularArea();
    }
}
