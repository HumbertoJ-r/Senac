
package atividade4;

import java.util.Scanner;

public class Atividade4 {
 
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);

        char saida = 'S';
        String[] nome = new String[15];
        String pesquisar, sair;
        char opcao = ' ';
        int i = 0;
        boolean encontrado = false;

        while (saida == 'S') {
            System.out.println("\n1 - Cadastrar");
            System.out.println("2 - Pesquisar");
            System.out.println("3 - Sair");

            System.out.println("\nDigite o numero da Opcao desejada: ");
            opcao = entrada.next().charAt(0);
            entrada.nextLine(); // Consumir a quebra de linha

            if (opcao == '1') {
                System.out.println("\nDigite o nome do hospede: ");
                nome[i] = entrada.nextLine();
                i++;
                System.out.println("\nNome cadastrado com sucesso!!!");
            } else if (opcao == '2') {
                System.out.println("\nDigite o nome do hospede desejado aqui: ");
                pesquisar = entrada.nextLine();
                encontrado = false;

                for (int linha = 0; linha < 15; linha++) {
                    if (nome[linha] != null && nome[linha].equals(pesquisar)) {
                        System.out.println("\nHospede " + nome[linha] + " encontrado");
                        encontrado = true;
                    }
                }

                if (!encontrado) {
                    System.out.println("\nHospede " + pesquisar + " nao encontrado");
                }
            } else if (opcao == '3') {
                System.out.println("\nDeseja sair do programa. S/N: ");
                sair = entrada.nextLine();
                if (sair.toUpperCase().equals("S")) {
                    saida = 'N';
                }
            } else {
                System.out.println("\nOpcao invalida.");
            }
        }

        entrada.close();
    }
}

    

