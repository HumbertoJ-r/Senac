package com.mycompany.exemploatividade3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 abstract class funcionario {
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String setor;

    public funcionario(String nome, String cpf, String endereco, String telefone, String setor) {
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

