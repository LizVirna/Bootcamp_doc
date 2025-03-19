package com.example.ExemploEqualsEIgual;

public class TesteEqualsEIgual {

    public static void main(String[] args) {
        String nome1 = "João";
        String nome2 = "joão";
        String nome3 = new String("João");
        
        System.out.println("nome1 == nome2: " + (nome1 == nome2));
        System.out.println("nome1 == nome3: " + (nome1 == nome3));

        System.out.println("nome1.equals(nome2): " + nome1.equals(nome2));
        System.out.println("nome1.equals(nome3): " + nome1.equals(nome3));


        System.out.println(nome1.equalsIgnoreCase(nome2));
    }

}
