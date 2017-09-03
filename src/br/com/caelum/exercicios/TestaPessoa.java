package br.com.caelum.exercicios;

public class TestaPessoa {


    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.idade = 28;
        pessoa.fazerAniversario();

        System.out.println(pessoa.idade);

    }
}
