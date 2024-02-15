programa
{
	
	funcao inicio()
	{
		//auditório alfa com 150 lugares e espaço para até 70 cadeiras adicionais 
		//auditório beta com 350 lugares, sem espaços para mais cadeiras
		//criar um algoritmo que receba o número de convidados 
		//fazer verificação se a quantidade for > 350 ou < 0 mostre a mensagem "Número de convidados inválido".
		//se o valor for válido, mostre na tela qual dos auditórios é mais adequado. 
		//no caso do auditório Alfa, calcule ainda quantas cadeiras adicionais serão necessárias.
		
		inteiro alfa = 150, beta = 350, cadeiras, convidados
		
		escreva("Digite aqui o número de convidados: ")
		leia(convidados)
		escreva(convidados, " número de convidados\n")

		se (convidados > 350)
		{
			escreva("Número de convidados inválido.")	
		}
		
		senao se (convidados < 0)
		{
			escreva("Número de convidados inválido.")	
		}

		senao se (convidados > 220)
		{
			escreva("Use o auditório Beta.")
		}
		senao se (convidados < 220)
		{
			escreva("Use o auditório Alfa.\n")
			
			se (convidados > 150)
			{
			cadeiras = (convidados - 150)
			escreva("Inclua mais ", cadeiras, " cadeiras")
			}
		}
		

		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 460; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */