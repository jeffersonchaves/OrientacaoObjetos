package br.com.caelum.exercicios;

public class Exercicio_3_13 {

    public static int y = 0;
    public static int fatorial = 1;

    public static void main(String[] args) {

//        for (int x = 150; x <= 300; x++){
//            System.out.println(x);
//        }

        //soma até mil
//        for (int x = 1; x < 1000; x++) {
//            y += x;
//        }

//        System.out.println(y);

        //fatorial
//        double fatorial = 1;
//        for (int n = 1; n <= 40; n++) {
//
//            fatorial = fatorial * n;
//
//            System.out.println(fatorial);
//
//        }

        //fibonacci
//        int n1 = 1, n2 = 1, n;
//
//        while (n1 < 100){
//
//            n = n1 + n2;
//            n1 = n2;
//            n2 = n;
//            System.out.println(n);
//
//        }

        for (int i = 1; i < 5; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(i*j + " ");

            }
            System.out.println("");
        }


    }
}