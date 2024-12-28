package FundamentosJava.Condicionais;


// Explicação do conteúdo:
// O encadeamento (if-else if-else) permite testar múltiplas condições em sequência. O bloco correspondente à primeira condição verdadeira é executado.

public class Encadeamento {
    public static void main(String[] args) {
        int numero = 10;

        // Encadeamento (if-else if-else)
        if (numero > 0) {
            System.out.println("O número é positivo."); // Executado se a primeira condição for verdadeira
        } else if (numero < 0) {
            System.out.println("O número é negativo."); // Executado se a segunda condição for verdadeira
        } else {
            System.out.println("O número é zero."); // Executado se nenhuma das condições anteriores for verdadeira
        }
    }
}

// Explicação do código:

// O código verifica se a variável numero é positiva, negativa ou zero
// Imprime a mensagem correspondente à primeira condição verdadeiro

// Pode ser usado para classificar valores em categorias, como faixas de idade ou notas
