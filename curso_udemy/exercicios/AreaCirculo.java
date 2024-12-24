package exercicios;

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Calculo da area de um circulo\n");
        System.out.println("Raio do circulo:");
        float raio = sc.nextFloat();

        double pi = 3.14159;
        double area = pi * (Math.pow(raio, 2));

        System.out.printf("A area total do circulo é de: %.4f" , area);

        sc.close();
    }   
}
