package br.pro.ramon.dados.sem;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = console.nextLine();

        System.out.print("P1: ");
        double p1 = Double.parseDouble(console.nextLine());

        System.out.print("P2: ");
        double p2 = Double.parseDouble(console.nextLine());

        double media = calculaMedia(p1, p2);

        String passou;
        if (verificaSePassou(p1, p2)) {
            passou = "passou";
        } else {
            passou = "não passou";
        }

        System.out.printf("O aluno %s %s com média %.1f.\n", nome, passou, media);
    }

    public static double calculaMedia(double p1, double p2) {
        double media = (p1 + p2) / 2;

        return media;
    }

    public static boolean verificaSePassou(double p1, double p2) {
        boolean passou;

        double media = calculaMedia(p1, p2);

        if (media >= 7) {
            passou = true;
        } else {
            passou = false;
        }

        return passou;
    }
}
