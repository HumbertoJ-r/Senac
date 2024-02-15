programa
{
	
	funcao inicio()
	{
		
		inteiro quarto, cont = 0  //Verifica o quarto digitado;
		inteiro i = 1 //Contador para no maximo 20 quartos;
		cadeia numQuarto[21] //Dentro de cada quarto, recebemos um caracter 'l' ou 'o'.
		cadeia status = " "
		cadeia ocupado = "Ocupado"
		cadeia livre = "Livre"
		caracter continuar = 's'


			  enquanto (continuar == 's' e cont < 20)    
			  {
					 escreva ("Digite o número do quarto que deseja: ")
					 leia(quarto)
					 escreva("Digite aqui se o quarto está livre ou ocupado? l/o")
					 leia(status)			
					//Aqui deve ser lido o numero do quarto e o status.
			
			
			            se(status == "o") //Verifica o status digitado. Caso for "o", passa a variável ocupado para status.
			            {
			            	status = ocupado//Passar a variável ocupado para status
						numQuarto[quarto] = status//Armazenar a variável status no vetor numQuarto[quarto]
						
			            }
			
			
			            senao se(status == "l") //Verifica o status digitado. Caso for "l", passa a vari[avel livre para status.
			            {
			            	status = livre//Passar a variável livre para status
						numQuarto[quarto] = status//Armazenar a variável status no vetor numQuarto[quarto]
						
			            }
						 //Incrementa a contagem do indice
			            i++
						escreva("Deseja continuar? S/N")
						leia(continuar) //Deve-se perguntar se o usuário deseja continuar ou não, para rodar o loop    
			          }
			
			          para(i = 1; i < 21; i++)
			          {
			          
			           se(numQuarto[i] == " ") //Verifica se a variável quarto não tem valor. Se não tiver nada (nem livre nem ocupado), colocamos como livre.
			          
			          {
			          				          
			          	escreva(i, " - ", numQuarto[i], "Livre \n")
			          }

			          senao
			          {
			            escreva (i, " - ", numQuarto[i], "\n") //Exibe o vetor dos quartos e status.
			          }
			          }      
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2006; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */