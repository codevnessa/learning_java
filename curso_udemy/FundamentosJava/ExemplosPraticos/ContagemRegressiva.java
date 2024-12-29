package FundamentosJava.ExemplosPraticos;

import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador;

        System.out.print("Digite o valor inicial para a contagem regressiva: ");

        if (sc.hasNextInt()) {
            contador = sc.nextInt();

            if (contador >= 0 && contador <= 1000) { 
                while (contador >= 0) {
                    System.out.println("Contagem: " + contador);
                    contador--;

                    try {
                        Thread.sleep(1000); 
                    } catch (InterruptedException e) {
                        System.out.println("A contagem foi interrompida inesperadamente.");
                        sc.close();
                        return; 
                    }
                }
                System.out.println("Contagem regressiva concluída!"); 
            } else {
                System.out.println("Valor inválido. O valor inicial deve ser entre 0 e 1000.");
            }
        } else {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
        }

        sc.close();
    }
}