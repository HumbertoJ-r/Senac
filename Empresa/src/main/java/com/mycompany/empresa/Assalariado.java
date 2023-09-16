
package com.mycompany.empresa;

import java.util.Scanner;


public class Assalariado implements Funcionarios {

    private String Nome;
    private String Cpf;
    private String Endereco;
    private String Telefone;

    public Assalariado(String Nome, String Cpf, String Endereco, String Telefone) {
        this.Nome = Nome;
        this.Cpf = Cpf;
        this.Endereco = Endereco;
        this.Telefone = Telefone;
    }
    
    public Assalariado (){

    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
    
    Scanner scanner = new Scanner(System.in);
    
    
    @Override
    public void Cadastrar() {
        System.out.println("Digite o nome do Funionario: ");
        String.nome = scanner.nextLine();
        System.out.println("Digite o CPF do Funionario: ");
        String.cpf = scanner.nextLine();
        System.out.println("Digite o endereco do Funionario: ");
        String.endereco = scanner.nextLine();
        System.out.println("Digite o telefone do Funionario: ");
        String.telefone = scanner.nextLine();
        
    }

    @Override
    public void Salario() {
        
    }

    @Override
    public void Aumento() {
        
    }

          
    }
    
     
    

