# language: pt

Funcionalidade: Acessar a lista de carreiras da accenture

	
	Cenario: Acessar o item de vagas de tecnologia
	Dado que eu estou no site da accenture
	E clico no icone
	E clico no menu carreiras
	E clico em explorar vagas
	E clico no item do menu vagas em tecnologia
	Entao devo ver o destaque em "Carreiras em Tecnologia"
	
	@ignore
	Cenario: Procurando uma vaga
	Dado que eu estou no site da accenture
	E digito no campo de busca "desenvolvedor"
	E clico no botao procurar
	Entao devo encontrar vagas para programadores	
	

	
