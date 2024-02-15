programa
{
	
	funcao inicio()
	{
		inteiro indice
		real total = 0.0
		cadeia nome [5]
		real valor [5]

		escreva("Programa de controle do dinheiro emprestado: ")
		escreva("\n")

		para (indice = 0; indice < 5; indice++)
		{
			escreva("Informe o nome do Amigo: ")
			leia(nome[indice])
			escreva("Informe quanto o Amigo deve: ")
			leia(valor[indice])
		}

		escreva("\n")
		escreva("Resumo: ")
		escreva("\n")

		para(indice = 0; indice < 5; indice++)
		{
			escreva("Meu amigo ", nome[indice]," me deve R$", valor[indice])
			escreva("\n")
		}

		escreva("\n")
		escreva("Total emprestado: R$")

		para(indice = 0; indice < 5; indice++)
		{
			total = total + valor[indice]
		}
			escreva(total)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 9; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */