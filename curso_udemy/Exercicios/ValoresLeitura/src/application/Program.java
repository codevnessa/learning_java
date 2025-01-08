package  application;
import java.util.Scanner;

import util.calculator;

import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        calculator calc = new calculator();

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter radius:");
            double radius = sc.nextDouble();
            
            double c = calc.circumference(radius);
            double v = calc.volume(radius);
            
            System.out.printf("Circumference: %.2f%n", c);
            System.out.printf("Volume: %.2f%n", v);
            System.out.printf("Pi Value: %.22f%n", Math.PI);
        } 
    }

}