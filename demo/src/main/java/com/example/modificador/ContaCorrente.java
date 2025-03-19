package com.example.modificador;

public class ContaCorrente {
    public static void main(String[] args) {
        Conta conta = new Conta(100.0);
        conta.setTitular("João");
        System.out.println(conta.getTitular());
        System.out.println(conta.getSaldo());
    }

}
