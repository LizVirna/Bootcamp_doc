package com.example.lombok;

public class TestePessoa {

    public static void main(String[] args) {
        Pessoa pessoaLiz = new Pessoa();
        
        pessoaLiz.setId(1L);
        pessoaLiz.setNome("Liz");
        pessoaLiz.setIdade(25);
        
        System.out.println(pessoaLiz.getId());
        System.out.println(pessoaLiz.getNome());
        System.out.println(pessoaLiz.getIdade());
    }

}
