programa
{
	
	funcao inicio()
	{
		real notas [5]
		real media, soma = 0.0
		inteiro contagem = 0

		
		para (inteiro i = 0; i < 5; i++)
		{
			escreva("digite as 5 notas\n")
			leia(notas[i])
			soma = soma + notas [i]
			media = soma / 5
		}
		
		para (inteiro j = 0; j < 5; j++)
		{
			se(notas[j] > media)
				{
					contagem = contagem + 1
					escreva("a media da classe foi ", media, " e ", contagem, " alunos ficaram acima dessa média")
				}
		}
			
	}		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 144; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */