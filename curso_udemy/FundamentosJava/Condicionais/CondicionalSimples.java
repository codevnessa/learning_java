package FundamentosJava.Condicionais;

// Explicação do conteúdo:
// A condicional simples (if) é usada para executar um bloco de código apenas se uma condição for verdadeira.

public class CondicionalSimples {
    public static void main(String[] args) {
        int numero = 10;

        // Condicional Simples (if)
        if (numero > 0) {
            System.out.println("O número é positivo."); // Executado se a condição for verdadeira
        }
    }
}

// Explicação do código:

// O código verifica se a variável numero é maior que 0
// Se a condição for verdadeira, imprime "O número é positivo."
// Caso contrário, o bloco de código dentro do if é ignorado

//  Pode ser usado para validar entradas de usuário, como verificar se um valor é válido antes de processá-lo
