package com.example.collections.set;

import java.util.Set;
import java.util.HashSet;

public class TesteSetConta {
    public static void main(String[] args) {
        Set<Conta> contas = new HashSet<>();
        
        contas.add(new Conta(100L , 300.00));
        contas.add(new Conta(100L , 300.00));

        contas.forEach(conta -> {
            System.out.println("Conta: " + conta);
            System.out.println("Hash: " + conta.hashCode());
        });

        
    }
    

}
