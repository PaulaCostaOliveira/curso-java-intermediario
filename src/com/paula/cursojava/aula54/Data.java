package com.paula.cursojava.aula54;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    private DiaSemana diaSemana;

    public Data() {
        super();
    }

    public Data(int dia, int mes, int ano, DiaSemana diaSemana) {
        super();
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.diaSemana = diaSemana;
    }
    public Data(int dia) {
        this.dia = dia;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }
    

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public DiaSemana getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(DiaSemana diaSemana) {
        this.diaSemana = diaSemana;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
