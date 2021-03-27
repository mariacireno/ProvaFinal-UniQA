
package io.cucumber.uniqa;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	protected static WebDriver browser;

    public BaseTest() {}
	
	//@BeforeAll
	public static void inicializar() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
		browser = new ChromeDriver();
	}
	
	//@BeforeEach
	public void carregarPagina() {
		browser.get("https://www.accenture.com/br-pt");
        browser.manage().window().maximize();
	}

	@Dado("que eu estou no site da accenture")
    public void entrarNoSiteAccenture() {
        inicializar();
        carregarPagina();
    }    
    
	
	@AfterAll
	public static void finalizar() {
		browser.quit();
	}
}

