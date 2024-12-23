package exercicios;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = 7;
        int palpite;

        System.out.println("Adivinhe o número entre 1 e 10:");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();

            if (palpite == numeroSecreto) {
                System.out.println("Parabéns! Você acertou!");
            } else {
                System.out.println("Tente novamente.");
            }
        } while (palpite != numeroSecreto);

        scanner.close();
    }
}
