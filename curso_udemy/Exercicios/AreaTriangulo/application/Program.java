package Exercicios.AreaTriangulo.application;

import Exercicios.AreaTriangulo.application.entities.Triangle;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {
            Triangle x, y;
            x = new Triangle();
            y = new Triangle();
            System.out.println("Enter the measures of triangle X: ");
            x.a = sc.nextDouble();
            x.b = sc.nextDouble();
            x.c = sc.nextDouble();
            System.out.println("Enter the measures of triangle Y: ");
            y.a = sc.nextFloat();
            y.b = sc.nextDouble();
            y.b = sc.nextDouble();
            double areaX = x.area();
            double areaY = y.area();
            System.out.printf("Area of triangle X: %.4f%n", areaX);
            System.out.printf("Area of triangle Y: %.4f%n", areaY);
        } 
    }
}