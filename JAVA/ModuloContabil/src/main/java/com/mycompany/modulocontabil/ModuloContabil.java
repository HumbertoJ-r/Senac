
package com.mycompany.modulocontabil;

import java.util.Scanner;

public class ModuloContabil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome da empresa: ");
        String nomeEmpresa = scanner.nextLine();
        Pagamentos pagamentos = new Pagamentos(nomeEmpresa);

        while (true) {
            System.out.print("Digite o tipo de imposto (PIS ou IPI) ou 'pare' para encerrar: ");
            String tipoImposto = scanner.nextLine();
            
            if (tipoImposto.equalsIgnoreCase("pare")) {
                break;
            }
            
            if (tipoImposto.equalsIgnoreCase("PIS")) {
                System.out.print("Digite o valor do débito: ");
                double debito = scanner.nextDouble();
                System.out.print("Digite o valor do crédito: ");
                double credito = scanner.nextDouble();
                System.out.print("Digite a alíquota do PIS: ");
                double aliquotas = scanner.nextDouble();
                scanner.nextLine(); // Consumir a quebra de linha
                
                PIS pis = new PIS(aliquotas, debito, credito);
                pagamentos.cadastrarImposto(pis);
            } else if (tipoImposto.equalsIgnoreCase("IPI")) {
                System.out.print("Digite o valor da base de cálculo: ");
                double baseCalculo = scanner.nextDouble();
                System.out.print("Digite a alíquota do IPI: ");
                double aliquotas = scanner.nextDouble();
                scanner.nextLine(); // Consumir a quebra de linha
                
                IPI ipi = new IPI(aliquotas, baseCalculo);
                pagamentos.cadastrarImposto(ipi);
            } else {
                System.out.println("Tipo de imposto inválido. Tente novamente.");
            }
        }

        pagamentos.calcularImpostos();
    
    }
}
