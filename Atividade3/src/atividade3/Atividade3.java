
package atividade3;


import java.util.Scanner;

public class Atividade3 {
 


    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);
        
        String nome = "";
        int contMeia = 0, contGratis = 0, idade, valorMeia = 75, valorPadrao = 150, soma = 0, contPadrao = 0; 
        int total = 0; int totalPadrao = 0;
        
        System.out.println("R$" + valorPadrao + ", valor padrao da diaria.");
        
        while (!nome.equals("PARE")) {
            System.out.println("\nNome do hospede: ");
            nome = entrada.nextLine();
            
            if (nome.equals("PARE")) {
                break;
            } else {
                System.out.println("\nDigite a idade do hospede: ");
                idade = entrada.nextInt();
                entrada.nextLine(); // Consumir a quebra de linha
                
                if (idade < 4 || idade > 80) {
                    if (idade < 4) {
                        System.out.println(nome + ", cliente possui gratuidade");
                    } else if (idade > 80) {
                        System.out.println(nome + ", cliente paga meia");
                    }
                    
                    if (idade < 4) {
                        contGratis++;
                    } else if (idade > 80) {
                        contMeia++;
                        soma = (contMeia * valorMeia);
                    }
                } else {
                    contPadrao++;
                    totalPadrao = contPadrao * valorPadrao;
                }
            }
        }
        
        total = soma + totalPadrao;
        
        System.out.println("\nTotal de hospedagens: R$" + total + "; " + contGratis + " gratuidade(s); " + contMeia + " meia(s)");
        
        entrada.close();
    }
}

