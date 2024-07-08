package novabelo.model;

public class Cliente {

    private String nome;
    private String cpf;
    private String endereco;
    private String dataNasc;
    private String categoria;
    private Double preco;
    private String telefone;
    private int id;

    public Cliente() {
    }

    public Cliente(String nome, String cpf, String endereco, String dataNasc, String categoria, Double preco, int id, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.dataNasc = dataNasc;
        this.categoria = categoria;
        this.preco = preco;
        this.id = id;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public static String converterParaSQL(String dataAntiga) {
        if (dataAntiga != null) {
            String[] partesData = dataAntiga.split("/");
            if (partesData.length == 3) { // Verifica se há três partes (ano, mês e dia)
                String dataNova = partesData[2] + "-" + partesData[1] + "-" + partesData[0];
                return dataNova;
            } else {
                // Tratar caso em que a entrada não corresponde ao formato esperado
                return null; // Ou lançar uma exceção, dependendo do seu caso de uso
            }
        } else {
            // Tratar caso em que dataAntiga é null
            return null; // Ou lançar uma exceção, dependendo do seu caso de uso
        }
    }

    public static String converterParaJava(String dataAntiga) {
        if (dataAntiga != null) {
            String[] partesData = dataAntiga.split("-");
            if (partesData.length == 3) { // Verifica se há três partes (ano, mês e dia)
                String dataNova = partesData[2] + "/" + partesData[1] + "/" + partesData[0];
                return dataNova;
            } else {
                // Tratar caso em que a entrada não corresponde ao formato esperado
                return null; // Ou lançar uma exceção, dependendo do seu caso de uso
            }
        } else {
            // Tratar caso em que dataAntiga é null
            return null; // Ou lançar uma exceção, dependendo do seu caso de uso
        }
    }
}
