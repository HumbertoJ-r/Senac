programa
{
	
	funcao inicio()
	{
		//monte um algoritmo que receba o dia da semana em texto
		//que receba a hora 
		// e diga se o restaurante está indisponível ou disponível 
		// quando disponível, receba o nome da empresa e mostre na tela 
		// escrever mensagem "Restaurante reservado para nome da empresa, dia da semana às hs
		//funcionamento segunda a sexta 7hs ás 23hs 
		//sábados e domingos 7hs ás 15hs

		cadeia dia, empresa
		inteiro horas 
		logico indisponivel 
		

		escreva("Digite um dia da semana: ")
		leia(dia)

		escreva("Digite o horário desejado: ")
		leia(horas)
		
		escreva("Digite o nome da empresa que vai realizar a reserva: ")
		leia(empresa)

		se (dia == "sabado")
		{ 
			se (horas < 7)
			{
				escreva("Restautante indisponível")
			}
			senao se (horas > 15)
			{
				escreva("Restautante indisponível")
			}
			senao
			{
			escreva(empresa)
			escreva("\nRestaurante resevado para ", empresa, ":", dia, " às ", horas, " hs.")
			}
		}
		
		se (dia == "domingo")
		{ 
			se (horas < 7)
			{
				escreva("Restautante indisponível")
			}
			senao se (horas > 15)
			{
				escreva("Restautante indisponível")
			}
			senao 
			{
			escreva(empresa)
			escreva("\nRestaurante resevado para ", empresa, ":", dia, " às ", horas, " hs.")
			}
		}
		
		se (dia == "segunda")
		{ 
			se (horas < 7)
			{
				escreva("Restautante indisponível")
			}
			senao se (horas > 23)
			{
				escreva("Restautante indisponível")
			}
			senao 
			{
			escreva(empresa)
			escreva("\nRestaurante resevado para ", empresa, ":", dia, " às ", horas, " hs.")
			}
		}
			
		se (dia == "terca")
		{ 
			se (horas < 7)
			{
				escreva("Restautante indisponível")
			}
			senao se (horas > 23)
			{
				escreva("Restautante indisponível")
			}
			senao 
			{
			escreva(empresa)
			escreva("\nRestaurante resevado para ", empresa, ":", dia, " às ", horas, " hs.")
			}
		}
		
		se (dia == "quarta")
		{ 
			se (horas < 7)
			{
				escreva("Restautante indisponível")
			}
			senao se (horas > 23)
			{
				escreva("Restautante indisponível")
			}
			senao 
			{
			escreva(empresa)
			escreva("\nRestaurante resevado para ", empresa, ":", dia, " às ", horas, " hs.")
			}
		}
			
		se (dia == "quinta")
		{ 
			se (horas < 7)
			{
				escreva("Restautante indisponível")
			}
			senao se (horas > 23)
			{
				escreva("Restautante indisponível")
			}
			senao 
			{
			escreva(empresa)
			escreva("\nRestaurante resevado para ", empresa, ":", dia, " às ", horas, " hs.")
			}
		}
		
		se (dia == "sexta")
		{ 
			se (horas < 7)
			{
				escreva("Restautante indisponível")
			}
			senao se (horas > 23)
			{
				escreva("Restautante indisponível")
			}
			senao
			{ 
			escreva(empresa)
			escreva("\nRestaurante resevado para ", empresa, ":", dia, " às ", horas, " hs.")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */