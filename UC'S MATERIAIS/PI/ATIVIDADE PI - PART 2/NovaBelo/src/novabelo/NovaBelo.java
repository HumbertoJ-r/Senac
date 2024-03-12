package novabelo;

import java.util.Iterator;
import java.util.Scanner;

public class NovaBelo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String resposta;
        boolean rodando = true;
        PrimeiraHabilitacao habilitacao = new PrimeiraHabilitacao();
        Cliente cliente = new Cliente();

        while (rodando) {
            System.out.println("[1] Cadastrar Cliente");
            System.out.println("[2] Listar todos usuários clientes cadastrados");
            System.out.println("[3] Procurar usuário por nome");
            System.out.println("[4] Sair");
            System.out.println("Digite a opção: ");
            String opcao = scanner.nextLine();

            switch (opcao) {

                case "1": {
                    

                    System.out.println("Cadastro de Cliente");
                    System.out.print("Nome: ");
                    cliente.setNome(scanner.nextLine());
                    System.out.print("CPF: ");
                    cliente.setCpf(scanner.nextLine());
                    System.out.print("Endereco: ");
                    cliente.setEndereco(scanner.nextLine());
                    System.out.print("Data de Nascimento: ");
                    cliente.setDataNasc(scanner.nextLine());

                    
                    System.out.println("\nEscolha a Categoria de Habilitacao:");
                    System.out.println("A - R$1400");
                    System.out.println("B - R$1500");
                    System.out.print("Categoria (A/B): ");
                    String categoria = scanner.nextLine();
                    habilitacao.setCategoria(categoria);
                    
                    if (categoria.equalsIgnoreCase("A")) {
                        habilitacao.setPreco(1400);
                    } else if (categoria.equalsIgnoreCase("B")) {
                        habilitacao.setPreco(1500);
                    } else {
                        System.out.println("Categoria inválida!");
                        return;
                    }
                    ListaCliente.lista.add(cliente);
                    break;
                }

                case "2": {
                for (Iterator<Cliente> it = ListaCliente.listar().iterator(); it.hasNext();) {
                    System.out.println("Cliente:");
                    System.out.println("Nome: " + cliente.getNome());
                    System.out.println("CPF: " + cliente.getCpf());
                    System.out.println("Endereco: " + cliente.getEndereco());
                    System.out.println("Data de Nascimento: " + cliente.getDataNasc());
                    System.out.println("Categoria de Habilitacao: " + habilitacao.getCategoria());
                    System.out.println("Preco: R$" + habilitacao.getPreco());
                }
                }
                break;
                
                case "3": { 
                    
                    String cliente.setNome = scanner.nextLine();
                    for (int i = 0; i < cliente.getNome.size(); i++){
                }


                    break;
                }
                
                case "4": {
                    break;
                }

            }

        }

    }
}
