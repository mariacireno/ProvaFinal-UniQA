
package io.cucumber.uniqa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	protected static WebDriver browser;
    
	public static void inicializar(String string) {
		if(System.getProperty("os.name").equals("Linux")) System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
		else System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		
		browser = new ChromeDriver();

		carregarPagina(string);
	}
	
	private static void carregarPagina(String string) {
		browser.get(string);
        browser.manage().window().maximize();
	}

	public static void fecharCookies() {
		WebElement input = elementoCSS("#onetrust-pc-btn-handler");
       	input.click();
		input = elementoCSS(".onetrust-close-btn-handler");
        input.click();
	}
	
	public static void finalizar() {
		browser.quit();
	}
	
	public static WebElement elementoCSS(String seletor) {
		return browser.findElement(By.cssSelector(seletor));
	}
	
	public static List<WebElement> elementosCSS(String seletor) {
		return browser.findElements(By.cssSelector(seletor));
	}

	public static String getCurrentUrl() {
		return browser.getCurrentUrl();
	}
	
}

