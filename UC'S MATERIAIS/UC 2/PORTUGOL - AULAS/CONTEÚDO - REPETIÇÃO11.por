programa
{
	
	funcao inicio()
	{
		cadeia nomeMusica
		caracter resposta = 'S', estilo
		inteiro cont = 0, contRock = 0, contSertanejo = 0, contPop = 0

		escreva ("--- Vamos criar uma playlist de 5 músicas? ---\n")

		enquanto(resposta == 'S')
		{
			escreva ("Insira uma música para sua playlist: \n")
			leia(nomeMusica)
			
			escreva ("Qual o estilo desta música? \n")
			leia(estilo)

			se(estilo == 'R')
			{
				contRock++
				cont++
			}

			se(estilo == 'S')
			{
				contSertanejo++
				cont++
			}

			se(estilo == 'P')
			{
				contPop++
				cont++
			}

			escreva("A musica adicionada foi: ", nomeMusica, " do estilo ", estilo, ". \n")
			escreva("Você já cadastrou ", cont ," músicas. Deseja cadastrar mais? S/N \n")
			leia(resposta)
		}

		escreva("Você adicionou ", contRock, " músicas do estilo Rock, ", contSertanejo," do estilo Sertanejo e ", contPop, " músicas estilo Pop.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 803; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */