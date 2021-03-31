## Descrição do desafio: criar uma aplicação Selenium com os seguintes casos de teste<br>

> Status do Projeto: Concluído :heavy_check_mark:<br>

#### Grupo UniQA<br>
##### Integrantes:<br>

- Maria Cireno<br>
- Maria Natália<br>
- Fernanda Monique<br>
- Layane Bastos<br>
- Jessica Cordeiro<br>
- Graziela Franzoni<br>
---------------------------------------------------------------------------
### Caso de teste 1<br>
Acessar o site da Accenture e aceitar os cookies do LGPD<br>

#### Cenário 1:<br>
Aceitar o cookie LGPD<br>
   - [x] Dado que eu estou no site da accenture<br>
   - [x] E aceito os termos LGPD<br>
   - [x] Então deve fechar a caixa de informação<br>
   - [x] E finalizar<br>

#### Cenário 2:<br> 
Configurações do cookie<br>
   - [x] Dado que eu estou no site da accenture "https://www.accenture.com/br-pt"<br>
   - [x] E aceito os termos LGPD<br>
   - [x] Entao deve fechar a caixa de informacao<br>
   - [x] E clico em configuracoes de cookie<br>
   - [x] Entao devo ver o item de "Sua privacidade"<br>
   - [x] Entao devo ver <br>
         |-- Cookies estritamente necessárias<br>
         |-- Cookies Analíticos de Primeira Parte<br>
         |-- Cookies de Desempenho e Cookies Funcionais<br>
         |-- Cookies de Publicidade e Redes Sociais<br>

---------------------------------------------------------------------------
### Caso de teste 2<br>
Acessar o site da Accenture a mostrar o menu Serviços<br>

#### Cenário 3:<br>
Menu "Serviços" da Accenture<br>
   - [x] Dado que eu estou no site da Accenture<br>
   - [x] E clico no menu serviços<br>
   - [x] Então devo ver os serviços abaixo<br>
         |-- Accenture Strategy<br>
         |-- Application Services<br>
         |-- Artificial Intelligence<br>
         |-- Automation<br>
         |-- Business Process Services<br>
         |-- Change Management<br>
         |-- Cloud<br>
         |-- Customer Experience<br>
         |-- Data & Analytics<br>
         |-- Ecosystem Partners<br>
         |-- Finance Consulting<br>
         |-- Industry X<br>
         |-- Infrastructure<br>
         |-- Marketing<br>
         |-- Mergers & Acquisitions (M&A)<br>
         |-- Operating Models<br>
         |-- Security<br>
         |-- Supply Chain Management<br>
         |-- Sustainability<br>
         |-- Technology Consulting<br>
         |-- Technology Innovation<br>
         |-- Zero Based Budgeting (ZBB)<br>

#### Cenário 4:<br> 
Clicar no serviço Cloud:<br>
   - [x] Dado que eu estou no site da Accenture<br>
   - [x] E clico no menu Serviços<br>
   - [x] E clico no item do menu Cloud<br>
   - [x] Então devo encontrar o título "Servicos de Cloud"<br>
   
---------------------------------------------------------------------------
### Caso de teste 3<br>
Acessar menu Carreiras da Accenture<br>

#### Cenário 5:<br>
Acessar o menu Carreiras e submenu Vagas de Tecnologia<br>
   - [x] Dado que eu estou no site da Accenture<br>
   - [x] E clico no menu Carreiras<br>
   - [x] E clico no item do menu Vagas em Tecnologia<br>
   - [x] Então devo ver o destaque em "Carreiras em Tecnologia"<br>

#### Cenário 6:<br>
Procurando uma vaga pela busca:<br>
   - [x] Dado que eu estou no site da Accenture<br>
   - [x] E clico na lupa de pesquisa
   - [x] E digito no campo de busca "Desenvolvedor"<br>
   - [x] E clico no botão Procurar<br>
   - [x] Então devo encontrar Vagas para Programadores<br>

#### Cenário 7:<br>
Procurando uma vaga pelo menu:<br>
   - [x] Dado que eu estou no site da Accenture<br>
   - [x] E clico no menu carreiras<br>
   - [x] E clico no item procure por vagas<br>
   - [x] E digito no campo para buscar "desenvolvedor"<br>
   - [x] E clico no botao buscar<br>
   - [x] Entao devo encontrar vagas para programadores pelo menu<br>
	
---------------------------------------------------------------------------
### Caso de teste 4<br>
Sobre a Accenture<br>

#### Cenário 8:<br>
Ver as caracteristicas da Accenture<br>
   - [x] Dado que eu estou no site da accenture<br>
   - [x] E clico no menu Sobre a Accenture<br>
   - [x] E clico no item do menu Sobre a Accenture<br>
   - [x] Então devo ver o destaque em "Nosso propósito"<br>

---------------------------------------------------------------------------
### Tecnologias utilizadas:<br>

   - [x] Java: Linguagem de programacão para desenvolvedores<br>
   - [x] Maven: Gerenciador de dependencias para o Java<br>
   - [x] Cucumber: Framework responsável por traduzir uma linguagem humana em código Java<br>
   - [x] Selenium: Framework responsável por fazer a integracão do código Java com a linguagem Gurking (Cucumber), abrindo o browser fazendo o teste de comportamento<br>
---------------------------------------------------------------------------
### Pré-requisitos:<br>

   - [x] Instalar o Java: https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR<br>
   - [x] Instalar JDK https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html<br>
   - [x] Verificar se o JAVA_HOME está configurado no seu computador<br>
---------------------------------------------------------------------------     
#### Clone do projeto:<br> 

```bash
git clone > https://github.com/mariacireno/ProvaFinal-UniQA.git
```
#### Entrando na pasta do projeto (exemplo):<br>

```bash
cd ProvaFinal-UniQA-master
```

#### Configurando Selenium no seu computador:<br>
Fazendo download do Chrome Webdriver e colocar o arquivo descompactado da pasta driver na raiz do projeto<br>
>https://chromedriver.chromium.org/downloads<br>
##### Exemplo<br>

```bash
cd driver >https://chromedriver.storage.googleapsis.com/89.0.4389.23/chrome_1inux64.zip
unzip chromedriver_linux64.zip
rm -rf chromedriver_linux64.zip
cd ../driver<br>
```

#### Limpando e validando o Maven Windows:
```bash
mvnw.cmd clean<br>
```

#### Limpando e validando Maven Unix:
```bash
./mvnw clean
```

#### Executando teste no Unix:
```bash
./test.sh
```
#### Executando teste no Windows:
```bash
test.bat
```
---------------------------------------------------------------------------
## Estrutura de arquivos:
<pre>
driver
    |-- chromedriver -- Este é o arquivo do selenium webdriver, substitua este arquivo com a versão da sua máquina
src
    |-- test
    |  |-- java
    |  |  |-- io
    |  |  |  |-- cucumber
    |  |  |  |  |-- uniqa
    |  |  |  |  |  |-- BaseTest.java -- Arquivo que configura a inicialização do Java test
    |  |  |  |  |  |-- CommomSteps.java -- Arquivo que tem todos os passos em comum com os outros Steps        
    |  |  |  |  |  |-- CookiesSteps.java -- Passos escritos em java com selenium abrindo o browser e testando a aplicação    
    |  |  |  |  |  |-- ListaCarreiras.java -- Passos escritos em java com selenium abrindo o browser e testando a aplicação 
    |  |  |  |  |  |-- RunCucumberTest.java -- Arquivo que configura a inicialização do Java test
    |  |  |  |  |  |-- ServicosSteps.java -- Passos escritos em java com selenium abrindo o browser e testando a aplicação
    |  |  |  |  |  |-- SobreAccenture.java -- Passos escritos em java com selenium abrindo o browser e testando a aplicação
    |  |-- resources
    |  |  |-- io
    |  |  |  |-- cucumber
    |  |  |  |  |-- uniqa
    |  |  |  |  |  |-- cookiesAccenture.feature -- Gherkin com os cenários de teste de acordo com o que o cliente solicitou
    |  |  |  |  |  |-- listaCarreiras.feature -- Gherkin com os cenários de teste de acordo com o que o cliente solicitou
    |  |  |  |  |  |-- servicosAccenture.feature -- Gherkin com os cenários de teste de acordo com o que o cliente solicitou
    |  |  |  |  |  |-- sobreAccenture.feature -- Gherkin com os cenários de teste de acordo com o que o cliente solicitou 
  mvnw -- Arquivo sobre qual versão foi utilizada no projeto
  mvnw.cmd -- Arquivo de como deve ser feita a configuração do Maven
  pom.xml -- Arquivo com todas as dependências utilzadas no projeto
  README.md -- Arquivo com a documentação do projeto
  test.bat -- Arquivo para rodar teste no Windows
  test.sh -- Arquivo para rodar teste no Unix
  </pre>
