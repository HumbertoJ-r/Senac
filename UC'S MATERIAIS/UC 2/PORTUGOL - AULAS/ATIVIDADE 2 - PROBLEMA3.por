programa
{
	
	funcao inicio()
	{
		/*algoritmo que receba o valor padrão de uma diária
		 * Receba vários nomes de hóspedes e suas idades
		 * Caso o hóspede seja menor que 4 anos - ele não paga hospedagem 
		 * mostre na tela (Nome do hóspede) possui gratuidade
		 * hóspedes com mais de 80 anos pagam metade
		 * mostre na tela (Nome do hóspede) paga meia. 
		 * O usuário informará hóspedes até digitar a palavra PARE, que interrompe a entrada de dados.
		 * ao fim, mostre a quantidade de gratuidades 
		 * a quantidade de meias 
		 * e o valor total considerando todos os hóspedes informados 
		 * valor padrão da diaria 
		 * nome de hópedes
		 * idade
		 * gratuidade
		 * menor de 4 anos - nome do hospede - gratuidade <= 4
		 * maior que 80 anos - nome do hospede - desconto  >= 80
		 * condição de parda "PARE"
		 */

		 inteiro diaria = 150, idade = 0
		 cadeia nome = " "

		escreva("R$: ", diaria, ", valor padrão da diária\n")	 		
		
		escreva("\nDigite o nome do hóspede: \n")
		leia(nome)
		 
	 	
		 enquanto (nome != "PARE")
		 {
		 	
		 	escreva("\nDigite o nome do hóspede: \n")
		 	leia(nome)
		 
		  		
 			se(idade > 4 ou idade < 80)
		 	{
 				escreva("\nDigite a idade do hóspede: \n")
		 		
	 			leia(idade)
				 		
				se (idade < 4)
				{
					escreva(nome, ", possui gratuidade")
				}
			
	 			senao se (idade > 80)
				
				{
					escreva(nome, ", paga meia")
				}
			}
		 }		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1116; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */