package projetolancheria;

import classes.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Comanda comanda1 = new Comanda();
        String resposta = "s";
        
        do {
            System.out.println("Informe o nome do produto:");
            String nome = scanner.nextLine();

            System.out.println("Informe a descrição do produto:");
            String descricao = scanner.nextLine();

            System.out.println("Informe o valor do produto:");
            double valor = scanner.nextDouble();

            // Criamos o produto
            Produto prod = new Produto(nome, descricao, valor);

            System.out.println("Informe a quantidade desejada:");
            int quantidade = scanner.nextInt();
            scanner.nextLine();
            // Adicionar ao pedido
            Pedido pedido = new Pedido(prod, quantidade);
            System.out.println("Total do pedido: R$" + pedido.calcularTotal());

            comanda1.AdicionarNaLista(pedido);
            
            System.out.println("Deseja continuar? (s/n)");           
            resposta = scanner.nextLine();
            

        } while (resposta.equals("s"));
        
        comanda1.ListarPedidos();
    }
    
}
