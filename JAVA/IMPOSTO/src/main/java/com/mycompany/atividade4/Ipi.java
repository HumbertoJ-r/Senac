
package com.mycompany.atividade4;

public class Ipi extends Aliquota {

    private double baseCalculo;
    
    public Ipi(double aliquotas, double baseCalculo) {
        super(aliquotas);
        this.baseCalculo = baseCalculo;
    }
    

    @Override
    public double calcularImpostp() {
       return baseCalculo * getAliquotas() / 100;
    }

    public double getBaseCalculo() {
        return baseCalculo;
    }

    public void setBaseCalculo(double baseCalculo) {
        this.baseCalculo = baseCalculo;
    }

    @Override
    public String getDescricao() {
        return "IPI";
    }
}