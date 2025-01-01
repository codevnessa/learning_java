package Exercicios.Employees.application;

import java.util.Locale;
import java.util.Scanner;
import Exercicios.Employees.entities.Employee;
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        // Cria um objeto Scanner para ler os dados do teclado
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Nome: ");
            String name = sc.nextLine();

            System.out.println("Salário Bruto: R$");
            double grossSalary = sc.nextDouble();

            System.out.println("Imposto: ");
            double tax = sc.nextDouble();

            Employee emp = new Employee(name, grossSalary, tax);

            System.out.println();
            System.out.println("Funcionário: \n"+emp);
            System.out.println();

            System.out.println("Qual a porcentagem de aumento do salário? %");
            double percentage = sc.nextDouble();

            emp.increaseSalary(percentage);

            System.out.println();
            System.out.println("Dados do funcionário atualizadas: \n"+emp);
            System.out.println();
        } catch (Exception e){
            System.out.println("Erro inesperado: " + e.getMessage());
        }}}