
package rh;

public class Horistas extends Funcionarios {
    
    private double horasTrabalhadas;
    private double valorHora;

    public Horistas(String Nome, String Cpf, String Endereco, String Telefone, String Setor) {
        super(Nome, Cpf, Endereco, Telefone, Setor);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorHora;
    }

  
    
    
}
