package FundamentosJava.Loops;

// Explicação do conteúdo:
// O loop for é usado para repetir um bloco de código um número específico de vezes. Ele combina inicialização, condição e incremento em uma única linha.

public class ForLoop {
    public static void main(String[] args) {

        // Repete o bloco 5 vezes
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteração: " + i); // Executado enquanto a condição for verdadeira
        }

        // Explicação do código:
        // O loop 'for' inicia com a inicialização da variável 'i' (int i = 0).
        // Em seguida, verifica a condição 'i < 5'. Se for verdadeira, o bloco de código é executado.
        // Após cada iteração, o valor de 'i' é incrementado (i++).
        // O loop continua até que a condição 'i < 5' seja falsa.
    }
}
