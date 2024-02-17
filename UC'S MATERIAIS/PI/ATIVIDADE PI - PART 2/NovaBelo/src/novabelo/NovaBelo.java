package novabelo;

import java.util.Scanner;


public class NovaBelo {


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        Cliente cliente = new Cliente();
        System.out.println("Cadastro de Cliente");
        System.out.print("Nome: ");
        cliente.setNome(scanner.nextLine());
        System.out.print("CPF: ");
        cliente.setCpf(scanner.nextLine());
        System.out.print("Endereco: ");
        cliente.setEndereco(scanner.nextLine());
        System.out.print("Data de Nascimento: ");
        cliente.setDataNasc(scanner.nextLine());

        PrimeiraHabilitacao habilitacao = new PrimeiraHabilitacao();
        System.out.println("\nEscolha a Categoria de Habilitacao:");
        System.out.println("A - R$1400");
        System.out.println("B - R$1500");
        System.out.print("Categoria (A/B): ");
        String categoria = scanner.nextLine();
        if (categoria.equalsIgnoreCase("A")) {
            habilitacao.setPreco(1400);
        } else if (categoria.equalsIgnoreCase("B")) {
            habilitacao.setPreco(1500);
        } else {
            System.out.println("Categoria inválida!");
            return;
        }

        System.out.println("\nResumo do Cadastro:");
        System.out.println("Cliente:");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Endereco: " + cliente.getEndereco());
        System.out.println("Data de Nascimento: " + cliente.getDataNasc());
        System.out.println("Categoria de Habilitacao: " + habilitacao.getCategoria());
        System.out.println("Preco: R$" + habilitacao.getPreco());
        
    }
    
}
