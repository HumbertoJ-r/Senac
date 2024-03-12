programa
{
	
	funcao inicio()
	{
		inteiro valor, cont = 0, soma = 0

		enquanto (cont <5)
		{
			escreva ("Insira um valor para realizar a soma: ")
			leia (valor)

				soma = soma + valor
				cont = cont + 1
		}

		escreva ("Você terminou de cadastrar os valores!")
		escreva ("A média dos valores inderidos é: " + soma/cont )



		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 339; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */