package polimorfismo;

public class Carro implements Veiculo {

    // Atributos e métodos especificos de carro
    
    @Override
    public void acelerar() {
        System.out.println("Acelerando carro");
    }

    @Override
    public void frear() {
        System.out.println("Freiando carro");
    }
    
}
