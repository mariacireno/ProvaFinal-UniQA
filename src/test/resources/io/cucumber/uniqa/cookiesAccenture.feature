# language: pt

Funcionalidade: Acessar o site da accenture e aceitar os cookies do LGPD
		
    Cenario: Aceitar o cookie LGPD
        Dado que eu estou no site da accenture "https://www.accenture.com/br-pt"
        E aceito os termos LGPD
        Entao deve fechar a caixa de informacao
        E finalizar

    Cenario: Configuracoes do cookie
        Dado que eu estou no site da accenture "https://www.accenture.com/br-pt"
        E aceito os termos LGPD
        Entao deve fechar a caixa de informacao
        E clico em configuracoes de cookie
        Entao devo ver o item de "Sua privacidade"
        Entao devo ver 
        | Cookies estritamente necessárias |
        | Cookies Analíticos de Primeira Parte |
        | Cookies de Desempenho e Cookies Funcionais |
        | Cookies de Publicidade e Redes Sociais |
        