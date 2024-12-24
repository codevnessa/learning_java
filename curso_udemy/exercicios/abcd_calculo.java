package exercicios;

import java.util.Scanner;

public class abcd_calculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 4 numeros inteiros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();   
        int c = sc.nextInt();
        int d = sc.nextInt();
         
        int diferenca = (a * b) - (c * d);

        System.out.printf("A diferença na multiplicao de a x b e c é de: %d ", diferenca);
    
        sc.close();
    }
}
