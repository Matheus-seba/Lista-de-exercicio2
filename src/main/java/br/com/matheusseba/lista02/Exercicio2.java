package br.com.matheusseba.lista02;

import java.util.Scanner;

public class Exercicio2 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Me informe um numero");
        int n = sc.nextInt();

        if (n > 0){
            System.out.println("Seu numero " + n + " é positivo");
        }
        if (n % 2 == 0){
            System.out.println("Seu numero " + n + " é par");
        }
        if (n % 5 == 0){
            System.out.println("Seu numero " + n + " é multiplo de 5");
        }
        int absNumero = Math.abs(n);
        if (absNumero >= 10 && absNumero <= 99) {
                System.out.println("Tem dois dígitos");
        }
    }
}
