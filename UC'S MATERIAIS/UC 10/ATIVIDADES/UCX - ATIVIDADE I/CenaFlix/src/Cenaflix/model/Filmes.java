
package Cenaflix.model;


public class Filmes {
    
    private int id;
    private String nome;
    private String dataDeLancamento;
    private String categoria;

    public Filmes() {
    }

    public Filmes(int id, String nome, String dataDeLancamento, String categoria) {
        this.id = id;
        this.nome = nome;
        this.dataDeLancamento = dataDeLancamento;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeLancamento() {
        return dataDeLancamento;
    }

    public void setDataDeLancamento(String dataDeLancamento) {
        this.dataDeLancamento = dataDeLancamento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

 
    
    /* public static String converterParaSQL(String dataAntiga) {
        String[] partesData = dataAntiga.split("/"); //Input: dd/mm/aaaa
        String dataNova = partesData[2] + "-" + partesData[1] + "-" + partesData[0]; //Output: aaaa-mm-dd
        return dataNova;
    }
    
    public static String converterParaJava(String dataAntiga) {
        String[] partesData = dataAntiga.split("-");
        String dataNova = partesData[2] + "/" + partesData[1] + "/" + partesData[0];
        return dataNova;
    }*/
    
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
