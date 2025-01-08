import java.util.Locale;
import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        CalcularNota cn = new CalcularNota();

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Primeira Nota: ");
        double n1 = sc.nextDouble();

        System.out.print("Segunda Nota: ");
        double n2 = sc.nextDouble();

        System.out.print("Terceira Nota: ");
        double n3 = sc.nextDouble();

        // Validação das notas
        if (n1 < 0 || n1 > 10 || n2 < 0 || n2 > 10 || n3 < 0 || n3 > 10) {
            System.out.println("Notas inválidas. As notas devem estar entre 0 e 10.");
            sc.close();
            return; // Encerra o programa
        }

        // Calcula a média
        double media = cn.media(n1, n2, n3);

        // Exibe o resultado
        System.out.printf("%s, sua média é: %.2f%n", nome, media);

        // Verifica se passou ou não
        verificarAprovacao(media);

        sc.close();
    }

    // Método para verificar aprovação
    public static void verificarAprovacao(double media) {
        if (media >= 7.0) {
            System.out.println("Situação: Aprovado(a)!");
        } else {
            System.out.println("Situação: Reprovado(a).");
        }
    }
}

class CalcularNota {
    public double media(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }
}