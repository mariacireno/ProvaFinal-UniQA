
# language: pt
Funcionalidade: Procurar vaga no site da Accenture

    Cenario: procurando uma vaga
        Dado que eu estou no site da accenture "https://www.accenture.com/br-pt"
        E clico na lupa de pesquisa
        E digito no campo de busca "desenvolvedor"
        E clico no botao procurar
        Entao devo encontrar vagas para programadores
