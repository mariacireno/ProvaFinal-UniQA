
package io.cucumber.uniqa;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	protected static WebDriver browser;

    public BaseTest() {}
	
		
	//@BeforeAll
	public static void inicializar() {
		if(System.getProperty("os.name").equals("Linux")) System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
		else System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		
		browser = new ChromeDriver();
	}
			
	
	//@BeforeEach
	public void carregarPagina() {
		browser.get("https://www.accenture.com/br-pt");
        browser.manage().window().maximize();
	}
	
	

	
	@AfterAll
	public static void finalizar() {
		browser.quit();
	}

	public void fecharCookies() {
		WebElement input = browser.findElement(By.cssSelector("#onetrust-pc-btn-handler"));
	       input.click();
		WebElement input2 = browser.findElement(By.cssSelector(".onetrust-close-btn-handler"));
        input2.click();
	}
}

