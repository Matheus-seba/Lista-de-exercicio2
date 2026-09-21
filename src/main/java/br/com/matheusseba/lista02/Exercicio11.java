package br.com.matheusseba.lista02;

import java.util.Scanner;

public class Exercicio11 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a frequência do aluno (%): ");
        double frequencia = sc.nextDouble();

        System.out.println("Digite a média final do aluno: ");
        double media = sc.nextDouble();

        if (frequencia < 75) {
            System.out.println("Aluno reprovado por falta.");
        } else {
            if (media >= 7) {
                System.out.println("Aluno aprovado.");
            } else if (media >= 5) {
                System.out.println("Aluno em recuperação.");
            } else {
                System.out.println("Aluno reprovado por nota.");
            }
        }
    }
}
