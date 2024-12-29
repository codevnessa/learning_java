package FundamentosJava.ExemplosPraticos;

import java.util.Scanner;

public class VerificaEstoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int estoque;

        System.out.print("Digite a quantidade em estoque: ");

        if (scanner.hasNextInt()) {
            estoque = scanner.nextInt();

            if (estoque >= 0) {
                if (estoque > 100) {
                    System.out.println("Estoque alto.");
                } else if (estoque > 50) {
                    System.out.println("Estoque médio.");
                } else if (estoque > 0) {
                    System.out.println("Estoque baixo.");
                } else {
                    System.out.println("Estoque esgotado.");
                }
            } else {
                System.out.println("Valor inválido. O estoque não pode ser negativo.");
            }
        } else {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
        }

        scanner.close();
    }
}
