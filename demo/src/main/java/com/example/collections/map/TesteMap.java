package com.example.collections.map;

import java.util.HashMap;
import java.util.Map;

public class TesteMap {

    public static void main(String[] args) {
        Map<String, String> contas  = new HashMap<>();

        contas.put("Conta Corrente" , "Liz");
        contas.put("Conta Poupança" , "Liz");
        contas.put("Conta Pagamento" , "Liz");

        System.out.println(contas);

        System.out.println(contas.get("Conta Corrente"));

        System.out.println(contas.keySet());
    }

}
