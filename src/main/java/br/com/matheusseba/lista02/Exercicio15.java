package br.com.matheusseba.lista02;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tipo de veículo (1-Carro, 2-Moto): ");
        int tipoVeiculo = sc.nextInt();

        double tarifaHora;

        switch (tipoVeiculo) {
            case 1:
                tarifaHora = 8.00;
                break;
            case 2:
                tarifaHora = 5.00;
                break;
            default:
                System.out.println("Opção inválida.");
                sc.close();
                return;
        }

        System.out.println("Digite a quantidade de horas: ");
        double horas = sc.nextDouble();

        double valor = tarifaHora * horas;

        System.out.println("O cliente possui cupom de desconto? (sim/nao): ");
        String temCupom = sc.next();

        if (temCupom.equalsIgnoreCase("sim")) {
            if (valor >= 50.00) {
                valor = valor - (valor * 0.20);
                System.out.println("Cupom aplicado: 20% de desconto.");
            } else {
                System.out.println("Cupom válido apenas para valores a partir de R$ 50,00.");
            }
        }

        if (horas > 12) {
            System.out.println("Aviso: permanência longa detectada (acima de 12 horas).");
        }

        if (horas > 24) {
            System.out.println("Aviso: será cobrada diária (acima de 24 horas).");
        }

        String classificacao;

        if (horas <= 2) {
            classificacao = "curta";
        } else if (horas <= 6) {
            classificacao = "média";
        } else {
            classificacao = "longa";
        }

        System.out.println("Classificação da permanência: " + classificacao);
        System.out.printf("Valor final a pagar: R$ %.2f%n", valor);

    }
}