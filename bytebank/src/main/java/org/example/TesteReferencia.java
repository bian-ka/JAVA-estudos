package org.example;

public class TesteReferencia {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        System.out.println("Saldo da primeira: " + primeiraConta.saldo);
    }
}
