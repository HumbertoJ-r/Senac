
package atividadeiii;


public class Paciente {
    
    private String nomePaciente;
    private double telefone;
    private String cpf;
    private String dataConsulta;
    private String jaPaciente;
    private boolean consultaRealizada;
    private String receita;
    
    
    private int id;

    

    public Paciente() {
    }

    public Paciente(String nomePaciente, double telefone, String cpf, String dataConsulta, String jaPaciente, boolean consultaRealizada, int id, String receita) {
        this.nomePaciente = nomePaciente;
        this.telefone = telefone;
        this.cpf = cpf;
        this.dataConsulta = dataConsulta;
        this.jaPaciente = jaPaciente;
        this.consultaRealizada = consultaRealizada;
        this.id = id;
        this.receita = receita;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public double getTelefone() {
        return telefone;
    }

    public void setTelefone(double telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String isJaPaciente() {
        return jaPaciente;
    }

    public void setJaPaciente(String jaPaciente) {
        this.jaPaciente = jaPaciente;
    }

    public boolean isConsultaRealizada() {
        return consultaRealizada;
    }

    public void setConsultaRealizada(boolean consultaRealizada) {
        this.consultaRealizada = consultaRealizada;
    }
    
    
    public String getReceita() {
        return receita;
    }

    public void setReceita(String receita) {
        this.receita = receita;
    }

    
    
}
