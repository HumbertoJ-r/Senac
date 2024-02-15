programa
{
	
	funcao inicio()
	{
		real numero1, numero2
		inteiro opcao

		escreva("Digite um número: \n")
		leia(numero1)
		escreva("Digite outro número: \n")
		leia(numero2)

		escreva("---- 1) Soma ----\n")
		escreva("---- 2) Subtrair ----\n")
		escreva("---- 3) Dividir ----\n")
		escreva("---- 4) Multiplicar ----\n")
		escreva("Digite o número da opreção que deseja: ")
		leia(opcao)
		
		escolha(opcao)
		{
			caso 1:
				escreva("O resultado da soma é -> ", numero1 + numero2)
				pare
			caso 2:
				escreva("O resultado da subtração é -> ", numero1 - numero2)
				pare
			caso 3:
				escreva("O resultado da divisão é -> ", numero1 / numero2)
				pare
			caso 4:
				escreva("O resultado da multiplicação é -> ", numero1 * numero2)
				pare
			caso contrario:
				escreva("Opção iválida!")				
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 738; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */