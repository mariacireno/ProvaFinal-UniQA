## *Descrição do desafio*: Criar uma aplicação Selenium com os seguintes casos de teste<br>

> Status do Projeto: Concluído :heavy_check_mark:<br>

### Integrantes:<br>

- Maria Cireno<br>
- Maria Natália<br>
- Fernanda Monique<br>
- Layane Bastos<br>
- Jessica Cordeiro<br>
- Graziela Franzoni<br>
---------------------------------------------------------------------------
### Caso de teste 1<br>
Acessar o site da Accenture e aceitar os cookies do LGPD<br>

#### Cenário 1<br>
Aceitar o cookie LGPD:<br>
   - [x] Dado que eu estou no site da accenture<br>
   - [x] E aceito os termos LGPD<br>
   - [x] Então deve fechar a caixa de informação<br><br>

#### Cenário 2<br> 
Configurações do cookie:<br>
   - [x] Dado que eu estou no site da accenture<br>
   - [x] E aceito os termos LGPD<br>
   - [x] E clico em configurações de cookie<br>
   - [x] Então devo ver o item de "sua privacidade"<br>
   - [x] E devo ver "Cookies estritamente necessárias"<br>
   - [x] E devo ver "Cookies Analíticos de Primeira Parte"<br>
   - [x] E devo ver "Cookies de Desempenho e Cookies Funcionais"<br>
   - [x] E devo ver "Cookies de Publicidade e Redes Sociais"<br>
---------------------------------------------------------------------------
### Caso de teste 2<br>
Acessar o site da Accenture a mostrar a lista de serviços<br>

#### Cenário 3<br>
Menu "Serviços" da Accenture:<br>
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

#### Cenário 4<br> 
Clicar no serviço Cloud:<br>
   - [x] Dado que eu estou no site da Accenture<br>
   - [x] E clico no menu Serviços<br>
   - [x] E clico no item do menu Cloud<br>
   - [x] Então devo encontrar o título "Servicos de Cloud"<br>
---------------------------------------------------------------------------
### Caso de teste 3<br>
Acessar menu Carreiras da Accenture<br>

#### Cenário 5<br>
Acessar o menu Carreiras e submenu Vagas de Tecnologia:<br>
   - [x] Dado que eu estou no site da Accenture<br>
   - [x] E clico no menu Carreiras<br>
   - [x] E clico no item do menu Vagas em Tecnologia<br>
   - [x] Então devo ver o destaque em "Carreiras em Tecnologia"<br>

#### Cenário 6<br>
Procurando uma vaga:<br>
   - [x] Dado que eu estou no site da Accenture<br>
   - [x] E digito no campo de busca "Desenvolvedor"<br>
   - [x] E clico no botão Procurar<br>
   - [x] Então devo encontrar Vagas para Programadores<br>
---------------------------------------------------------------------------
### Caso de teste 4<br>
### Sobre a Accenture<br>

#### Cenário 7
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
#### Entrando na pasta do projeto<br>

```bash
cd ProvaFinal-UniQA-master
```

#### Configurando Selenium no seu computador<br>
Fazendo download do Chrome Webdriver e colocar o arquivo descompactado da pasta driver na raiz do projeto<br>
>https://chromedriver.chromium.org/downloads<br>
##### Exemplo<br>

```bash
cd driver https://chromedriver.storage.googleapsis.com/89.0.4389.23/chrome_1inux64.zip
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