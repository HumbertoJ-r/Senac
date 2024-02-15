programa
{
	
	funcao inicio()
	{
		real nota = 0
		inteiro contAprovado = 0, contReprovado =0

		escreva("-- ATENÇÃO: Inserir um número negativo finaliza o programa -- \n")

		enquanto (nota >= 0)
		{

			escreva ("Insira a nota de sua avaliação! \n")
			leia (nota)

			se (nota >= 7)
			{
				contAprovado++
			}

			senao se (nota >= 0 e nota < 7)
			{
				contReprovado++
			}
		}
		
		escreva("Você cadastrou ",contAprovado+contReprovado," provas. \n")
		escreva("Você aprovou em ", contAprovado, " provas e reprovou em ", contReprovado,".")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 254; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */