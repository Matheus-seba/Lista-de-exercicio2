package br.com.matheusseba.lista02;

import java.util.Scanner;

public class Execicio9 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o salário do funcionário: ");
        double salario = sc.nextDouble();

        System.out.println("Digite o tempo de casa (em anos): ");
        double tempoCasa = sc.nextDouble();

        double percentual;

        if (tempoCasa < 1) {
            percentual = 0;
        } else if (tempoCasa >= 1 && tempoCasa <= 3) {
            percentual = 5;
        } else if (tempoCasa > 3 && tempoCasa <= 10) {
            percentual = 10;
        } else {
            percentual = 15;
        }

        double valorBonus = salario * (percentual / 100.0);

        System.out.printf("Percentual de bônus: %.0f%%%n", percentual);
        System.out.printf("Valor do bônus: R$ %.2f%n", valorBonus);
    }
}
