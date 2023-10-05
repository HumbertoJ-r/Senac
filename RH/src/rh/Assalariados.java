
package rh;

public class Assalariados extends Funcionarios {
    private double salarioMensal;
    

    public Assalariados(String Nome, String Cpf, String Endereco, String Telefone, String Setor) {
        super(Nome, Cpf, Endereco, Telefone, Setor);
        this.salarioMensal = salarioMensal;
    }

   
    @Override
    public double calcularSalario() {
        return salarioMensal;
    }

    
    
}
