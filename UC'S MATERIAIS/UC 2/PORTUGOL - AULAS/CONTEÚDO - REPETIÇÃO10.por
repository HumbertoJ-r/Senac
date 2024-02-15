programa
{
	
	funcao inicio()
	{
		inteiro numero, soma = 0
		caracter continuar = 'S'

		enquanto (continuar == 'S')
		{
			escreva("Insira um número para somar: ")
			leia (numero)

				soma = soma + numero
				escreva("Deseja inserir mais números? S/N: ")
				leia (continuar)
		}
		escreva("A soma total dos números é: ", soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 343; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */