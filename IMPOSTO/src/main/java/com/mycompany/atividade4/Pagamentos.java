
package com.mycompany.atividade4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pagamentos {
    

    private String nomeEmpresa;
    private List<Impostos> impostos = new ArrayList<>();

    public Pagamentos(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public void cadastrarImposto(Impostos imposto) {
        impostos.add(imposto);
    }

    public void calcularImpostos() {
        System.out.println("Resumo de Impostos para " + nomeEmpresa + ":");
        for (Impostos imposto : impostos) {
            System.out.println(imposto.getDescricao() + ": R$" + imposto.calcularImpostp());
        }
    }
}