package FundamentosJava.ExemplosPraticos;

import java.util.Scanner;

public class VerificaAprovacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;
        System.out.println("Qual a sua nota? ");
        
        if(sc.hasNextDouble()){
            nota = sc.nextDouble();

            if(nota >= 0 && nota <= 10){

                if(nota >= 7){
                    System.out.println("Aprovado");
                }else{
                    System.out.println("Reprovado");
                }
            }else{
                System.out.println("Nota inválida. O valor digitado não confere!");
            }
        }else{
            System.out.println("ERRO: Entrada Invalida");
        }
        sc.close();
    }
}
