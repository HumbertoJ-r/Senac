package novabelo;


import java.util.Scanner;

public class NovaBelo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String resposta;
        boolean rodando = true;
        

        while (rodando) {
            System.out.println("=================== TELA INICIAL ===================");
            System.out.println("[1] Cadastrar Cliente");
            System.out.println("[2] Listar todos usuarios clientes cadastrados");
            System.out.println("[3] Procurar usuario por nome");
            System.out.println("[4] Sair");
            System.out.println("Digite a opcao: ");
            String opcao = scanner.nextLine();

            switch (opcao) { 

                case "1": {

                    Cliente cliente = new Cliente();
                    System.out.println("=========== Cadastro de Cliente ===========");
                    System.out.println("Nome: ");
                    cliente.setNome(scanner.nextLine());
                    System.out.println("CPF: ");
                    cliente.setCpf(scanner.nextLine());
                    System.out.println("Endereco: ");
                    cliente.setEndereco(scanner.nextLine());
                    System.out.println("Data de Nascimento: ");
                    cliente.setDataNasc(scanner.nextLine());

                    System.out.println("\nEscolha a Categoria de Habilitacao:");
                    System.out.println("A - R$1400");
                    System.out.println("B - R$1500");
                    System.out.println("Categoria (A/B): ");
                    cliente.setCategoria(scanner.nextLine());
                    cliente.setCategoria(cliente.getCategoria());

                    if (cliente.getCategoria().equalsIgnoreCase("A")) {
                        cliente.setPreco(1400.00);
                    } else if (cliente.getCategoria().equalsIgnoreCase("B")) {
                        cliente.setPreco(1500.00);
                    } else {
                        System.out.println("Categoria invalida!");
                        return;
                    }
                    ListaCliente.lista.add(cliente);
                    break;
                }

                case "2": {
                    System.out.println("=========== Lista de Clientes cadastrados! ===========");

                    for (Cliente cliente : ListaCliente.listar()) {

                        System.out.println("Cliente:");
                        System.out.println("Nome: " + cliente.getNome());
                        System.out.println("CPF: " + cliente.getCpf());
                        System.out.println("Endereco: " + cliente.getEndereco());
                        System.out.println("Data de Nascimento: " + cliente.getDataNasc());
                        System.out.println("Categoria de Habilitacao: " + cliente.getCategoria());
                        System.out.println("Preco: R$" + cliente.getPreco());
                        System.out.println();
                    }
                    break;
                }

                case "3": {
                    System.out.println("=========== Procurar Cliente ===========");
                    System.out.println("Digite o nome do cliente: ");
                    String nomeProcurado = scanner.nextLine();

                    boolean clienteEncontrado = false;
                    for (Cliente cliente : ListaCliente.listar()) {
                        if (cliente.getNome().equalsIgnoreCase(nomeProcurado)) {
                            clienteEncontrado = true;
                            System.out.println("Cliente encontrado!!!");
                            System.out.println("\nNome: " + cliente.getNome());
                            System.out.println("CPF: " + cliente.getCpf());
                            System.out.println("Endereco: " + cliente.getEndereco());
                            System.out.println("Data de Nascimento: " + cliente.getDataNasc());
                            System.out.println("Categoria de Habilitacao: " + cliente.getCategoria());

                            System.out.println("Preco: R$" + cliente.getPreco());
                            System.out.println();
                        }

                        if (!clienteEncontrado) {
                            System.out.println("Cliente nao encontrado!!!");
                        }

                    }
                    break;

                }
                case "4": {
                    rodando = false;
                    break;
                }
                
                default: {
                    System.out.println("Opcao invalida! Por favor, digite um numero de 1 a 4.");
                }
            }

        }

    }
}
