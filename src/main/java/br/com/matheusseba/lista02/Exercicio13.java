package br.com.matheusseba.lista02;

import java.util.Scanner;

public class Exercicio13 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Me informe dois numeros");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();

        System.out.println("Agora ecolha uma das opções:\n (1) SOMA\n (2) SUBTRAÇÃO\n (3) MULTIPLICAÇÃO\n (4) DIVISÃO");
        int opção = sc.nextInt();

        double resultado;

        switch (opção){
            case 1 ->{
                resultado = n1 + n2;
                System.out.println("Aqui está o resultado: " + n1 + " + " + n2 + " = " + resultado);
            }

            case 2 ->{
                resultado = n1 - n2;
                System.out.println("Aqui está o resultado: " + n1 + " - " + n2 + " = " + resultado);
            }

            case 3 ->{
                resultado = n1 * n2;
                System.out.println("Aqui está o resultado: " + n1 + " x " + n2 + " = " + resultado);
            }

            case 4 ->{
                if (n1 == 0 || n2 == 0) {
                    System.out.println("Erro: Não é possível dividir por zero!");
                } else {
                    resultado = n1 / n2;
                    System.out.println("Aqui está o resultado: " + n1 + " / " + n2 + " = " + resultado);
                }
            }

            default -> System.out.println("Erro: Opção inválida! Digite apenas 1, 2, 3 ou 4.");

        }
    }
}
