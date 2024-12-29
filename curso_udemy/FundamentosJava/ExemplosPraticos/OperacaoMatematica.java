package FundamentosJava.ExemplosPraticos;

import java.util.Scanner;

public class OperacaoMatematica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char operacao;
        int a, b;

        System.out.print("Digite o primeiro número: ");
        a = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        b = scanner.nextInt();

        System.out.print("Digite a operação (+, -, *, /): ");
        operacao = scanner.next().charAt(0);

      
        switch (operacao) {
            case '+':
                System.out.println("Resultado: " + (a + b));
                break;
            case '-':
                System.out.println("Resultado: " + (a - b));
                break;
            case '*':
                System.out.println("Resultado: " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("Resultado: " + (a / b));
                } else {
                    System.out.println("Erro: Divisão por zero.");
                }
                break;
            default:
                System.out.println("Operação inválida.");
        }

        scanner.close();
    }
}
