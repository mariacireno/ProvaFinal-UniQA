package io.cucumber.uniqa;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;

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
    	 WebElement input = browser.findElement(By.cssSelector(".onetrust-close-btn-handler"));
        input.click();
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
    public void devo_ver(io.cucumber.datatable.DataTable dataTable) {
    	
    	List<WebElement> lista = browser.findElements(By.cssSelector(".benefits-card-number"));
		for(WebElement e : lista) {
			System.out.println(e.getText());
			assertEquals(dataTable.toString(),e);
		}
		 
    	/*List<WebElement> itens;
		itens = browser.findElements( By.cssSelector(".w-dyn-itens") );

		boolean [] comparison = new boolean[dataTable.height()];

		for (int i = 0; i < itens.size(); i++) {
			for(int j = 0; j < dataTable.height(); j++) {
				if(dataTable.asList().get(j).matches(itens.get(i).getText())) comparison[j] = true;
			}			
		}

		for(int j = 0; j < dataTable.height(); j++) {
			assertEquals(true, comparison[j]);
		}
    	*/
    	
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
       
    }

}
