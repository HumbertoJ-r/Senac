package atividade1.pkg1;

import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {
        String Cliente1;
        String Cliente2;
        int Idade1;
        int Idade2;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escreva o nome do cliente: ");
        Cliente1 = teclado.nextLine();
        System.out.println("Escreva a idade do cliente: ");
        Idade1 = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Escreva o nome do cliente: ");
        Cliente2 = teclado.nextLine();
        System.out.println("Escreva a idade do cliente: ");
        Idade2 = teclado.nextInt();

        if (Idade1 > Idade2) {
            System.out.println("Quarto A: " + Cliente1 + "; Quarto B: " + Cliente2);

        } else if (Idade2 > Idade1) {
            System.out.println("Quarto A: " + Cliente2 + "; Quarto B: " + Cliente1);
        }

        if (Idade1 > 60) {
            System.out.println(Cliente1 + " tem um desconto de 40%.");
        }

        if (Idade2 > 60) {
            System.out.println(Cliente2 + " tem um desconto de 40%.");
        }
    }
}
