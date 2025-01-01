package Exercicios.Employees.entities;

public class Employee {
    // Atributos(informações do funcionario)
    private String name; // Nome do funcionario
    private double grossSalary; // Salario Bruto
    private double tax; // Imposto sobre o salário

    // Construtor (metodo especial, para criar um funcionario)
    public Employee(String name, double grossSalary, double tax){
        this.name = name; 
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    // Métodos para acessar e modificar os atributos (getters e setters)
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name; // Define um novo nome para o funcionário
    }    
    public double getGrossSalary(){
        return grossSalary;
    }
    
    public void setGrossSalary(double grossSalary){
        if (grossSalary >= 0){
            this.grossSalary = grossSalary;
        }else{
            System.out.println("Erro: O salário bruto não pode ser negativo");
        }
    }

    public double getTax() {
        return tax; // Retorna o valor do imposto
    }
    public void setTax(double tax) {
        if (tax >= 0) { // Verifica se o imposto é válido (não pode ser negativo)
            this.tax = tax;
        } else {
            System.out.println("Erro: O imposto não pode ser negativo.");
        }
    }

    public double netSalary(){
        return grossSalary - tax;
    }
    
    public void increaseSalary(double percentage){
        if (percentage >= 0){
            grossSalary += grossSalary * percentage / 100;
        }else{
            System.out.println("Erro: A porcentagem de aumento nao pode ser negativa!");
        }
    }

    // Quando você cria uma classe que herda de outra classe ou implementa uma interface,
    // pode sobrescrever métodos existentes. 
    // O @Override é usado para marcar esses métodos.
    @Override // Sempre usar pra evitar erros e deixar o codigo mais facil e claro de entender
    public String toString(){
        return "Nome: " + name + "\n"
                + "Salário Bruto: R$" + String.format("%.2f", grossSalary) + "\n"
                + "Imposto: R$" + String.format("%.2f",tax)+ "\n"
                + "Salário Liquido : R$" + String.format("%.2f", netSalary());
    }
}


    