
package novocarro;


public class Carro {
    String modelo;
    String marca;
    int ano;
    String cor;
    
    public Carro(){
        
    }
    
    public Carro(String modelo, String marca, int ano, String cor){
        this.modelo=modelo;
        this.marca=marca;
        this.ano=ano;
        this.cor=cor;
        
    }
    
    public void descrever(){
        System.out.println("Modelo do Carro: " + modelo);
        System.out.println("Marca do Carro: " + marca);
        System.out.println("Ano do Carro: " + ano);
        System.out.println("Cor do Carro: " + cor);
        System.out.println("\n");
    }
}
