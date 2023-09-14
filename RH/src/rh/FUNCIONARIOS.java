
package rh;

public abstract class FUNCIONARIOS {
    
private String Nome;
private String Cpf;
private String Endereco;
private String Telefone;

    public FUNCIONARIOS(String Nome, String Cpf, String Endereco, String Telefone) {
        this.Nome = Nome;
        this.Cpf = Cpf;
        this.Endereco = Endereco;
        this.Telefone = Telefone;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }


    
}
