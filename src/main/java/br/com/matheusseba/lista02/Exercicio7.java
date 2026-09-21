package br.com.matheusseba.lista02;

import java.util.Scanner;

public class Exercicio7 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Que horas são agora?");
        int hora = sc.nextInt();

        if (hora >= 0 && hora <= 11) {
            System.out.println("Bom dia");

        } else if (hora >= 12 && hora <= 17) {
            System.out.println("Boa tarde");

        } else if (hora >= 18 && hora <= 23) {
            System.out.println("Boa noite");

        } else {
            System.out.println("Informação inválida");
        }
    }
}
