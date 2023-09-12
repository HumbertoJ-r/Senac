package atividade5;

import java.util.Scanner;

public class Atividade5 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[][] status = new boolean[4][3];

        do {
            System.out.println("Informe Andar: ");
            int andar = scanner.nextInt();
            
            System.out.println("Informe o e Quarto: ");
            int quarto = scanner.nextInt();

            
            status[andar - 1][quarto - 1] = true;

            System.out.println("Deseja informar outra ocupacao? (S/N)");
        } while (scanner.next().equalsIgnoreCase("S"));

        System.out.println("Ocupacao do hotel:");
        for (int andar = 0; andar < 4; andar++) {
            
            System.out.println((andar + 1) + " andar:");
            for (int quarto = 0; quarto < 3; quarto++) {
                if (status[andar][quarto]) {
                    System.out.println("- quarto " + (quarto + 1) + " ocupado");
                } else {
                    System.out.println("- quarto " + (quarto + 1) + " desocupado");
                }
            }
        }
    }
}



    
