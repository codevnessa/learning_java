package FundamentosJava.Loops;

// Explicação do conteúdo:
// O loop while executa um bloco de código repetidamente enquanto uma condição for verdadeira.

public class WhileLoop{
    public static void main(String[] args) {
        int contador = 0;

        // while
        while (contador < 3) {
            System.out.println("Contador: " + contador); // Executado enquanto a condição for verdadeira
            contador++; // Incrementa o contador para evitar loop infinito
        }
    }
}

// Explicação do código:

// O código executa um bloco de código enquanto a variável contador for menor que 3
// A cada iteração, o valor do contador é incrementado e exibido

// Útil para repetir tarefas, como processar itens de uma lista ou aguardar uma condição específica
