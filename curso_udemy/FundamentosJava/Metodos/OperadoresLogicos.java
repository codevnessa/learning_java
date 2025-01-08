package FundamentosJava.Metodos;
import java.util.Scanner;

public class OperadoresLogicos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        // Verifica se o número está entre 10 e 20 (inclusive)
        boolean estaNoIntervalo = numero >= 10 && numero <= 20;

        // Verifica se o número é menor que 0 ou maior que 100
        boolean estaForaDoIntervalo = numero < 0 || numero > 100;

        // Inverte o resultado da verificação anterior
        boolean naoEstaForaDoIntervalo = !estaForaDoIntervalo;

        System.out.println("O número está entre 10 e 20? " + estaNoIntervalo);
        System.out.println("O número está fora do intervalo 0 a 100? " + estaForaDoIntervalo);
        System.out.println("O número não está fora do intervalo 0 a 100? " + naoEstaForaDoIntervalo);

        sc.close();
    }
}