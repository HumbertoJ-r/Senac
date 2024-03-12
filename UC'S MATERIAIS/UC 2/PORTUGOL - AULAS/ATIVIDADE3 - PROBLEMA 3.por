programa
{
	
	funcao inicio()
	{

	 caracter saida = 'S'
	 cadeia nome [15], pesquisar, sair 
	 caracter opcao = ' '
	 inteiro i = 0
	 logico encontrado = falso


	 
	
		enquanto (saida == 'S')
		{
			escreva("\n1 - Cadastrar\n")
			escreva("2 - Pesquisar\n")
			escreva("3 - Sair\n")

			escreva("\nDigite o número da Opção desejada: \n")
			leia(opcao)
			
			se(opcao == '1') 
			{
				escreva("\nDigite o nome do hóspede: \n")
				leia(nome[i])
				i++
				escreva("\nNome cadastrado com sucesso!!!\n")
			}

			senao se (opcao == '2')
			{
				escreva("\nDigite o nome do hóspede desejado aqui: \n")
				leia(pesquisar)
				encontrado = falso
				
				para(inteiro linha =0; linha < 15; linha++)
				{
					se (nome[linha] == pesquisar)
					{
						escreva ("\nHospede ", nome[linha], "encontrado\n")
						encontrado = verdadeiro
					}

					
				}

				se(encontrado == falso)
				{
					escreva("\nHospede ", pesquisar, " não encontrado\n")
				}
				
			}

			senao se (opcao == '3')
			{
				escreva("\nDeseja sair do programa. S/N: ")
				leia(saida)
				
			}

			senao 
			{
				escreva("\nOpção inválida. \n")
			}

			
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 9; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {nome, 8, 9, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */