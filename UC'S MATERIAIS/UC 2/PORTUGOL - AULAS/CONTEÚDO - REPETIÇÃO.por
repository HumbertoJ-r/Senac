programa
{
	
	funcao inicio()
	{
		inteiro numero, multiplicador = 0, resultado
		
		escreva("Digite um número: \n")
		leia(numero)


		enquanto (multiplicador <= 9)
		{
			multiplicador = multiplicador + 1 
			resultado = numero * multiplicador
			
			escreva("a tabuada de ", numero, " é:\n")

			escreva(numero, " x ", multiplicador, " = ", resultado, "\n")
						
		}
		escreva("Fim do programa")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 121; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */