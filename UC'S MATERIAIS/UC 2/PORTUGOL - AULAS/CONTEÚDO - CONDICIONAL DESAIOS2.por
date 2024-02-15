programa
{
	
	funcao inicio()
	{
		//Defasio I - desenvolva um algoritmo em que é solicitado ao usuário digitar um número e mostre a mensagem caso esse número esteja no intervalo entre 100 e 200.
		//Desafio II - Desenvolva um algoritmo em que é solicitado ao usuário digitar em qual país ele nasceu. Caso o usuário digite "Brasil" ou "brasil", exibirá na tela a seguinte mensagem: "Você é brasileiro".
		//DEsafio III - O algoritmo a seguir contém erros. A função dele seira informar, por meio da idade e da respostado usuário, s ele está apto tem 18 anos e digitou "Sim" na pergunta se estava habilitado, e o programa mostrou a mensagem: "Usuário, você está apto para dirigir" (lê-se o nome que foi digitado em vez de "Usuário"). Porém, um amigo fez algumas alterações e agora o algoritmo está dando erro. Voce poderia ajudar?
		 cadeia nome, habilitacao
		 inteiro idade

		 escreva("Digite o seu nome: \n")
		 leia(nome)
		 escreva("Olá, seu nome é ", nome)

		
		 escreva("\nQual é a sua idade: \n")
		 leia(idade)

		 
		 escreva("Você tem habilitação? Digite Sim ou Não \n")
		 leia(habilitacao)

		 se (idade >= 18 ou habilitacao == "Sim")
		 {
		 	escreva (nome,", você está apto para dirigir!")	
		 }
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1176; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */