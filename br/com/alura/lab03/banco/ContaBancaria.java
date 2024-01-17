package br.com.alura.lab03.banco;

public class ContaBancaria {
    private String numeroConta;
    private Double saldo;

    public ContaBancaria(String numeroConta, Double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }
}
