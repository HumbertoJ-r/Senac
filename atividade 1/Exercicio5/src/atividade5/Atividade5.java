package atividade5;

import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[][] status = new boolean[4][3];

        do {
            System.out.println("Informe um Andar do 1 ao 4: ");
            int andar = scanner.nextInt();

            if (andar < 1 || andar > 4) {
                System.out.println("Andar invalido. Tente novamente.");
                continue;
            }

            System.out.println("Informe um Quarto do 1 ao 3: ");
            int quarto = scanner.nextInt();

            if (quarto < 1 || quarto > 3) {
                System.out.println("Opcao invalidade. Tente novemnte.");
                continue;
            }

            status[andar - 1][quarto - 1] = true;

            System.out.println("Deseja informar outra ocupacao? (S/N)");
        } while (scanner.next().equalsIgnoreCase("S"));

        System.out.println("Ocupacao do hotel:");
        for (int andar = 0; andar < 4; andar++) {

            System.out.println("Andar " + (andar + 1) + ":");
            System.out.println("+---+---+---+");
            for (int quarto = 0; quarto < 3; quarto++) {
                if (status[andar][quarto]) {
                    System.out.println( "| X |   |   |");
                    

                } else {
                    System.out.println("|   |   |   |");
                }
            }
            System.out.println("|   |   |   |");
            System.out.println("+---+---+---+");

        }
    }
}
