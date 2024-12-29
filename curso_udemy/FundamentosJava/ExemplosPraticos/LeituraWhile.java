package FundamentosJava.ExemplosPraticos;

import java.util.Scanner;

public class LeituraWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Digite números inteiros. Digite 0 para sair.");

     
        while (true) {
            System.out.print("Digite um número: ");

           
            if (sc.hasNextInt()) {
                numero = sc.nextInt();

                
                if (numero == 0) {
                    System.out.println("Saindo... Obrigado por participar!");
                    break;
                }

                System.out.println("Você digitou: " + numero);
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                sc.next(); 
            }
        }

        sc.close();
    }
}
