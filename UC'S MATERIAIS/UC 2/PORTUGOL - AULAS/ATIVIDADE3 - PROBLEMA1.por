programa
{
	
	funcao inicio()
	{
		/*hotel com 20 quartos 
		 * marcar a ocupação de cada quarto
		 * no inicio todos os quartos estão livres
		 * o usuário informará então o número do quarto 
		 * O sistema questionará " O quarto está livre ou ocupado (L/O)
		 * O usuário informará L ou O
		 * 
		 */

		 inteiro quarto [20] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}
		 caracter livre [20] , ocupado [20]
		 inteiro i 
		 inteiro busca 
		 caracter fim = 'N' 
		 cadeia resultado = " " 

		 escreva ("Digite o número do quarto que deseja: ")
		 leia(busca)
		 
		 i = 0

		 enquanto (i < 20 e quarto [i] < 20)
		 {
		 	escreva("\nDigite L para Livre ou O para Ocupado? L/O\n")
	 		leia(resultado)
	 		
	 			se (resultado == "L" ou resultado == "l" )
	 		{
	 			resultado = i
				
			}
			
 				senao se (resultado == "O" ou resultado == "o")
 			{
 				i++
 			}
		 	
		 	escreva("\nDeseja continuar? S/N\n")
		 	leia(fim)
		 		
		 		se (fim == 'N')
		 		{
		 			escreva("\n",quarto[i], resultado,"\n")		 		
					pare
	 			}
		 	
		 	
		 	escreva ("Digite o número do quarto que deseja: ")
		 	leia(busca)
		 	i++

		 	
		 	
		 	se (i > 20)
		 	{
		 		escreva ("Número inválido. Digite um número de 1 a 20")
		 	}
			escreva(quarto[i], resultado)
		 	
		 }
		 
		
	}
		 
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 556; 
 * @DOBRAMENTO-CODIGO = [58];
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */