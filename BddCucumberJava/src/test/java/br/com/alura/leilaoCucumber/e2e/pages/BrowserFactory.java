package br.com.alura.leilaoCucumber.e2e.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class BrowserFactory {

//  Documentação
//	http://chromedriver.storage.googleapis.com/index.html
//	https://github.com/mozilla/geckodriver/releases	

	public WebDriver createWebDriver() {
		String webdriver = System.getProperty("browser", "edge");
		//htmlunit é um navegador em memória!
		switch (webdriver) {
			case "firefox":
				return initFirefoxDriver();
			case "edge":
				return initEdgeDriver();
			default:
				return new HtmlUnitDriver();
		}
	}

	private  WebDriver initEdgeDriver() {
		System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
		return new EdgeDriver();
	}

	private  WebDriver initFirefoxDriver() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\stepp\\Desktop\\curso-bdd\\workspace\\leilao\\drivers\\geckodriver.exe");
		return new FirefoxDriver();
	}
}
