package io.cucumber.uniqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class ProcurandoVaga extends BaseTest {

    @Dado("que eu estou no site da accenture {string}")
    public void que_eu_estou_no_site_da_accenture(String string) {
        browser.get(string);
    }

    @Dado("clico na lupa de pesquisa")
    public void clico_na_lupa_de_pesquisa() {
        WebElement input = browser.findElement( By.cssSelector("a[class='ion-ios-search serp']"));
            input.click();

    }
    @Dado("digito no campo de busca {string}")
    public void digito_no_campo_de_busca(String string) {
        WebElement input = browser.findElement( By.cssSelector("#search-form-label"));
            input.sendKeys(string);
    }

    @Dado("clico no botao procurar")
    public void clico_no_botao_procurar() {
        WebElement input = browser.findElement( By.cssSelector("span[class='search-text']"));
            input.click();
    }

    @Entao("devo encontrar vagas para programadores")
    public void devo_encontrar_vagas_para_programadores() {
        WebElement input = browser.findElement( By.cssSelector(".h3.all-results eyebrow-title"));
    
    }
    
}
