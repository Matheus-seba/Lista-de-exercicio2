package br.com.matheusseba.lista02;

import java.util.Scanner;

public class Exercicio12 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o saldo da conta: ");
        double saldo = sc.nextDouble();

        System.out.println("Digite o limite diário de saque: ");
        double limiteDiario = sc.nextDouble();

        System.out.println("Digite o valor solicitado: ");
        double valorSolicitado = sc.nextDouble();

        if (saldo < valorSolicitado) {
            System.out.println("Saldo insuficiente.");
        } else {
            if (valorSolicitado > limiteDiario) {
                System.out.println("Valor solicitado ultrapassa o limite diário de saque.");
            } else {
                saldo = saldo - valorSolicitado;
                System.out.println("Saque efetuado com sucesso!");
                System.out.printf("Novo saldo: R$ %.2f%n", saldo);
            }
        }
    }
}
