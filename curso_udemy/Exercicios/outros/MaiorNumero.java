package Exercicios.outros;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a, b, c);

        showResult(higher);

        sc.close();
    }

    // Método para encontrar o maior número entre três valores
    public static int max(int x, int y, int z){
        return Math.max(Math.max(x, y), z); // Usa Math.max para simplificar a lógica.
    }

    // Método para mostrar o resultado
    public static void showResult(int value){
        System.out.println("Higher = " + value);
    }
}