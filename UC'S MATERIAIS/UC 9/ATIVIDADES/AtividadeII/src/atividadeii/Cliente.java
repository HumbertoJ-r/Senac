
package atividadeii;

public class Cliente {
    
    private int idade;
    private double altura;
    private double peso;
    private boolean sexo;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public Cliente(int idade, double altura, double peso, boolean sexo) {
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
    }

    public Cliente() {
    }

    public double calcularIMC() {
        if (altura <= 0 || peso <= 0) {
            throw new IllegalArgumentException("Altura e peso devem ser valores positivos.");
        }

        return peso / Math.pow(altura, 2);
}
}