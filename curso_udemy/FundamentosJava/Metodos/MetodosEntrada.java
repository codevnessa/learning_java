package FundamentosJava.Metodos;

import java.util.Scanner;

public class MetodosEntrada {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite uma palavra: ");
            String palavra = sc.next();
            System.out.println("Você digitou: " + palavra);
            
            // Limpa o buffer do teclado
            sc.nextLine();
            
            System.out.print("Digite uma frase: ");
            String frase = sc.nextLine();
            System.out.println("Você digitou: " + frase);
            
            System.out.print("Digite um número inteiro: ");
            int inteiro = sc.nextInt();
            System.out.println("Você digitou: " + inteiro);
            
            System.out.print("Digite um número decimal: ");
            double decimal = sc.nextDouble();
            System.out.println("Você digitou: " + decimal);
            
            System.out.print("Digite um valor booleano (true/false): ");
            boolean booleano = sc.nextBoolean();
            System.out.println("Você digitou: " + booleano);
        }
    }
}