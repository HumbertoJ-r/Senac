programa
{
	
	funcao inicio()
	{
		caracter avaliacao, atualizacao
		inteiro aprovado = 0, nota, numAvaliacao = 1

		escreva("---- Votação de aprovados para prózima etapa: ----\n")
		escreva(" 1- João \n 2- Maria \n 3- Ana \n\n")


		escreva("Insira a avaliação de 3 usuários para verificar se o participante 1 será aprovado para a próxima etapa \n\n")


		enquanto(numAvaliacao < 3)
		{
			escreva("Respostas disponíveis: A - Aprovado(a) | R - Reprovado(a) \n\n")
			escreva("Insira a avaliação número ", numAvaliacao, " do participante 1:")
			leia(avaliacao)
			
			se(avaliacao == 'A')
			{
				aprovado++	
			}
		}
		
		se(aprovado < 2)
		{
			escreva("Participante número 1 você não foi aprovado(a) para a próxima estapa.\n")
			aprovado = 0
		}
		
		senao
		{
			escreva("Participante número 1 você foi aprovado(a) para a próxima estapa, parabéns!\n")
			aprovado = 0
		}

		numAvaliacao = 0

		enquanto(numAvaliacao < 3)
		{
			escreva("Respostas disponíveis: A - Aprovado(a) | R - Reprovado(a) \n\n")
			escreva("Insira a avaliação número ", numAvaliacao, " do participante 2:")
			leia(avaliacao)
			
			se (avaliacao == 'A')
			{
				aprovado++
			}
		}

		se(aprovado < 2)
		{
			escreva("Participante número 2 você não foi aprovado(a) para a próxima estapa.\n")
			aprovado = 0
		}

		senao
		{
			escreva("Participante número 2 você foi aprovado(a) para a próxima estapa, parabéns!\n")
			aprovado = 0
		}

		numAvaliacao = 0

		enquanto(numAvaliacao < 3)
		{
			escreva("Respostas disponíveis: A - Aprovado(a) | R - Reprovado(a) \n\n")
			escreva("Insira a avaliação número 2 do participante 3:")
			leia(avaliacao)
			
			se (avaliacao == 'A')
			{
				aprovado++
			}
		}

		se(aprovado < 2)
		{
			escreva("Participante número 3 você não foi aprovado(a) para a próxima estapa.\n")
			aprovado = 0
		}

		senao
		
		{
			escreva("Participante número 2 você foi aprovado(a) para a próxima estapa, parabéns!\n")
			aprovado = 0
		}

		numAvaliacao = 0 

		escreva("Em uma escala de 1 a 5, o quanto você gostou da sua experiência conosoco? ")
		leia(nota)
		
		escreva("Sua nota foi: ", nota, ". Deseja alterar sua nota de experiência? Respona com S/N: ")
		leia(atualizacao)
		
		se (atualizacao == 'S')
		{
			escreva("Em uma escala de 1 a 5, o quanto você gostou da sua experiência conosoco? ")
			leia(nota)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 570; 
 * @DOBRAMENTO-CODIGO = [27, 33, 41, 53, 59, 73, 67, 79];
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */