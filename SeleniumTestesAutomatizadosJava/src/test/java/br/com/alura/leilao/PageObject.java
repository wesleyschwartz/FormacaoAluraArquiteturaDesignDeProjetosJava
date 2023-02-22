package br.com.alura.leilao;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PageObject {
    protected WebDriver browser;

    public PageObject(WebDriver browser) {
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        if (browser == null) {
            this.browser = new EdgeDriver();
        } else {
            this.browser = browser;
        }
    }
    public void quitBrowser() {
        this.browser.quit();
    }

}
