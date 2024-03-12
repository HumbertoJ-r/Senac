programa
{
	
	funcao inicio()
	{
		cadeia nomeProduto
		real valorUnitario, total
		inteiro quantidade

		escreva("Digite o nome do produto: ")
		leia(nomeProduto)

		escreva("Digite o valor unitário: ")
		leia(valorUnitario)

		
		escreva("Digite a quantidade: ")
		leia(quantidade)

		se(quantidade > 10)
		{
			real valorDesconto 
			valorDesconto = valorUnitario * 0.15
			valorUnitario = valorUnitario - valorDesconto
			escreva("Valor atualizado: ", valorUnitario)
		}

		senao 
		{
			escreva("Sem desconto")	
		}

		total = valorUnitario * quantidade 
		escreva("\nTotal: ", total)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 594; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */