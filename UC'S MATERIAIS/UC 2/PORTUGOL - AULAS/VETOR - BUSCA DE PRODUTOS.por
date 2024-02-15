programa
{
	
	funcao inicio()
	{
		cadeia nomesProdutos[5] = {"arroz","feijão","sal","pimenta","açucar"}
		real precosProdutos [5] = {10.0,2.0,1.5,1.75,6.5}
		inteiro i 
		cadeia termoBusca

		escreva("Digite o termo da busca:\n")
		leia(termoBusca)

		i=0
		enquanto (i <5 e nomesProdutos [i] != termoBusca)
		{
			i++
		}

		se (i >= 5)
		{
			escreva("\nO produto \"", termoBusca, "\" não foi encontrado.")
		}
		senao 
		{
			escreva("O produto foi encontrado: \n")
			escreva("\nProduto: ", nomesProdutos[i], ", Valor: ", precosProdutos[i])
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 233; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */