
package agenciadeviagem;

import java.util.Scanner;
import agenciadeviagem.Hospedagem;
import agenciadeviagem.PacoteDeViagem;



public class AgenciaDeViagem {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
       // Scanner scanner = new Scanner (System.in);
       // System.out.println("Digite o nome do Cliente");
       // String nomeCliente = scanner.nextLine();
         
        
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
        
       // System.out.println("Digite a forma de pagamento: ");
       // String formaDePagamento = scanner.nextLine();
       // scanner.nextLine();
       Transporte transporte = new Transporte (tipo, valor);
       Hospedagem hosp = new Hospedagem (descricao, valorDiaria); 
       PacoteDeViagem pacote = new PacoteDeViagem (transporte,  hosp,  destino, quantDeDias);
        
       
        System.out.println(pacote.calcularHospedagem());
        
        
        
        
        
        
        
        
        
    }
    
}
