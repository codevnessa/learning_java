package exercicios;

import java.util.Scanner;

public class SalarioHora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu ID: ");
        int id = sc.nextInt();

        System.out.println("Quantas horas voce trabalhou? ");
        int horas = sc.nextInt();

        System.out.println("Valor que voce recebe por horas: ");
        float valor_por_hora = sc.nextFloat();
        
        float salario = horas * valor_por_hora;

        System.out.printf("ID: %d \n1
        SALÁRIO: %.2f", id, salario);

        sc.close();
    }

}
