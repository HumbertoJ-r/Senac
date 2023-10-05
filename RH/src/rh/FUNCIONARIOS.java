package rh;

abstract class Funcionarios {

    private String Nome;
    private String Cpf;
    private String Endereco;
    private String Telefone;
    private String Setor;

    public Funcionarios(String Nome, String Cpf, String Endereco, String Telefone, String Setor) {
        this.Nome = Nome;
        this.Cpf = Cpf;
        this.Endereco = Endereco;
        this.Telefone = Telefone;
        this.Setor = Setor;
    }

    public abstract double calcularSalario();

    public void mostrarDados() {
        System.out.println("Nome " + Nome);
        System.out.println("CPF " + Cpf);
        System.out.println("Endereco " + Endereco);
        System.out.println("Telefone " + Telefone);
        System.out.println("Setor " + Setor);

    }

    public void aplicarAumento(double percentualAumento) {

    }
}
