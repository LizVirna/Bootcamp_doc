package com.example.lombok;
    
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@lombok.Data
public class Pessoa {

    private Long Id;
    private String nome;
    private Integer idade;
}
