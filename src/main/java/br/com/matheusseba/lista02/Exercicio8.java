package br.com.matheusseba.lista02;

import java.util.Scanner;

public class Exercicio8 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a velocida maxima da via?");
        double via = sc.nextInt();
        System.out.println("E a quantos Km/h você estava?");
        int veiculo = sc.nextInt();

        double excesso = ((veiculo - via) / via) * 100;

        if (excesso <= 0){
            System.out.println("Sem multa");

        } else if (excesso > 0 && excesso <= 20) {
            System.out.println("Infração média");

        } else if (excesso > 20 && excesso <= 50) {
            System.out.println("Infração grave");

        } else {
            System.out.println("infração gravissima");
        }
    }
}
