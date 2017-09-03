package br.com.caelum.exercicios;

import javax.swing.JOptionPane;

public class LabeledLoops_3_12 {

    public static void main(String[] args) {
        int x, y;

        x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor pra x: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para y: "));

        // primeiro rótulo labeled

        primeiroloop:
        for (int i = x; i <= y; i++ ){

            System.out.println("primeiro Loop i--> " + i);

            //aqui já no fim dos testes terminamos quando i==y
            if (i == y) {
                //imprime
                System.out.println("fim break");
                //para o software
                break;
            }

            // segundo rótudo labeled
            segundoloop:
            // no segundo laço j recebe o valor inicial digitado x
            // e faz a sua repetição até o valor final digitado y

            for (int j = x; j < y; j++) {
                //faz um varredura nos valores de x a y novamente mais quando
                //chegar em 7 ele entra na condicional
                System.out.println("Testando segundoloop-->>" + j);
                // condicional se j==7 então
                if (j == 7) {
                    // imprime
                    System.out.println("J chegou no 7 continue primeiroloop-->>");
                    //e continua (retorna) para o primeiro loop
                    continue primeiroloop;
                }
            }

        }
    }
}
