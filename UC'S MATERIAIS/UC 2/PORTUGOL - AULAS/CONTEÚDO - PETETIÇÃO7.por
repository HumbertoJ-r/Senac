programa
{
	
	funcao inicio()
	{
		cadeia userAdm = "", senhaAdm = ""
		caracter alterarDados = 'S'

		enquanto (alterarDados == 'S')
		{
			escreva ("Você deseja definir um novo nome de usuário administrador e senha? \n")
			leia (alterarDados)

			se (alterarDados == 'N' e userAdm == "" ou  senhaAdm == "")
			{
				escreva ("Você precisa realizar este cadatro no mínimo uma vez. \n")

				enquanto (userAdm == "" ou senhaAdm == "")
				{
					escreva("Cadastre seu nome de usuário administrador: \n")
					leia (userAdm)
					
					escreva("Cadastre sua senha de acesso: \n")
					leia (senhaAdm)
				}
				
			escreva ("Dados salvos com sucesso! | Usuário: ", userAdm, " | Senha: ", senhaAdm, " | \n")
			alterarDados = 'S'
			
			}

			senao se (alterarDados == 'S')
			{
				enquanto (userAdm == "" ou senhaAdm == "")
				{
					escreva("Cadastre seu nome de usuário administrador: \n")
					leia (userAdm)
					
					escreva("Cadastre sua senha de acesso: \n")
					leia (senhaAdm)
				}

				escreva("Dados salvos com sucessor! | Usuário: ", userAdm, " | Senha: ", senhaAdm, " | \n")
				escreva("Você deseja definir um novo nome de usuário administrador e senha? \n")
				leia (alterarDados)
			}
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 52; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */