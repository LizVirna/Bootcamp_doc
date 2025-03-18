package com.example.interfaces;

public class TesteInterface {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(5000.00);
        contaCorrente.getSaldo();
        contaCorrente.sacar(1000.00);   

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.depositar(15000.00);
        contaPoupanca.sacar(800.00);
        contaPoupanca.getSaldo();

        System.out.println("Saldo da conta corrente: " + contaCorrente.getSaldo());
        System.out.println("Saldo da conta poupança: " + contaPoupanca.getSaldo());
    }

}