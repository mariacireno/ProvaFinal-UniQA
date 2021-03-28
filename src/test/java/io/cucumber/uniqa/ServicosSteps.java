package io.cucumber.uniqa;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebElement; 
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;

import io.cucumber.datatable.DataTable;

public class ServicosSteps extends BaseTest {
  

    @Dado("clico no menu servicos")
	public void clico_no_menu_servicos() {
	    BaseTest.fecharCookies();
	    WebElement input = BaseTest.elementoCSS("div[data-analytics-link-name='serviços']");
		input.click();
	}

	@Entao("devo ver os servicos abaixo")
	public void devo_ver_os_servicos_abaixo(DataTable dataTable) throws InterruptedException {
		Thread.sleep(3000);
		List<WebElement> lista = BaseTest.elementosCSS(".nav-submenu.panel.layout-column.short.border-bottom");
		
        WebElement e = lista.get(0);
		
        for(int i = 0; i < dataTable.height(); i++) {
            assertEquals(true, e.getText().contains(dataTable.asList().get(i)));
        }
       
        finalizar();		
	}

	@E("clico no item do menu cloud")
	public void clico_no_item_do_menu_cloud() throws InterruptedException  {
		Thread.sleep(3000);
		BaseTest.elementoCSS("a[href='/br-pt/services/cloud-index']").click();
	}

	@Entao("devo encontrar o titulo {string}")
	public void devo_encontrar_o_titulo(String string) throws InterruptedException {
		Thread.sleep(3000);
		WebElement input = BaseTest.elementoCSS("h1.rte-inline");
		assertEquals(string, input.getText());
        BaseTest.finalizar();
	}

}
