package br.com.caelum.exercicios;

public class Fibonacci {

    int n1 = 0;
    int n2 = 1;
    int fib = 0;

    int calculaFibonacci(int n){

        if (n == 0){
            return 0;

        } else if (n == 1){
            return 1;
        } else {

            return calculaFibonacci(n-1) + calculaFibonacci(n -2 );

        }
    }
}
