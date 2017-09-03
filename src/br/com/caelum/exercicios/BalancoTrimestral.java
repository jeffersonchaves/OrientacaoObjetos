package br.com.caelum.exercicios;

public class BalancoTrimestral {

    public static void main(String[] args) {

        double gastosJaneiro = 15000.00;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;

        double gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;

        System.out.println("Os gastos no trimestre foram de: " + gastosTrimestre);

    }

}