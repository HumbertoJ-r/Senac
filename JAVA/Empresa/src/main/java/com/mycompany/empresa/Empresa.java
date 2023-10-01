
package com.mycompany.empresa;

import java.util.ArrayList;
import java.util.Scanner;


public class Empresa {

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

  