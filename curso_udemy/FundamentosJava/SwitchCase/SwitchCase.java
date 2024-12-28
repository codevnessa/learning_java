package FundamentosJava.SwitchCase;
// Explicação do conteúdo:
// O switch case é usado para selecionar um bloco de código a ser executado com base no valor de uma variável.

public class SwitchCase {
    public static void main(String[] args) {
        int diaDaSemana = 3;

        // switch case
        switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo"); // Executado se diaDaSemana for 1
                break;
            case 2:
                System.out.println("Segunda-feira"); // Executado se diaDaSemana for 2
                break;
            case 3:
                System.out.println("Terça-feira"); // Executado se diaDaSemana for 3
                break;
            default:
                System.out.println("Dia inválido"); // Executado se nenhum caso corresponder
        }
    }
}

// Explicação do código:
// 
// O código verifica o valor da variável diaDaSemana e imprime o dia correspondente
// Se o valor não corresponder a nenhum caso, imprime "Dia inválido."

//Ideal para situações com múltiplas opções, como menus ou seleção de categorias