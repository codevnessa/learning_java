package FundamentosJava.ExemplosPraticos;

import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;

        System.out.println("Soma de números em um intervalo");

        System.out.print("Digite o valor inicial: ");
        int inicio = sc.nextInt();

        System.out.print("Digite o valor final: ");
        int fim = sc.nextInt();

        if (inicio > fim) {
            System.out.println("Intervalo inválido. O valor inicial deve ser menor ou igual ao valor final.");
        } else {
            for (int i = inicio; i <= fim; i++) {
                soma += i;
            }
            System.out.println("Soma dos números de " + inicio + " a " + fim + ": " + soma);
        }

        sc.close();
    }
}
