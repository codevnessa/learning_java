package FundamentosJava.ExemplosPraticos;

import java.util.Scanner;

public class PositivoNegativoTernaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        String resultado = (numero > 0) ? "Positivo" : (numero < 0) ? "Negativo" : "Zero";
        System.out.println("Resultado: " + resultado);

        sc.close();
    }
}
