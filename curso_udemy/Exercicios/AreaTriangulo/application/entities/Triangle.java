package Exercicios.AreaTriangulo.application.entities;

public class Triangle {
    public double a;
    public double b;
    public double c;

   
    public double area() {
        double p = (a + b + c) / 2.0; 
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

   
    public boolean isValidTriangle() {
        return a + b > c && a + c > b && b + c > a;
    }
}
