package Carro;
public class Carro {
    // Atributos da classe
    private String marca;
    private String modelo;
    private int ano;
    private double velocidade; // Velocidade em km/h

    // Construtor para inicializar os atributos
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0; // O carro começa parado
    }

    // Método para acelerar o carro
    public void acelerar(double incremento) {
        if (incremento > 0) {
            this.velocidade += incremento;
            System.out.println("Acelerando... Velocidade atual: " + this.velocidade + " km/h");
        } else {
            System.out.println("O incremento deve ser positivo.");
        }
    }

    // Método para frear o carro
    public void frear(double decremento) {
        if (decremento > 0) {
            if (this.velocidade - decremento >= 0) {
                this.velocidade -= decremento;
                System.out.println("Freando... Velocidade atual: " + this.velocidade + " km/h");
            } else {
                this.velocidade = 0;
                System.out.println("O carro parou completamente.");
            }
        } else {
            System.out.println("O decremento deve ser positivo.");
        }
    }

    // Método para exibir as informações do carro
    public void exibirInformacoes() {
        System.out.println("\nInformações do Carro:");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Velocidade atual: " + this.velocidade + " km/h");
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        // Criando um objeto Carro
        Carro meuCarro = new Carro("Toyota", "Corolla", 2022);

        // Exibindo informações iniciais
        meuCarro.exibirInformacoes();

        // Acelerando o carro
        meuCarro.acelerar(50);
        meuCarro.acelerar(30);

        // Freando o carro
        meuCarro.frear(20);
        meuCarro.frear(70);

        // Exibindo informações finais
        meuCarro.exibirInformacoes();
    }
}