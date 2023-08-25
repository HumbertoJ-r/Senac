package novocarro;

public class NovoCarro {

    public static void main(String[] args) {
        Carro carros1 = new Carro("Ka", "Ford", 2020,"Branco");
        Carro carros2 = new Carro("Gol", "Volkswagem", 2010,"Rosa");
        
        System.out.println("Dados do carro1: ");
        System.out.println("Modelo do primeiro carro e: " + carros1.getModelo());
        carros1.setModelo("Ranger");
        System.out.println("Modelo do primeiro carro apos o metodo SET: "+carros1.getModelo());
        
        System.out.println("Dados do carro2: ");
        System.out.println("Modelo do primeiro carro e: " + carros2.getModelo());
        carros2.setModelo("Volks");
        System.out.println("Modelo do primeiro carro apos o metodo SET: "+carros2.getModelo());
               
        }
    }


