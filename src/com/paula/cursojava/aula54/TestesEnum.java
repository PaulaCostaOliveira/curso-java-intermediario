package com.paula.cursojava.aula54;

public class TestesEnum {

    public static void main(String[] args) {

        DiaSemana dia = DiaSemana.SEGUNDA;

        System.out.println(dia.toString() + " - " + dia.getValor());

        Data data = new Data(16, 2, 2022, DiaSemana.SEXTA);
    }

}
