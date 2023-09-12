package atividade1.pkg1;

import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args)
    {
        int Alfa = 150;
        int Beta = 350;
        int Convidados;
        int Cadeiras;
        
        Scanner teclado = new Scanner (System.in);
	System.out.println("Digite aqui o número de convidados: ");
        Convidados = teclado.nextInt();
	System.out.println(Convidados + "número de convidados");

	if (Convidados > 350)
		{
                    System.out.println("Número de convidados inválido.");	
		}
		
        else if (Convidados < 0)
		{
                    System.out.println("Número de convidados inválido.");
		}

        else if	(Convidados > 220)
		{
                    System.out.println("Use o auditório Beta.");
		}
        
        else if	(Convidados < 220)
		{
                    System.out.println("Use o auditório Alfa.");
			
			if (Convidados > 150)
			{
			Cadeiras = Convidados - 150;
			System.out.println("Inclua mais " + Cadeiras + " cadeiras");
			}
    }
    }
}

