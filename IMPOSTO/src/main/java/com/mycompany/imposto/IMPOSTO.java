

package com.mycompany.imposto;


public class IMPOSTO {

    public static void main(String[] args) {
        // Interface para todos os impostos
interface Imposto {
    double calcularImposto();
    String getDescricao();
}

// Classe abstrata para impostos com alíquota variável
abstract class ImpostoComAlquotaVariavel implements Imposto {
    private double alquota;

    public ImpostoComAlquotaVariavel(double alquota) {
        this.alquota = alquota;
    }

    public double getAlquota() {
        return alquota;
    }
}

// Classe para o imposto PIS
class PIS extends ImpostoComAlquotaVariavel {
    private double debito;
    private double credito;

    public PIS(double alquota, double debito, double credito) {
        super(alquota);
        this.debito = debito;
        this.credito = credito;
    }

    @Override
    public double calcularImposto() {
        return (debito - credito) * getAlquota() / 100;
    }

    @Override
    public String getDescricao() {
        return "PIS";
    }
}

// Classe para o imposto IPI
class IPI extends ImpostoComAlquotaVariavel {
    private double baseCalculo;

    public IPI(double alquota, double baseCalculo) {
        super(alquota);
        this.baseCalculo = baseCalculo;
    }

    @Override
    public double calcularImposto() {
        return baseCalculo * getAlquota() / 100;
    }

    @Override
    public String getDescricao() {
        return "IPI";
    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Pagamentos {
    private String nomeEmpresa;
    private List<Imposto> impostos = new ArrayList<>();

    public Pagamentos(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public void cadastrarImposto(Imposto imposto) {
        impostos.add(imposto);
    }

    public void calcularImpostos() {
        System.out.println("Resumo de Impostos para " + nomeEmpresa + ":");
        for (Imposto imposto : impostos) {
            System.out.println(imposto.getDescricao() + ": R$" + imposto.calcularImposto());
        }
    }

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
                double alquota = scanner.nextDouble();
                scanner.nextLine(); // Consumir a quebra de linha
                
                PIS pis = new PIS(alquota, debito, credito);
                pagamentos.cadastrarImposto(pis);
            } else if (tipoImposto.equalsIgnoreCase("IPI")) {
                System.out.print("Digite o valor da base de cálculo: ");
                double baseCalculo = scanner.nextDouble();
                System.out.print("Digite a alíquota do IPI: ");
                double alquota = scanner.nextDouble();
                scanner.nextLine(); // Consumir a quebra de linha
                
                IPI ipi = new IPI(alquota, baseCalculo);
                pagamentos.cadastrarImposto(ipi);
            } else {
                System.out.println("Tipo de imposto inválido. Tente novamente.");
            }
        }

        pagamentos.calcularImpostos();
        scanner.close();
    }
}

    }
}
