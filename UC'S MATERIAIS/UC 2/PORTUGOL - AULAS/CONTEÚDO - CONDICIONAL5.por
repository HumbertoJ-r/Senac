programa
{
	
	funcao inicio()
	{
		inteiro idade, senha, mes
		cadeia nome

		escreva("----SOLIVITANDO DADOS DO USUÁRIO----\n")
		escreva("Digite o seu nome: ")
		leia(nome)

		escreva("Digite a sua idade: ")
		leia(idade)

		escreva("Digite o número correspondente ao mês que você nasceu: ")
		leia(mes)
		limpa()

		escreva("--- Acesso ao sistema ---\n")
		escreva("Digite a sua senha: \n")
		leia(senha)

		limpa()

		se (senha == idade ou senha == mes)
		{
			escreva("Olá ", nome, ", acesso permitido!\n")	
		}

		senao
		{
			escreva("Acesso negado!\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 575; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */