package io.cucumber.uniqa;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebElement;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class ListaCarreirasSteps {

	@Dado("clico no menu carreiras")
	public void clico_no_menu_carreiras() throws InterruptedException {
		BaseTest.fecharCookies();
		Thread.sleep(3000);
	   	WebElement input = BaseTest.elementoCSS("div[data-id='primaryLink4_Carreiras\']");
	   	input.click();
	}

	@Dado("clico no item do menu vagas em tecnologia")
	public void clico_no_item_do_menu_vagas_em_tecnologia() throws InterruptedException {
		Thread.sleep(3000);
		WebElement input = BaseTest.elementoCSS("a[data-analytics-link-name='vagas em tecnologia']");
		input.click();
	    
	}
	
	@Entao("devo ver o destaque carreira em {string}")
	public void devo_ver_o_destaque_carreira_em(String string) throws InterruptedException {
		Thread.sleep(3000);
	    WebElement input = BaseTest.elementoCSS("h1.area-of-interest-title.page-title-long");
	    assertEquals(true, input.getText().contains(string));
		BaseTest.finalizar();
	}

	@Dado("clico na lupa de pesquisa")
	public void clico_na_lupa_de_pesquisa() throws InterruptedException {
		BaseTest.fecharCookies();
		Thread.sleep(3000);
		WebElement input = BaseTest.elementoCSS("a[class='ion-ios-search serp']");
		input.click();
	}

	@Entao("devo encontrar vagas para programadores")
	public void devo_encontrar_vagas_para_programadores() throws InterruptedException {
		Thread.sleep(3000);
		assertEquals(BaseTest.getCurrentUrl(), "https://www.accenture.com/br-pt/search/results?srk=desenvolvedor&pg=1&sb=0&filter=");
		BaseTest.finalizar();
	}

	@Dado("clico no botao procurar")
    public void clico_no_botao_procurar() throws InterruptedException {
		Thread.sleep(3000);
        WebElement input = BaseTest.elementoCSS("span[class='search-text']");
        input.click();
    }

	@Dado("digito no campo de busca {string}")
    public void digito_no_campo_de_busca(String string) throws InterruptedException {
		Thread.sleep(3000);
        WebElement input = BaseTest.elementoCSS("#search-form-label");
        input.sendKeys(string);
    }


}
