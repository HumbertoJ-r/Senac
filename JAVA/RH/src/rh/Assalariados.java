
package rh;

public class Assalariados extends funcionarios {
    private double salarioMensal;

    public Assalariados(String Nome, String Cpf, String Endereco, String Telefone, String Setor, double salarioMensal) {
        super(Nome, Cpf, Endereco, Telefone, Setor);
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularSalario() {
        return salarioMensal;
    }

  
    
}
