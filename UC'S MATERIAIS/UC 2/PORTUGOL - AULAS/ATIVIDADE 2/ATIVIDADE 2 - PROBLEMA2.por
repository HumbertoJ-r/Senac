programa
{
	
	funcao inicio()
	{

		 inteiro hospede, quarto, diaria, soma = 0

		 escreva("Digite a quantidade de hóspdes: \n")
		 leia(hospede)
		 
		 para (inteiro i = 1; i <= hospede; i++)
		 {
		 	escreva("\nDigite número do quarto: \n")
		 	leia(quarto)

		 	escreva("\nDigite o valor da diária: \n")
		 	leia(diaria)
		 	
		 	escreva("\nQuarto ", quarto, ": R$ ", diaria,"\n")

		 	soma = soma + diaria 
		 }

		 escreva("\nTotal de diárias é: R$ ", soma,".")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 33; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */