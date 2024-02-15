programa
{
	
	funcao inicio()
	{
		cadeia nome [5]
		cadeia sexo  [5]
		cadeia nomeM [5], nomeF [5]
		

		para(inteiro i = 0; i <5; i++)
		{
		escreva("Digite o nome: ")
		leia(nome[i])

		escreva("Digite o sexo: ")
		leia (sexo[i])
		}

		para (inteiro i =0; i <5; i++)
		{
			se (sexo[i] == "F")
			{
				nomeF[i] = nome[i]
				
			}

			senao se (sexo[i] == "M")
			{
				nomeM[i] = nome[i] 
				
			}
		}

		escreva("Nomes Femininos: \n")
		para (inteiro j = 0; j <5; j++)
		{
			se (sexo[j] == "F")
			{
			escreva(nomeF[j], ", ")
			}
		
		}

		escreva("\nNomes Masculinos:\n")
		para (inteiro j = 0; j < 5; j++)
		{
			se (sexo[j] == "M")
			{
				escreva(nomeM[j], ", ")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 440; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */