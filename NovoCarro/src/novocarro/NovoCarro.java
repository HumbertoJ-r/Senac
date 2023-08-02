package novocarro;

public class NovoCarro {

    public static void main(String[] args) {
        Carro carros[] = new Carro[4];
        carros[0] = new Carro();
        carros[1] = new Carro("Ka", "Ford", 2020, "Branco");
        carros[2] = new Carro("Gol", "Volkswagen", 2010, "Rosa");
        carros[3] = new Carro("Siena", "Fiat", 2022, " ");

        for (int i = 0; i < carros.length; i++) {
            System.out.println("Dados do carro " + i);
            carros[i].descrever();
        }
    }

}
