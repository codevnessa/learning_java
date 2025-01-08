import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Preço do dólar hoje: $");
        double dolar = sc.nextDouble();

        System.out.println("Quantos voce pretende comprar: R$");
        double quantidade = sc.nextDouble();

        double total = (dolar * 1.06) * quantidade;

        System.out.printf("Total a pagar em reais: R$%.2f%n ",  total);
        
        
    }
}
