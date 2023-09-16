
package com.mycompany.empresa;


public class Empresa {

    public static void main(String[] args) {
        
       import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Funcionario {
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String setor;

    public Funcionario(String nome, String cpf, String endereco, String telefone, String setor) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.setor = setor;
    }

    public abstract double calcularSalario();

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("Setor: " + setor);
    }

    public void aplicarAumento(double percentualAumento) {
        // Implemente o aumento de salário aqui de acordo com o tipo de funcionário.
    }
}

class Assalariado extends Funcionario {
    private double salarioMensal;

    public Assalariado(String nome, String cpf, String endereco, String telefone, String setor, double salarioMensal) {
        super(nome, cpf, endereco, telefone, setor);
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularSalario() {
        return salarioMensal;
    }
}

class Horista extends Funcionario {
    private double horasTrabalhadas;
    private double valorHora;

    public Horista(String nome, String cpf, String endereco, String telefone, String setor, double horasTrabalhadas, double valorHora) {
        super(nome, cpf, endereco, telefone, setor);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorHora;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();

        for (int i = 0; i < 3; i++) { // Permitindo até 3 funcionários para simplificar a demonstração.
            System.out.println("Digite o tipo do funcionário (Assalariado/Horista):");
            String tipo = scanner.next();

            System.out.println("Digite o nome:");
            String nome = scanner.next();

            System.out.println("Digite o CPF:");
            String cpf = scanner.next();

            System.out.println("Digite o endereço:");
            String endereco = scanner.next();

            System.out.println("Digite o telefone:");
            String telefone = scanner.next();

            System.out.println("Digite o setor:");
            String setor = scanner.next();

            if (tipo.equalsIgnoreCase("Assalariado")) {
                System.out.println("Digite o salário mensal:");
                double salarioMensal = scanner.nextDouble();
                funcionarios.add(new Assalariado(nome, cpf, endereco, telefone, setor, salarioMensal));
            } else if (tipo.equalsIgnoreCase("Horista")) {
                System.out.println("Digite as horas trabalhadas:");
                double horasTrabalhadas = scanner.nextDouble();
                System.out.println("Digite o valor da hora:");
                double valorHora = scanner.nextDouble();
                funcionarios.add(new Horista(nome, cpf, endereco, telefone, setor, horasTrabalhadas, valorHora));
            }
        }

        System.out.println("Dados dos funcionários:");
        for (Funcionario funcionario : funcionarios) {
            funcionario.mostrarDados();
            System.out.println("Salário: " + funcionario.calcularSalario());
            System.out.println();
        }

        System.out.println("Digite o percentual de aumento:");
        double percentualAumento = scanner.nextDouble();
        for (Funcionario funcionario : funcionarios) {
            funcionario.aplicarAumento(percentualAumento);
        }

        System.out.println("Dados dos funcionários após o aumento:");
        for (Funcionario funcionario : funcionarios) {
            funcionario.mostrarDados();
            System.out.println("Salário após aumento: " + funcionario.calcularSalario());
            System.out.println();
        }

        scanner.close();
    }
}

  