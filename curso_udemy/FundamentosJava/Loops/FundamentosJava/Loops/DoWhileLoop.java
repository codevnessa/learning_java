package FundamentosJava.Loops;

// Explicação do conteúdo:
// O loop do-while é semelhante ao while, mas garante que o bloco de código seja executado pelo menos uma vez, mesmo que a condição seja falsa.

public class DoWhileLoop {
    public static void main(String[] args) {
        int contador = 0;

        // Executa o bloco pelo menos uma vez
        do {
            System.out.println("Contador: " + contador); // Executado pelo menos uma vez
            contador++; // Incrementa o contador
        } while (contador < 3); // Verifica a condição após a execução do bloco

        // Explicação do código:
        // O bloco de código dentro do 'do' é executado primeiro. Após a execução, a condição 'contador < 3' é verificada.
        // Se a condição for verdadeira, o bloco é repetido. Caso contrário, o loop é encerrado.
    }
}