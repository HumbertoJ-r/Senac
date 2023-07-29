package atividade1.pkg1;
public class Atividade11 {
    public static void main(String[] args)
    {
        int alfa = 150;
        int beta = 350;
        int cadeiras;
        int convidados;
        
        Scanner scanner = new Scanner(System.in);
		
	System.out.println("Digite aqui o número de convidados: ");
	convidados = scanner.nextInt();
	System.out.println(convidados + "número de convidados");

	if (convidados > 350)
		{
                    System.out.println("Número de convidados inválido.");	
		}
		
        else if (convidados < 0)
		{
                    System.out.println("Número de convidados inválido.");
		}

        else if	(convidados > 220)
		{
                    System.out.println("Use o auditório Beta.");
		}
        
        else if	(convidados < 220)
		{
                    System.out.println("Use o auditório Alfa.");
			
			if (convidados > 150)
			{
			cadeiras = convidados - 150;
			System.out.println("Inclua mais " + cadeiras + " cadeiras");
			}
    }
    }
}

