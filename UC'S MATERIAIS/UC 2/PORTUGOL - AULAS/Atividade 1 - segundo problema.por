programa
{
	
	funcao inicio()
	{
		//A quantidade de café é 0,2 litros por convidado
		//a quantidade de agua é 0,5 litros por condidado
		//a quantidade de salgadinhos é 7 por pessoa
		// fazer um algoritmo que receba a quantidade de convidados
		// o número máximo 350 (a capacidade máxima do salão)
		// caso exceda a quantidade máxima mostrar na tela "Quantidade de convidados superior à capacidade máxima"
		// sendo válida a capacidade calcular os valores de água, café, e salgadinhos
		//mostrar na tela esses valores 

		real cafe = 0.2, agua = 0.5, salgadinho = 7
		inteiro convidados 
		real resultadocafe
		real resultadoagua
		real resultadosalgadinho
	

		escreva ("Digite aqui a quantidade de conidados: ")
		leia(convidados)
		escreva (convidados, " número de convidados\n")

		se (convidados > 350)
		{
			escreva("Quantidade de convidados superior à capacidade")
		}
		
		senao se (convidados <= 350)
		{
			resultadocafe = cafe * convidados
			resultadoagua = agua * convidados
			resultadosalgadinho = salgadinho * convidados 
				
			escreva(resultadocafe, " litros de café, ", resultadoagua, " litros de água,", resultadosalgadinho, " salgadinhos.")
		} 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 507; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */