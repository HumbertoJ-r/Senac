
package com.mycompany.modulocontabil;

public class PIS extends Aliquota {

    private double debito;
    private double credito;

    public double getDebito() {
        return debito;
    }

    public void setDebito(double debito) {
        this.debito = debito;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
    
    public PIS(double aliquotas, double debito, double credito) {
        super(aliquotas);
        this.debito = debito;
        this.credito = credito;
    }

    @Override
    public double calcularImpostp() {
        return (debito - credito) * getAliquotas() / 100;
    }

    @Override
    public String getDescricao() {
        return "PIS";
    }
 
   
}
