package com.example.modificador;

public class Conta {

    private Double saldo;
    private String titular;

   
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public Conta(Double saldo) {
        this.saldo = saldo;
    }
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    
}

