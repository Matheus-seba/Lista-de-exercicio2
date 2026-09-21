package br.com.matheusseba.lista02;

import java.util.Scanner;

public class Exercicio4 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Me informe dois numeros");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if (n2 == 0){
            System.out.println("A verificação não pode ser feita");
        } else if (n1 % n2 == 0){
            System.out.println("O numero " + n1 + " é multiplo de " + n2);
        } else {
            System.out.println("O numero " + n1 + " não é multiplo de " + n2);
        }
    }
}
