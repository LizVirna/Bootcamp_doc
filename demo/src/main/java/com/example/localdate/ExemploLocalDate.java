package com.example.localdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class ExemploLocalDate {

    public static void main(String[] args) {
        LocalDateTime data = LocalDateTime.now();
        System.out.println("Dia da semana " + data.getDayOfWeek());
        System.out.println("Dia do mês " + data.getDayOfMonth());
        System.out.println("Mês " + data.getMonth());
        System.out.println("Ano " + data.getYear());
        System.out.println("Dia do ano " + data.getDayOfYear());
        System.out.println("Hora " + data.getHour());
        System.out.println("Minuto " + data.getMinute());
        System.out.println("Segundo " + data.getSecond());


        LocalDate outraData = LocalDate.of(2025, Month.MARCH, 10);
        System.out.println(outraData);
        System.out.println(outraData.isLeapYear());
        System.out.println(outraData.lengthOfMonth());
        

        
    }

}
