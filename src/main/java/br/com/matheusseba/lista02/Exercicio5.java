package br.com.matheusseba.lista02;

import java.util.Scanner;

public class Exercicio5 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Em que ano estamos?");
        int ano = sc.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
            System.out.println(ano + " É um ano bissexto");
        } else {
            System.out.println(ano + " Não é um ano bissexto");
        }
    }
}
