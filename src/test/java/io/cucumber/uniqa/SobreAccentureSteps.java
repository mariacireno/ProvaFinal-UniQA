package io.cucumber.uniqa;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class SobreAccentureSteps extends BaseTest {

    // @Dado("que eu estou no site da accenture")
    // public void entrarNoSiteAccenture() {
    //     inicializar();
    //     carregarPagina();
    // }    

	@Dado("clico no menu sobre a accenture")
	public void clico_no_menu_sobre_a_accenture() {  
		fecharCookies();     
		WebElement input = browser.findElement(By.cssSelector("#navigation-menu > div:nth-child(5) > div.gh-item.nav-submenu-label > span"));
	    input.click();
	}

	@Dado("clico no item do menu sobre a accenture")
	public void clico_no_item_do_menu_sobre_a_accenture() throws InterruptedException {
		Thread.sleep(2000);	    
		browser.findElement( By.cssSelector("a[href='/br-pt/about/company-index']")).click();
	}

	@Entao("devo ver o destaque em {string}")
	public void devo_ver_o_destaque_em(String string) {
	   WebElement input = browser.findElement(By.cssSelector(".row.new-row"));
	   assertEquals(true, input.getText().contains(string));
	   finalizar();
	}
    
}
