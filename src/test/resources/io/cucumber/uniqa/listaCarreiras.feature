# language: pt

Funcionalidade: Acessar a lista de carreiras da accenture
	
	Cenario: Acessar o item de vagas de tecnologia
		Dado que eu estou no site da accenture "https://www.accenture.com/br-pt"
		E clico no menu carreiras
		E clico no item do menu vagas em tecnologia
		Entao devo ver o destaque carreira em "Carreiras em tecnologia"
	
	Cenario: procurando uma vaga pela busca
		Dado que eu estou no site da accenture "https://www.accenture.com/br-pt"
		E clico na lupa de pesquisa
		E digito no campo de busca "desenvolvedor"
		E clico no botao procurar
		Entao devo encontrar vagas para programadores

	Cenario: procurando uma vaga pelo menu
		Dado que eu estou no site da accenture "https://www.accenture.com/br-pt"
		E clico no menu carreiras
		E clico no item procure por vagas
		E digito no campo para buscar "desenvolvedor"
		E clico no botao buscar
		Entao devo encontrar vagas para programadores pelo menu
	

	
