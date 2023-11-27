
package senacgym;

import java.util.Scanner;

public class SenacGym {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        fabricaExercicios fabrica = new fabricaExercicios();

        System.out.println("Escolha o tipo de exercicio (corrida ou musculacao) : ");
        String tipo = scanner.nextLine(); 
        
        exercicios exercicioEscolhido;
        exercicioEscolhido = fabrica.criarExercicio(tipo);
        if (exercicioEscolhido != null) {
            exercicioEscolhido.realizar();
        } else {
            System.out.println("Tipo de exercício inválido. Escolha entre corrida ou musculacao.");
        }


        
    }

}



