package br.com.matheusseba.lista02;

import java.util.Scanner;

public class Exercicio3 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos graus está fazendo agora?");
        int graus = sc.nextInt();
        sc.nextLine();
        System.out.println("Qual a umidade do ar também");
        int umidade = sc.nextInt();

        if (graus >= 38){
            System.out.println("ALERTA DE CALOR EXTREMO NA SUA REGIÃO. ESTÁ FAZENDO " + graus + "Cº");
        }
        if (umidade < 30){
            System.out.println("ALERTA DE BAIXA UMIDADE NA SUA REGIÃO. " + umidade + "%");
        }
        if (graus >=35 && umidade < 20){
            System.out.println("ALERTA DE RISCO DE QUEIMADA NA SUA REGIÃO. " + graus + "Cº " + umidade + "%");
        }
    }
}
