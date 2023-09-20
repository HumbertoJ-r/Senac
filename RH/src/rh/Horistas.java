
package rh;

public class Horistas extends funcionarios {
    private double horasTrabalhadas;
    private double valorHoras;

    public Horistas(String Nome, String Cpf, String Endereco, String Telefone, String Setor, double horasTrabalhadas,double valorHoras) {
        super(Nome, Cpf, Endereco, Telefone, Setor);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHoras = valorHoras;
    }

    @Override
    public double calcularSalario() {
       return horasTrabalhadas * valorHoras;
    }
    
    
    
}
