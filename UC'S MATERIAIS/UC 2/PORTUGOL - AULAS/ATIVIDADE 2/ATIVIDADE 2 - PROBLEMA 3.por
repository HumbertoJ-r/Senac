programa
{
	
	funcao inicio()
	{
		cadeia nome = " "
		inteiro contMeia = 0, contGratis = 0, idade, valorMeia = 75, valorPadrao = 150, soma = 0, contPadrao = 0
		inteiro resultadoMeia = 0, resultadoPadrao = 0, total


		escreva("R$", valorPadrao, ", valor padrão da diária.\n")

		enquanto (nome != "PARE")
		{
			escreva("\nNome do hóspede: \n")
			leia(nome)

			se (nome == "PARE")
			{
			pare
			}

			senao se (nome != "PARE")
			{
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
						contGratis++
						
					}

					senao se (idade > 80)
					{
						contMeia++
						resultadoMeia = contMeia * valorMeia 
					}
						
					
				}
				
				senao
				{
					contPadrao++
					resultadoPadrao = contPadrao * valorPadrao
				}
				
				
			}
		}

		total = resultadoPadrao + resultadoMeia
		escreva ("\nTotal de hospedagens: R$", total, "; ", contGratis, " gratruidade(s) ;", contMeia, " meia(s)\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 207; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */