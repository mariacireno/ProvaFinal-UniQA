package io.cucumber.uniqa;

import org.openqa.selenium.WebElement;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class CommonSteps {

    @Dado("que eu estou no site da accenture {string}")
    public void que_eu_estou_no_site_da_accenture(String string) {
        BaseTest.inicializar(string);
    }
    
    @Entao("deve fechar a caixa de informacao")
	public void deve_fechar_a_caixa_de_informacao() {
        BaseTest.fecharCookies();
        BaseTest.finalizar();
	}    
    
    @Entao("deve fechar a caixa de informacao depois continuar")
    public void deve_fechar_a_caixa_de_informacao_e_continuar() {
    	BaseTest.fecharCookies();
    }

    @Dado("aceito os termos LGPD")
    public void aceito_os_termos_LGPD() {
       WebElement input = BaseTest.elementoCSS("#onetrust-pc-btn-handler");
       input.click();
    }
    
}
