package HerancaPolimorfismo;

// Classe base Animal
class Animal {
    private String nome;

    // Construtor
    public Animal(String nome) {
        this.nome = nome;
    }

    // Método para emitir som (será sobrescrito nas classes derivadas)
    public void emitirSom() {
        System.out.println("O animal emite um som.");
    }

    // Getter para o nome
    public String getNome() {
        return nome;
    }
}

// Classe derivada Cachorro
class Cachorro extends Animal {
    // Construtor
    public Cachorro(String nome) {
        super(nome); // Chama o construtor da classe base
    }

    // Sobrescreve o método emitirSom
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " diz: Au Au!");
    }
}

// Classe derivada Gato
class Gato extends Animal {
    // Construtor
    public Gato(String nome) {
        super(nome); // Chama o construtor da classe base
    }

    // Sobrescreve o método emitirSom
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " diz: Miau!");
    }
}

// Classe principal para testar o código
public class HerancaPolimorfismoExemplo {
    public static void main(String[] args) {
        // Criando objetos das classes derivadas
        Animal cachorro = new Cachorro("Rex");
        Animal gato = new Gato("Mimi");

        // Usando polimorfismo para chamar o método emitirSom
        cachorro.emitirSom(); // Rex diz: Au Au!
        gato.emitirSom();     // Mimi diz: Miau!

        // Criando uma lista de animais
        Animal[] animais = { new Cachorro("Bob"), new Gato("Luna"), new Cachorro("Max") };

        // Iterando sobre a lista e chamando emitirSom
        System.out.println("\nSons dos animais na lista:");
        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}
