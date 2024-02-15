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

		real valorDesconto = 0.0
		se(quantidade <= 5 ) 
		{
			valorDesconto = valorUnitario * 0.05
			escreva("Aplicando 5% de desconto")
		}
		
		senao 
		{
			se (quantidade > 5 e quantidade <= 10)
			{
			valorDesconto = valorUnitario * 0.1
			escreva("Aplicando 10% de desconto")
			}
		

			senao 
			{
			valorDesconto = valorUnitario * 0.15
			escreva("Aplicando 15% de desconto")
			}
		}
		
		valorUnitario = valorUnitario - valorDesconto
		total = valorUnitario * quantidade 
		escreva("\nTotal: ", total)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 408; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */