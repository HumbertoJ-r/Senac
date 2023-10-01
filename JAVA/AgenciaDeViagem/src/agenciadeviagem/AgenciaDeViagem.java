package agenciadeviagem;

import java.util.Scanner;
import agenciadeviagem.Hospedagem;
import agenciadeviagem.PacoteDeViagem;
import agenciadeviagem.Venda;

public class AgenciaDeViagem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do Cliente");
        String nomeCliente = scanner.nextLine();

        System.out.println("Informe o tipo de transporte: ");
        String tipo = scanner.nextLine();

        System.out.println("Informe o valor do Transporte: ");
        double valor = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Destino: ");
        String destino = scanner.nextLine();

        System.out.println("Digite a descricao da hospedagem: ");
        String descricao = scanner.nextLine();

        System.out.println("Digite o valor da diaria: ");
        double valorDiaria = scanner.nextDouble();

        System.out.println("Digite quantidade de dias: ");
        int quantDeDias = scanner.nextInt();

        System.out.println("Digite a forma de pagamento: ");
        String formaDePagamento = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Informe a margem de lucro: ");
        double margemLucro = scanner.nextDouble();

        System.out.println("Informe o valor da taxa de servico:");
        double taxasAdicionais = scanner.nextDouble();

        Transporte transporte = new Transporte(tipo, valor);
        Hospedagem hosp = new Hospedagem(descricao, valorDiaria);
        PacoteDeViagem pacote = new PacoteDeViagem(transporte, hosp, destino, quantDeDias, margemLucro, taxasAdicionais);
        Venda venda = new Venda(nomeCliente, formaDePagamento, pacote);

        System.out.println("=========================================");
        System.out.println("Aqui estao as informacoes do seu pacote: ");
        System.out.println("========================================:");
        scanner.nextLine();
        System.out.println("Nome: " + nomeCliente);
        System.out.println("Destino: " + destino);
        System.out.println("Hospedagem: " + descricao);
        System.out.println("Quantidade de dias: " + quantDeDias);
        System.out.println("valor diaria: " + valorDiaria);
        System.out.println("Tipo de transporte: " + tipo);
        System.out.println("Valor Transporte: " + valor);
        System.out.println("Taxa de servico: " + taxasAdicionais);
        System.out.println("Margem de Lucro: " + margemLucro);
        System.out.println("Forma de Pagamento " + formaDePagamento);
        System.out.println("========================================: ");

        venda.mostrarInformacoesPte();
        
    }

}
