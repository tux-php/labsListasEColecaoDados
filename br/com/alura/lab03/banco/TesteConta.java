package br.com.alura.lab03.banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteConta {
    public static void main(String[] args) {
        ArrayList<ContaBancaria> listaConta = new ArrayList<>();

        ContaBancaria conta1 = new ContaBancaria("1123-5", 200.00);
        ContaBancaria conta2 = new ContaBancaria("2222-2", 500.00);
        ContaBancaria conta3 = new ContaBancaria("3333-3", 9000.00);
        ContaBancaria conta4 = new ContaBancaria("4444-4", 1200.00);
        ContaBancaria conta5 = new ContaBancaria("5555-5", 3200.00);

        listaConta.add(conta1);
        listaConta.add(conta2);
        listaConta.add(conta3);
        listaConta.add(conta4);
        listaConta.add(conta5);

        ContaBancaria maiorSaldo = Collections.max(listaConta,Comparator.comparing(ContaBancaria::getSaldo));

        System.out.println("Maior saldo: " + maiorSaldo.getNumeroConta() + " - " + maiorSaldo.getSaldo());
    }
}
