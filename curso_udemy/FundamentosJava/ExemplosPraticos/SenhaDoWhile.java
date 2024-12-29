package FundamentosJava.ExemplosPraticos;

import java.util.Scanner;

public class SenhaDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha;
        boolean senhaCorreta = false;

        int tentativas = 0;
        final int MAX_TENTATIVAS = 3; 
        final String SENHA_CORRETA = "1234"; 

        System.out.println("Bem-vindo ao sistema de autenticação!");

        do {
            System.out.print("Digite a senha: ");
            senha = sc.nextLine();

            if (senha.equals(SENHA_CORRETA)) {
                senhaCorreta = true;
                System.out.println("Senha correta! Acesso concedido.");
            } else {
                tentativas++;
                if (tentativas < MAX_TENTATIVAS) {
                    System.out.println("Senha incorreta. Tentativas restantes: " + (MAX_TENTATIVAS - tentativas));
                } else {
                    System.out.println("Senha incorreta. Você esgotou suas tentativas. Acesso bloqueado.");
                }
            }
        } while (!senhaCorreta && tentativas < MAX_TENTATIVAS);

        sc.close();
    }
}
