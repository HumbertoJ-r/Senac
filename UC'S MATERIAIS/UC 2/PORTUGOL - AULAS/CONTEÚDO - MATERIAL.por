programa
{
	
	funcao inicio()
	{
		real salarioAntigo, salarioNovo, valorAumento, percentual
		cadeia nome

		escreva("Digite o nome do emprado:\n")
		leia (nome)

		escreva("Digite o salário antigo [ex: 9999.99]:\n")
		leia(salarioAntigo)

		escreva("Digite o percentual do aumento [ex: 99.99]:\n")
		leia(percentual)

		valorAumento = salarioAntigo*(percentual/100)

		salarioNovo = salarioAntigo + valorAumento

		escreva("Empregado nome: ", nome)

		escreva("\nSalário Antigo: R$ ", salarioAntigo)

		escreva("\nSalário Novo: R$ ", salarioNovo)

		escreva("\nValor do Aumento: R$ ", valorAumento)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 605; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */