package exercicios;

import java.util.Locale;

public class PrecoProduto {
    public static void main(String[] args) {
        // Inicialização das variáveis
        String product1 = "Computer";
        String product2 = "Tablet";
        int age = 30;
        int code = 5290;
        char gender = 'F';
        double price1 = 2100.0;
        double price2 = 650.60;
        double measure = 53.234567;

        // Saída formatada
        System.out.println("Produtos:");
        System.out.printf("%s, which price is $%.2f%n", product1, price1);
        System.out.printf("%s, which price is $%.2f%n", product2, price2);
        
        System.out.printf("Record: %d year old, code %d and gender: %c %n", age, code, gender);

        System.out.printf("Measue with eight demimal places: %.8f %n", measure);
        System.out.printf("Rouded (three decimal places): %.3f %n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", measure);
    }
}