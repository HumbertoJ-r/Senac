
package com.mycompany.atividade4;

abstract class  Aliquota implements Impostos {
    private double aliquotas;
    
    public Aliquota (double aliquotas){
        this.aliquotas = aliquotas;
    }
    
    public double getAliquotas() {
        return aliquotas;
    }
    
}
