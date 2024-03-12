programa
{
	
	funcao inicio()
	{
		cadeia sexo  [5] 
		cadeia nome  [5] 
		cadeia sexoMasc = "M", sexoFemino = "F", nomeFemino ="", nomeMasc ="" 

		para (inteiro i = 0; i <5; i++)
		{
			escreva("Digite o nome do hóspede: \n")
			leia(nome[i])
			escreva("Digite o sexo do hóspde: \n")
			leia(sexo[i])

			se (sexo[i] == "F")
			{
				sexo[i] = sexoFemino
				nomeFemino = nome [i] + sexo[i]
			}

			senao se (sexo[i] == "M")
			{
				sexo[i] = sexoMasc
				nomeMasc = nome[i] + sexo[i]
			}

			i++
		}

		para (inteiro j = 0; j < 5; j++)
		{
			escreva(nomeFemino)
			escreva(nomeMasc)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 391; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */