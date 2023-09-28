package testeempresa;

public class Empresa {

    String nome;
    String cnj;
    Funcionario gerente;
    Funcionario[] funcionarios;

    public Empresa(String nome, String cnpj, int numeroFuncionarios) {
        funcionarios = new Funcionario[numeroFuncionarios];
        this.nome = nome;
        this.cnj = cnpj;
    }
}
