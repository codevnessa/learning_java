package exercicios;

public class Tabuada {
    public static void main(String[] args) {
        int numero = 5;
        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
