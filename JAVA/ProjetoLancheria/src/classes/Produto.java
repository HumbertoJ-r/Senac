package classes;

public class Produto {
    // Atributos são privados
    private String nome;
    private String descricao;
    private double valor;

    // Método construtor
    
    // Construtor com variáveis de referência = valores inicializados com o valor "null"
    public Produto() {
        
    }
    
    // Método construtor
    public Produto(String nome, String descricao, double valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }
    
    // Métodos são públicos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
