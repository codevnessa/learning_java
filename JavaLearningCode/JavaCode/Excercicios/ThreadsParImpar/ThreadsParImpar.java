package ThreadsParImpar;

public class ThreadsParImpar {

    // Objeto usado para sincronização
    private static final Object lock = new Object();
    private static int contador = 1;
    private static final int LIMITE = 20; // Limite de números a serem impressos

    public static void main(String[] args) {
        // Cria as threads
        Thread threadPar = new Thread(() -> imprimirPares());
        Thread threadImpar = new Thread(() -> imprimirImpares());

        // Inicia as threads
        threadPar.start();
        threadImpar.start();
    }

    // Método para imprimir números pares
    private static void imprimirPares() {
        synchronized (lock) {
            while (contador <= LIMITE) {
                // Verifica se o número atual é par
                if (contador % 2 == 0) {
                    System.out.println("Par: " + contador);
                    contador++;
                    lock.notify(); // Notifica a outra thread
                } else {
                    try {
                        lock.wait(); // Espera até ser notificado
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    // Método para imprimir números ímpares
    private static void imprimirImpares() {
        synchronized (lock) {
            while (contador <= LIMITE) {
                // Verifica se o número atual é ímpar
                if (contador % 2 != 0) {
                    System.out.println("Ímpar: " + contador);
                    contador++;
                    lock.notify(); // Notifica a outra thread
                } else {
                    try {
                        lock.wait(); // Espera até ser notificado
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
