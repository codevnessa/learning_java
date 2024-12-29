package ManipulacaoStrings;
import java.util.Scanner; // Isso aqui é pra poder ler o que o usuário digitar

public class ManipulacaoStrings {

    public static void main(String[] args) {
        // Cria uma "caixinha" pra guardar o que o usuário digitar
        Scanner scanner = new Scanner(System.in);

        // Pede pro usuário digitar uma palavra ou frase
        System.out.print("Digite uma string: ");
        String texto = scanner.nextLine(); // Guarda o que o usuário digitou

        // Conta quantas vogais tem na palavra/frase
        int numeroVogais = contarVogais(texto);
        System.out.println("Número de vogais: " + numeroVogais);

        // Inverte a palavra/frase
        String textoInvertido = inverterString(texto);
        System.out.println("String invertida: " + textoInvertido);

        // Verifica se a palavra/frase é um palíndromo (igual de trás pra frente)
        if (ehPalindromo(texto)) {
            System.out.println("A string é um palíndromo.");
        } else {
            System.out.println("A string não é um palíndromo.");
        }

        scanner.close(); // Fecha a "caixinha" pra não gastar memória à toa
    }

    // Método pra contar as vogais
    public static int contarVogais(String texto) {
        int contador = 0; // Começa o contador zerado
        String vogais = "aeiouAEIOU"; // Todas as vogais que o programa vai procurar

        // Passa por cada letra da palavra/frase
        for (int i = 0; i < texto.length(); i++) {
            // Verifica se a letra atual é uma vogal
            if (vogais.indexOf(texto.charAt(i)) != -1) {
                contador++; // Se for, aumenta o contador
            }
        }

        return contador; // Retorna o total de vogais
    }

    // Método pra inverter a palavra/frase
    public static String inverterString(String texto) {
        // Usa uma ferramenta do Java pra inverter a palavra/frase
        return new StringBuilder(texto).reverse().toString();
    }

    // Método pra verificar se é um palíndromo
    public static boolean ehPalindromo(String texto) {
        // Inverte a palavra/frase usando o método de inverter
        String textoInvertido = inverterString(texto);
        // Compara a palavra/frase original com a invertida (ignorando maiúsculas/minúsculas)
        return texto.equalsIgnoreCase(textoInvertido);
    }
}