
package atividade3;


import java.util.Scanner;

public class Atividade3 {
 


    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);
        
        String nome = "";
        int contMeia = 0;
        int  contGratis = 0, idade;
        double  soma = 0;
        int contPadrao = 0; 
        double valorMeia;
        double valorPadrao;
        double total = 0; 
        double totalPadrao = 0;
        
        System.out.println("Por favor informe o valor da Diaria: ");
        valorPadrao = entrada.nextDouble();
        System.out.println("O valor padrao da diaria e R$" + valorPadrao);
        entrada.nextLine();
        valorMeia = valorPadrao /2;
        
        while (!nome.equals("PARE")) {
            System.out.println("Nome do hospede ou 'PARE' para terminar: ");
            nome = entrada.nextLine();
            
            if (nome.equals("PARE")) {
                break;
            } else {
                System.out.println("Digite a idade do hospede: ");
                idade = entrada.nextInt();
                entrada.nextLine(); 
                
                if (idade < 4 || idade > 80) {
                    if (idade < 4) {
                        System.out.println(nome + ", cliente possui gratuidade.");
                    } else if (idade > 80) {
                        System.out.println(nome + ", cliente paga meia.");
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

