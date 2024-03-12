programa
{
	
	funcao inicio()
	{
		

		 inteiro dias, diaria

		 escreva("Digite o valor diária: R$ ")
		 leia(diaria)
		 escreva("Digite a quantidade de dias: ")
		 leia (dias)

		 enquanto(dias < 0 ou dias > 30 ou diaria < 0)
		 {
		 	escreva("\nValor Inválido\n")
			
			escreva("\nDigite o valor diária: R$ ")
		  	leia(diaria)
		  	
		 	escreva("\nDigite a quantidade de dias: ")
		 	leia (dias)
			
		 }

		 escreva("\nFim do Programa")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 35; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */