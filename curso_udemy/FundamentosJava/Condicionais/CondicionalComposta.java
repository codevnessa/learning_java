package FundamentosJava.Condicionais;

// Explicação do conteúdo:
// A condicional composta (if-else) é usada para executar um bloco de código se a condição for verdadeira e outro bloco se for falsa.

public class CondicionalComposta {
    public static void main(String[] args) {
        int numero = 10;

        // Condicional Composta (if-else)
        if (numero % 2 == 0) {
            System.out.println("O número é par."); // Executado se a condição for verdadeira
        } else {
            System.out.println("O número é ímpar."); // Executado se a condição for falsa
        }
    }
}

// Explicação do código:

// O código verifica se a variável numero é par
// Se a condição for verdadeira, imprime "O número é par
// Caso contrário, imprime "O número é ímpar."

// Útil para tomar decisões com base em condições, como classificar dados ou validar estados


