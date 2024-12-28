package FundamentosJava.Condicionais;

// Explicação do conteúdo:
// A condição ternária é uma forma abreviada de escrever uma condicional if-else em uma única linha.

public class CondicaoTernaria {
    public static void main(String[] args) {
        int numero = 10;

        // Condição Ternária
        String resultado = (numero > 0) ? "Positivo" : "Negativo ou zero"; // Atribui o valor com base na condição
        System.out.println("Resultado: " + resultado); // Exibe o resultado
    }
}

// Explicação do código:

// O código verifica se a variável numero é positiva. 
// Se for verdadeiro, atribui "Positivo" à variável resultado 
// Caso contrário, atribui "Negativo ou zero." O resultado é então exibido.

//  Ideal para simplificar atribuições condicionais, como definir valores padrão ou mensagens.