package io.cucumber.uniqa;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebElement;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

import io.cucumber.datatable.DataTable;

public class CookiesSteps {
            
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
