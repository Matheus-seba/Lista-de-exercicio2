package br.com.matheusseba.lista02;

import java.util.Scanner;

public class Exercicio6 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quanto foi sua compra?");
        double compra = sc.nextDouble();

        double frete;

        if (compra >= 199.00){
            frete = 0;
        } else {
            frete = 24.90;
        }
        double total = compra + frete;
        System.out.println("O valor do frete é " + String.format("%.2f", frete) + " no total a compra deu " + String.format("%.2f", total));
    }
}
