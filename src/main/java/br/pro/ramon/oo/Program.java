package br.pro.ramon.oo;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.print("Nome: ");
        aluno.nome = console.nextLine();

        System.out.print("P1: ");
        aluno.p1 = Double.parseDouble(console.nextLine());

        System.out.print("P2: ");
        aluno.p2 = Double.parseDouble(console.nextLine());

        double media = aluno.calculaMedia();

        String passou;
        if (aluno.verificaSePassou()) {
            passou = "passou";
        } else {
            passou = "não passou";
        }

        System.out.printf("O aluno %s %s com média %.1f.\n", aluno.nome, passou, media);
    }
}

class Aluno {

    String nome;
    double p1, p2;

    public double calculaMedia() {
        double media = (p1 + p2) / 2;

        return media;
    }

    public boolean verificaSePassou() {
        boolean passou;

        double media = calculaMedia();

        if (media >= 7) {
            passou = true;
        } else {
            passou = false;
        }

        return passou;
    }

}
