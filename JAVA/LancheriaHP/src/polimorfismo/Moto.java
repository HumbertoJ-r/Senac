package polimorfismo;


public class Moto implements Veiculo {

    // Atributos e métodos especificos de Moto
    
    @Override
    public void acelerar() {
        System.out.println("Vrum vrum");
    }

    @Override
    public void frear() {
        System.out.println("ihirrrrrrrrrr");
    }
    
}
