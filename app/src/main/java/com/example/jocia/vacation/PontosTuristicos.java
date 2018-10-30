package com.example.jocia.vacation;

public class PontosTuristicos {

    String cidade;
    String estacao;

    public PontosTuristicos(String cidade, String estacao){
        this.cidade = cidade;
        this.estacao = estacao;
    }

    //Primavera: 21 setembro até 20 dezembro.
    //Verão: 21 dezembro até 20 março.
    //Outono: 21 março até 20 junho.
    //Inverno: 21 junho até 20 setembro.

    public String converteMes(int dia, int mes) {
        String estacao;
        if (mes >= 1 && mes <= 3) {
            estacao = "Verão";
            return estacao;
        } else if (mes >= 4 && mes <= 6) {
            estacao = "Outono";
            return estacao;
        } else if (mes >= 7 && mes <= 9) {
            estacao = "Inverno";
            return estacao;
        } else if (mes >= 10 && mes <= 12) {
            estacao = "Primavera";
            return estacao;
        }
        return null;
    }

    public int converteEstacao(String estacao) {
        if (estacao == "Verão") {
            //Retorna Fevereiro por ser um mês com feriados
            return 2;
        }else if (estacao == "Outono") {
            //Retorna Maio por ser um mês com feriado
            return 5;
        }else if (estacao == "Inverno") {
            //Retorna Julho por ser um mês de férias escolares
            return 7;
        }else if (estacao == "Primavera") {
            //Retorna Dezembro por ser um mês com feriados
            return 12;
        }
        return 0;
    }
}
