package FundamentosJava.ExemplosPraticos;

import java.util.Scanner;

public class MenuDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        System.out.println("Bem-vindo ao Menu!");

        do {
            System.out.println("\n1 - Opção 1");
            System.out.println("2 - Opção 2");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            
            if (sc.hasNextInt()) {
                opcao = sc.nextInt();

                
                switch (opcao) {
                    case 1:
                        System.out.println("Você escolheu a Opção 1.");
                        break;
                    case 2:
                        System.out.println("Você escolheu a Opção 2.");
                        break;
                    case 0:
                        System.out.println("Saindo... Obrigado por usar o Menu!");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                sc.next(); 
                opcao = -1; 
            }
        } while (opcao != 0);

        sc.close();
    }
}
