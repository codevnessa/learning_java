package app;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter product data: ");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
           
            
            Product product = new Product(name, price);

            product.setPrice(1200);
            System.out.println("Update price: " + product.getPrice());
            product.setName("computador");
            System.out.println("Update name: " + product.getName());
            System.out.println();
            System.out.println("Product data: " + product);
            System.out.println();

            System.out.print("Enter the number of products to be added in stock: ");
            int addQuantity = sc.nextInt();
            product.addProducts(addQuantity);
            
            System.out.println();
            System.out.println("Updated data: " + product);
            System.out.println();
            
            System.out.print("Enter the number of products to be removed from stock: ");
            int removeQuantity = sc.nextInt();
            product.removeProducts(removeQuantity);
            System.out.println();
            
            System.out.println("Updated data: " + product);
        }
    }
}