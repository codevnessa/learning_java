package StreamsLamba;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsLambdaExemplo {

    public static void main(String[] args) {
        // Lista de números
        List<Integer> numeros = Arrays.asList(10, 5, 8, 20, 3, 15, 7, 12);

        // 1. Filtrar os números pares
        List<Integer> numerosPares = numeros.stream()
                .filter(n -> n % 2 == 0) // Filtra os números pares
                .collect(Collectors.toList()); // Coleta os resultados em uma lista

        System.out.println("Números pares: " + numerosPares);

        // 2. Calcular a soma dos números restantes (neste caso, os pares)
        int soma = numerosPares.stream()
                .mapToInt(Integer::intValue) // Converte para um IntStream
                .sum(); // Calcula a soma

        System.out.println("Soma dos números pares: " + soma);

        // 3. Ordenar a lista em ordem decrescente
        List<Integer> numerosOrdenados = numeros.stream()
                .sorted((n1, n2) -> n2.compareTo(n1)) // Ordena em ordem decrescente
                .collect(Collectors.toList()); // Coleta os resultados em uma lista

        System.out.println("Lista ordenada em ordem decrescente: " + numerosOrdenados);
    }
}