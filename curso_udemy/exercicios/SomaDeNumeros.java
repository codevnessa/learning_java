package exercicios;

import java.util.Scanner;

public class SomaDeNumeros {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Digite um numero: ");
    int num1 = sc.nextInt();

    System.out.println("Digite um outro numero: ");
    int num2 = sc.nextInt();


    int soma = num1 + num2;

    System.out.printf("SOMA: %s\n", soma);

    sc.close();
   }
}
