## *Descrição do desafio*<br>
Integrantes:<br>

- Maria Cireno<br>
- Maria Natália<br>
- Fernanda Monique<br>
- Layane Bastos<br>
- Jessica Cordeiro<br>
- Graziela Franzoni<br>
---------------------------------------------------------------------------
### Criar uma aplicação Selenium com os seguintes casos de teste:<br>
### Caso de teste 1:<br>
Acessar o site da Accenture e aceitar os cookies do LGPD<br>

#### Cenário 1:<br>
Aceitar o cookie LGPD<br>
   - [x] Dado que eu estou no site da accenture<br>
   - [x] E aceito os termos LGPD<br>
   - [x] Então deve fechar a caixa de informação<br><br>

#### Cenário 2:<br> 
Configurações do cookie<br>
   - [x] Dado que eu estou no site da accenture<br>
   - [x] E aceito os termos LGPD<br>
   - [x] E clico em configurações de cookie<br>
   - [x] Então devo ver o item de "sua privacidade"<br>
   - [x] E devo ver "Cookies estritamente necessárias"<br>
   - [x] E devo ver "Cookies Analíticos de Primeira Parte"<br>
   - [x] E devo ver "Cookies de Desempenho e Cookies Funcionais"<br>
   - [x] E devo ver "Cookies de Publicidade e Redes Sociais"<br>
---------------------------------------------------------------------------
### Caso de teste 2:<br>
Acessar o site da Accenture a mostrar a lista de serviços<br>

#### Cenário 3:
Menu "Serviços" da Accenture<br>
   - [x] Dado que eu estou no site da Accenture<br>
   - [x] E clico no menu serviços<br>
   - [x] Então devo ver os servicos abaixo<br>
         |-- Accenture Strategy
         |-- Application Services
         |-- Artificial Intelligence
         |-- Automation
         |-- Business Process Services
         |-- Change Management
         |-- Cloud
         |-- Customer Experience
         |-- Data & Analytics
         |-- Ecosystem Partners
         |-- Finance Consulting
         |-- Industry X
         |-- Infrastructure
         |-- Marketing
         |-- Mergers & Acquisitions (M&A)
         |-- Operating Models
         |-- Security
         |-- Supply Chain Management
         |-- Sustainability
         |-- Technology Consulting
         |-- Technology Innovation
         |-- Zero Based Budgeting (ZBB)

<br>Cenario:</br> Clicar no servico cloud
Dado que eu estou no site da Accenture<br>
E clico no menu servicos<br>
E clico no item do menu cloud<br>
Entao devo encontrar o titulo "Servicos de Cloud"<br>
---------------------------------------------------------------------------<br>
###Caso de teste 3<br>
###Acessar a lista de carreiras da Accenture<br><br>

<brCenario:</br> Acessar o item de vagas de tecnologia<br>
Dado que eu estou no site da Accenture<br>
E clico no menu carreiras<br>
E clico no item do menu vagas em tecnologia<br>
Entao devo ver o destaque em "Carreiras em Tecnologia"<br>

<br>Cenario:</br> Procurando uma vaga<br>
Dado que eu estou no site da Accenture<br>
E digito no campo de busca "Desenvolvedor"<br>
E clico no botao procurar<br>
Entao devo encontrar vagas para programadores<br>
---------------------------------------------------------------------------<br>
###Caso de teste 4<br>
###Sobre a Accenture<br>

<br>Cenario:</br> Ver as caracteristicas da Accenture<br>
Dado que eu estou no site da accenture<br>
E clico no menu Sobre a Accenture<br>
E clico no item do menu Sobre a Accenture<br>
Entao devo ver o destaque em "Nosso propósito"<br>
---------------------------------------------------------------------------<br>
##Tecnologias utilizadas<br>
:heavy_check_mark: <br>Java</br><br>
Linguagem de programacao para desenvolvedores<br>

:heavy_check_mark: <br>Maven</br><br>
Gerenciador de dependencias para o Java<br>

:heavy_check_mark: <br>Cucumber</br><br>
Framework responsavel por traduzir uma linguagem humana em codigo Java<br>

:heavy_check_mark: <br>Selenium</br><br>
Framework responsavel por fazer a integracao do codigo Java com a linguagem Gurking (Cucumber) abrindo o browser fazendo o teste de comportamento<br>
---------------------------------------------------------------------------
##Como utilizar<br>
##Pre-requisitos<br>
<ul>
  <l1>aa</l1> Instalar o java: https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR<br>
  <l1>aa</l1> Instalar jdk https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html<br>
  <l1>aa</l1> Verificar se o JAVA_HOME está configurado em seu computador<br>
  <l1>aa</l1> Layane Bastos<br>
  <l1>aa</l1> Jessica Cordeiro<br>
  <l1>aa</l1> Graziela Franzoni<br>
</ul>      
<l1>aa<l1</l1>Clone do projeto 
```bash
git clone https://github.com/mariacireno/ProvaFinal-UniQA.git<br>
```
<l1>aa</l1> Entrando na pasta do projeto<br>
```bash
cd ProvaFinal-UniQA-master<br>
<l1>aa</l1> Configurando Selenium em seu computador
Fazendo download do Chrome Webdriver e colocar o arquivo descompactado da pasta driver na raiz do projeto<br>
https://chromedriver.chromium.org/downloads<br>
<br>Exemplo</br><br>
```bash
cd driver https://chromedriver.storage.googleapsis.com/89.0.4389.23/chrome_1inux64.zip
unzip chromedriver_linux64.zip
rm -rf chromedriver_linux64.zip
cd ../driver<br>
<l1>aa</l1> Limpando e validando o Maven Windows
```bash
mvnw.cmd clean<br>
<l1>aa</l1> Limpando e validando Maven Unix
```bash
./mvnw clean
<l1>aa</l1> Executando teste no Unix
```bash
./test.sh
<l1>aa</l1> Executando teste no Windows
```bash
test.bat
---------------------------------------------------------------------------
##Estrutura de arquivos
<pre>
driver<br> 
```bash
      |-- chromedriver -- Este eh o arquivo do selenium webdriver, substitua este arquivo com a versao da sua maquina
  mvnw<br>
  mvnw.cmd<br>
  pom.xml<br>
  src<br>
    |-- test<br>
    |  |-- java<br>
    |  |  |-- io<br>
    |  |  |  |-- cucumber<br>
    |  |  |  |  |-- danilo<br>
    |  |  |  |  |  |-- RunCucumberTest.java -- Arquivo que configura a inicialização do Java test<br> 
    |  |  |  |  |  |-- ValidarCpfStep.java -- Passos escritos em java com selenium abrindo o browser e testando a aplicação<br>
    |  |-- resources<br>
    |  |  |-- io<br>
    |  |  |  |-- cucumber<br>
    |  |  |  |  |-- danilo<br>
    |  |  |  |  |  |-- validadorCpf.feature -- Gherkin com os cenários de teste de acordo com o meu cliente<br>
  test.bat -- Arquivo para rodar teste no Windows<br>
  test.sh -- Arquivo para rodar teste no Unix<br>
  </pre>