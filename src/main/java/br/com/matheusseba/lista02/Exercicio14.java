package br.com.matheusseba.lista02;

import java.util.Scanner;

public class Exercicio14 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Selecione um mês:\n (1)JANEIRO\n (2)FEVEREIRO\n (3)MARÇO\n (4)MAIO\n (5)ABRIL\n (6)JUNHO\n (7)JULHO\n (8)AGOSTO\n (9)SETEMBRO\n (10)OUTUBRO\n (11)NOVEMBRO\n (12)DEZEMBRO\n");
        int mês = sc.nextInt();

        int dias;

        switch (mês){
            case 2 ->{
                dias = 28;
                System.out.println("esse mês tem " + dias + " dias");
            }
            case 1, 3, 5, 7, 8, 10, 12 ->{
                dias = 31;
                System.out.println("esse mês tem " + dias + " dias");
            }
            case 4, 6, 9, 11 ->{
                dias = 30;
                System.out.println("esse mês tem " + dias + " dias");
            }
            default -> System.out.println("Erro: Opção inválida! Digite o numero de um mês válido");
        }
    }
}
