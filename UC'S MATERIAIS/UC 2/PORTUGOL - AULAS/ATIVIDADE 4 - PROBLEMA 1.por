programa
{
	
	funcao inicio()
	{
		cadeia nomeEmpresa
		 
		
		

		escreva("Digite a quantidade de aparelhos deseja arrumar: \n")
		real resultado = valorCom (0.0, 0.0, 200.00)
		escreva(resultado)
		
				
		
	}

	funcao real valorCom (real desconto, real resultado, real valorSem)
	{
		
		
		inteiro aparelho
		
		leia(aparelho)
		
		se(aparelho == 2 ou aparelho > 2 e aparelho < 4)

		desconto = 0.10

		senao se(aparelho > 4 e aparelho < 8)

		desconto = 0.30

		senao se (aparelho > 8)

		desconto = 0.50

		valorSem = aparelho * valorSem 
		resultado = valorSem - (valorSem * desconto)

		
		retorne resultado
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 516; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */