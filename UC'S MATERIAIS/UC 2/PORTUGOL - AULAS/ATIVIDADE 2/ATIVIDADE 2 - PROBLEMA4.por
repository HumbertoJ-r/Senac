programa
{
	
	funcao inicio()
	{
		
		cadeia nome = " ", maisNova = " ", maisVelha = " "
		inteiro contMeia = 0, contGratis = 0, idade = 0, valorMeia = 75, valorPadrao = 150, contPadrao = 0
		caracter resposta = 'S' 
		inteiro menorValor=0, maiorValor = 0, resultadoMeia = 0, resultadoPadrao = 0, total

		escreva("R$", valorPadrao, ", valor padrão da diária.\n")

		enquanto (resposta == 'S')
		{
			escreva("\nNome do hóspede: \n")
			leia(nome)
					
			escreva ("\nDigite a idade do hóspede: \n") 
			leia(idade)

				se (idade < 4 ou idade > 80)
				{
					se (idade < 4 )
					{
						escreva("\n", nome, ", cliente possui gratuidade\n")
					}

					senao se (idade > 80)
					{
						escreva("\n", nome, ", cliente paga meia\n")
					}

					se (idade < 4)
					{
						maisNova = nome
						menorValor = idade
						contGratis++
						
							se(idade < menorValor)
						{
							menorValor = idade	
						}
										
					}

					senao se (idade > 80)
					{
						maisVelha = nome
						maiorValor = idade
						contMeia++
						resultadoMeia = contMeia * valorMeia

						se(idade > maiorValor)
						{
							maiorValor = idade
						}
					}
					
				}

							
				senao
				{
					contPadrao++
					resultadoPadrao = contPadrao * valorPadrao
				}
				
			escreva("\nDeseja continuar? (S/N)\n")
			leia(resposta)
				
		} 

		total = resultadoPadrao + resultadoMeia
		escreva ("\nTotal de hospedagens: R$", total, "; ", contGratis, " gratruidade(s) ;", contMeia, " meia(s)\n")
		escreva ("\nO(a) hóspede mais velho é ", maisVelha, " com ", maiorValor, " ano(s);\n")
		escreva ("\nO(a) hóspede mais jovem é ", maisNova, " com ", menorValor, " ano(s);\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1677; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */