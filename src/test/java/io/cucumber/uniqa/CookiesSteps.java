package io.cucumber.uniqa;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebElement;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;

import io.cucumber.datatable.DataTable;

public class CookiesSteps {

    @Dado("aceito os termos LGPD")
    public void aceito_os_termos_LGPD() {
       WebElement input = BaseTest.elementoCSS("#onetrust-pc-btn-handler");
       input.click();
    }
     
    @Entao("deve fechar a caixa de informacao")
	public void deve_fechar_a_caixa_de_informacao() {
        WebElement input = BaseTest.elementoCSS(".onetrust-close-btn-handler");
        input.click();
	}    

    @E("finalizar")
	public void deve_fechar_a_caixa_de_informacao_depois_continuar() {
        BaseTest.finalizar();
	}    
            
    @Dado("clico em configuracoes de cookie")
    public void clico_em_configuracoes_de_cookie() {
    	 WebElement input = BaseTest.elementoCSS("#optanon-minimize-button");
         input.click();
    }

    @Entao("devo ver o item de {string}")
    public void devo_ver_o_item_de(String string) {
    	 WebElement input = BaseTest.elementoCSS("#privacy-text");
    	 assertEquals(string, input.getText());
    }

    @Entao("devo ver")
    public void devo_ver(DataTable dataTable) {
    	
    	List<WebElement> lista = BaseTest.elementosCSS(".ot-sdk-row");

        WebElement e = lista.get(0);

        for(int i = 0; i < dataTable.height(); i++) {
            assertEquals(true, e.getText().contains(dataTable.asList().get(i)));
        }
       
        BaseTest.finalizar();	
   	       
       
    }

}
