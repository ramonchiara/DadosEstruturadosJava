package br.pro.ramon.dados.com;

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

        double media = calculaMedia(aluno);

        String passou;
        if (verificaSePassou(aluno)) {
            passou = "passou";
        } else {
            passou = "não passou";
        }

        System.out.printf("O aluno %s %s com média %.1f.\n", aluno.nome, passou, media);
    }

    public static double calculaMedia(Aluno aluno) {
        double media = (aluno.p1 + aluno.p2) / 2;

        return media;
    }

    public static boolean verificaSePassou(Aluno aluno) {
        boolean passou;

        double media = calculaMedia(aluno);

        if (media >= 7) {
            passou = true;
        } else {
            passou = false;
        }

        return passou;
    }
}

class Aluno {

    String nome;
    double p1, p2;

}
