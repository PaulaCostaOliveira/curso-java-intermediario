package com.paula.cursojava.aula55;

import com.paula.cursojava.aula54.DiaSemana;

public class TesteEnum {

    public static void main(String[] args) {

        DiaSemana[] dias = DiaSemana.values();//o metodo values retorna um array com todos os valores do numeradores do enum

        for (int i=0; i<dias.length; i++){
            System.out.println(dias[i]);
        }

        for (DiaSemana dia : DiaSemana.values()){
            System.out.println(dia);
        }


    }
}
