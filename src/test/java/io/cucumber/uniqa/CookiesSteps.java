package io.cucumber.uniqa;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;

import io.cucumber.datatable.DataTable;

public class CookiesSteps extends BaseTest {

    @Dado("que eu estou no site da accenture")
    public void entrarNoSiteAccenture() {
        inicializar();
        carregarPagina();
    }    
    
    @Dado("aceito os termos LGPD")
    public void aceito_os_termos_LGPD() {
       WebElement input = browser.findElement(By.cssSelector("#onetrust-pc-btn-handler"));
       input.click();
    }

    @Entao("deve fechar a caixa de informacao")
    public void deve_fechar_a_caixa_de_informacao() {
    	fecharCookies();
        finalizar();
    }

    @Entao("deve fechar a caixa de informacao depois continuar")
    public void deve_fechar_a_caixa_de_informacao_e_continuar() {
    	fecharCookies();
    }
    
    @Dado("clico em configuracoes de cookie")
    public void clico_em_configuracoes_de_cookie() {
    	 WebElement input = browser.findElement(By.cssSelector("#optanon-minimize-button"));
         input.click();
    }

    @Entao("devo ver o item de {string}")
    public void devo_ver_o_item_de(String string) {
    	 WebElement input = browser.findElement(By.cssSelector("#privacy-text"));
    	 assertEquals(string, input.getText());
    }

    @Entao("devo ver")
    public void devo_ver(DataTable dataTable) {
    	
    	List<WebElement> lista = browser.findElements(By.cssSelector(".ot-sdk-row"));

        WebElement e = lista.get(0);

        for(int i = 0; i < dataTable.height(); i++) {
            assertEquals(true, e.getText().contains(dataTable.asList().get(i)));
        }
       
        finalizar();		
   	       
       
    }

}
