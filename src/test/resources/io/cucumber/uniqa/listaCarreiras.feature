# language: pt

Funcionalidade: Acessar a lista de carreiras da accenture


	Cenario: Acessar o item de vagas de tecnologia
	Dado que eu estou no site da accenture
	E clico no menu carreiras
	E clico no item do menu vagas em tecnologia
	Entao devo ver o destaque carreira em "Carreiras em tecnologia"
	
	@ignore
	Cenario: procurando uma vaga
  Dado que eu estou no site da accenture 
  E clico na lupa de pesquisa
  E digito no campo de busca "desenvolvedor"
  E clico no botao procurar
  Entao devo encontrar vagas para programadores
	

	
