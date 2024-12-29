import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Contato {
    int id;
    String nome;
    String email;
    String telefone;

    // Construtor para inicializar um contato
    public Contato(int id, String nome, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
}

public class SistemaAgenda {

    // Variável global para gerar IDs únicos
    static int idGlobal = 90001;

    // Lista para armazenar os contatos
    static List<Contato> listaContatos = new ArrayList<>();

    // Scanner declarado como variável estática para ser compartilhado entre métodos
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("---------- SISTEMA DE GERENCIAMENTO DE AGENDA ----------");
        while (true) {
            System.out.println("\n------------------- MENU PRINCIPAL -------------------");
            System.out.println("1 - CADASTRAR CONTATO");
            System.out.println("2 - CONSULTAR CONTATO(S)");
            System.out.println("3 - REMOVER CONTATO");
            System.out.println("4 - SAIR");

            // Solicita ao usuário que escolha uma opção
            System.out.print("ESCOLHA UMA OPÇÃO (1/2/3/4): ");
            try {
                int opcao = Integer.parseInt(scanner.nextLine());

                switch (opcao) {
                    case 1:
                        cadastrarContato();
                        break;
                    case 2:
                        consultarContatos();
                        break;
                    case 3:
                        removerContato();
                        break;
                    case 4:
                        System.out.println("SAINDO DO SISTEMA...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("OPÇÃO INVÁLIDA. POR FAVOR, DIGITE UM NÚMERO VÁLIDO.\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("OPÇÃO INVÁLIDA. POR FAVOR, DIGITE UM NÚMERO VÁLIDO.\n");
            }
        }
    }

    // Função para cadastrar um novo contato
    static void cadastrarContato() {
        System.out.println("\n-------------------- CADASTRO DE CONTATO --------------------");
        System.out.println("ID DO CONTATO: " + idGlobal);

        // Solicita ao usuário que informe o nome, email e telefone
        System.out.print("DIGITE O NOME: ");
        String nome = scanner.nextLine();

        System.out.print("DIGITE O EMAIL: ");
        String email = scanner.nextLine();

        System.out.print("DIGITE O TELEFONE: ");
        String telefone = scanner.nextLine();

        // Cria um novo contato e adiciona à lista
        Contato contato = new Contato(idGlobal, nome, email, telefone);
        listaContatos.add(contato);

        System.out.println("CONTATO CADASTRADO COM SUCESSO!\n");
        idGlobal++; // Incrementa o ID global
    }

    // Função para consultar contatos
    static void consultarContatos() {
        while (true) {
            System.out.println("\n-------------------- CONSULTAR CONTATO --------------------");
            System.out.println("1 - CONSULTAR TODOS");
            System.out.println("2 - CONSULTAR POR ID");
            System.out.println("3 - CONSULTAR POR NOME");
            System.out.println("4 - RETORNAR AO MENU");

            // Solicita ao usuário que escolha uma opção
            System.out.print("ESCOLHA UMA OPÇÃO (1/2/3/4): ");
            try {
                int opcao = Integer.parseInt(scanner.nextLine());

                switch (opcao) {
                    case 1:
                        // Consulta todos os contatos
                        System.out.println("\n-------------------- TODOS OS CONTATOS --------------------");
                        for (Contato contato : listaContatos) {
                            exibirContato(contato);
                        }
                        break;
                    case 2:
                        // Consulta por ID
                        System.out.print("DIGITE O ID DO CONTATO: ");
                        try {
                            int idConsulta = Integer.parseInt(scanner.nextLine());
                            boolean encontrado = false;
                            for (Contato contato : listaContatos) {
                                if (contato.id == idConsulta) {
                                    System.out.println("\n-------------------- CONTATO ENCONTRADO --------------------");
                                    exibirContato(contato);
                                    encontrado = true;
                                    break;
                                }
                            }
                            if (!encontrado) {
                                System.out.println("CONTATO NÃO ENCONTRADO.\n");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("ID INVÁLIDO. POR FAVOR, DIGITE UM NÚMERO VÁLIDO.\n");
                        }
                        break;
                    case 3:
                        // Consulta por nome
                        System.out.print("DIGITE O NOME: ");
                        String nomeConsulta = scanner.nextLine();
                        System.out.println("\n-------------------- CONTATOS ENCONTRADOS --------------------");
                        for (Contato contato : listaContatos) {
                            if (contato.nome.equalsIgnoreCase(nomeConsulta)) {
                                exibirContato(contato);
                            }
                        }
                        break;
                    case 4:
                        // Retorna ao menu principal
                        return;
                    default:
                        System.out.println("OPÇÃO INVÁLIDA. POR FAVOR, DIGITE UM NÚMERO VÁLIDO.\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("OPÇÃO INVÁLIDA. POR FAVOR, DIGITE UM NÚMERO VÁLIDO.\n");
            }
        }
    }

    // Função para remover um contato por ID
    static void removerContato() {
        System.out.println("\n-------------------- REMOVER CONTATO --------------------");
        System.out.print("DIGITE O ID DO CONTATO A SER REMOVIDO: ");
        try {
            int idRemover = Integer.parseInt(scanner.nextLine());
            boolean removido = listaContatos.removeIf(contato -> contato.id == idRemover);

            if (removido) {
                System.out.println("CONTATO REMOVIDO COM SUCESSO.\n");
            } else {
                System.out.println("CONTATO NÃO ENCONTRADO.\n");
            }
        } catch (NumberFormatException e) {
            System.out.println("ID INVÁLIDO. POR FAVOR, DIGITE UM NÚMERO VÁLIDO.\n");
        }
    }

    // Função para exibir os detalhes de um contato
    static void exibirContato(Contato contato) {
        System.out.println("ID: " + contato.id);
        System.out.println("NOME: " + contato.nome);
        System.out.println("EMAIL: " + contato.email);
        System.out.println("TELEFONE: " + contato.telefone);
        System.out.println("--------------------------------------------------");
    }
}