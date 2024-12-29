package FundamentosJava.ExemplosPraticos;

import java.util.Scanner;

public class ClassificaIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;

        System.out.print("Digite a idade: ");

        if (scanner.hasNextInt()) {
            idade = scanner.nextInt();

            if (idade >= 0) {
                if (idade < 12) {
                    System.out.println("Criança.");
                } else if (idade < 18) {
                    System.out.println("Adolescente.");
                } else if (idade < 60) {
                    System.out.println("Adulto.");
                } else {
                    System.out.println("Idoso.");
                }
            } else {
                System.out.println("Idade inválida. A idade deve ser um número positivo.");
            }
        } else {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
        }

        scanner.close();
    }
}
