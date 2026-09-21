package br.com.matheusseba.lista02;

import java.util.Scanner;

public class Exercicio1 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Me informe sua idade");
        int idade = sc.nextInt();

        if (idade >= 16){
            System.out.println("Você pode votar");

        }
        if (idade >= 18){
            System.out.println("Você pode dirigir");

        }
        if (idade >= 60){
            System.out.println("Você é idoso");

        }
    }
}
