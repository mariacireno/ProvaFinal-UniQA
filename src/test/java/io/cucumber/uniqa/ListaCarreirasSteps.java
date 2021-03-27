package io.cucumber.danilo;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class ListaCarreirasSteps extends BaseTest{
	
	
	
	@Dado("clico no icone")
	public void clico_no_icone() {
		fecharCookies();
	   WebElement input = browser.findElement(By.cssSelector(".nav-icon-container"));
	   input.click();
	}

	
	
	@Dado("clico no menu carreiras")
	public void clico_no_menu_carreiras() throws InterruptedException {
		Thread.sleep(3000);
	   WebElement input = browser.findElement(By.cssSelector("div[data-id='primaryLink4_Carreiras\']"));
	   input.click();
	}
	
	@Dado("clico em explorar vagas")
	public void clico_em_explorar_vagas() throws InterruptedException {
		Thread.sleep(3000);
	   WebElement input = browser.findElement(By.cssSelector("li[data-tertiary='carreiras-explorarvagas']"));
	   input.click();
	}

	@Dado("clico no item do menu vagas em tecnologia")
	public void clico_no_item_do_menu_vagas_em_tecnologia() throws InterruptedException {
		Thread.sleep(3000);
		WebElement input = browser.findElement(By.cssSelector("#tertiaryListContainer > ul > li:nth-child(6) > a"));
		input.click();
	    
	}
	
	@Entao("devo ver em destaque {string}")
	public void devo_ver_em_destaque(String string) throws InterruptedException {
		Thread.sleep(3000);
	    WebElement input = browser.findElement(By.cssSelector(".col-xs-12.col-sm-6.hero-content "));
	    System.out.println(input.getText());
	    assertEquals(true, input.getText().contains(string));
	}
	
	

	@Dado("digito no campo de busca {string}")
	public void digito_no_campo_de_busca(String string) {
		WebElement input = browser.findElement(By.cssSelector(""));
		input.sendKeys(string);
	   
	}

	@Dado("clico no botao procurar")
	public void clico_no_botao_procurar() {
	    WebElement input = browser.findElement(By.cssSelector(""));
	    input.click();
	}

	@Entao("devo encontrar vagas para programadores")
	public void devo_encontrar_vagas_para_programadores() {
		WebElement input = browser.findElement(By.cssSelector(""));
		assertEquals(true, input!=null);
	}

}
