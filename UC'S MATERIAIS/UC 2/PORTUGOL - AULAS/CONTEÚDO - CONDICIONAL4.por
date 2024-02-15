programa
{
	
	funcao inicio()
	{
		caracter op

		escreva("-- Menu de opções --\n")
		escreva("1 - Acessar sistema \n")
		escreva("2 - Testar conexão com a internet \n")
		escreva("3 - Sair do menu \n")

		escreva("Escolha sua opção: ")
		leia(op)

		limpa()

		se (op == '1')
		{
			escreva("Bem-vindo, aluno!")
		}

		senao se (op == '2')
		{
			escreva("Conexão com a internet está OK!")
		}

		senao se (op == '3')
		{
			escreva("Saindo.....")
		}

		senao
		{
			escreva("ERRO Opção errada finalizando programa.")	
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 524; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */