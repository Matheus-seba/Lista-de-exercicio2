package br.com.matheusseba.lista02;

import java.util.Scanner;

public class Exercicio10 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o usuário: ");
        String usuario = sc.nextLine();

        if (!usuario.equals("admin")) {
            System.out.println("Usuário não encontrado.");
        } else {
            System.out.println("Digite a senha: ");
            String senha = sc.nextLine();

            if (senha.equals("java123")) {
                System.out.println("Acesso liberado!");
            } else {
                System.out.println("Senha incorreta.");
            }
        }
    }
}
