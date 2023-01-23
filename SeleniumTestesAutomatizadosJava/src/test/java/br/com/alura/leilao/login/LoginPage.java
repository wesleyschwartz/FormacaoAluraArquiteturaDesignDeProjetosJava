package br.com.alura.leilao.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginPage {
    private WebDriver browser;

    public LoginPage() {
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        this.browser = new EdgeDriver();
        this.browser.navigate().to("http://localhost:8080/login");
    }

    public void quitBrowser() {
        this.browser.quit();
    }

    public void preencheFormularioDeLogin(String usuario, String pass) {
        this.browser.findElement(By.id("username")).sendKeys(usuario);
        this.browser.findElement(By.id("password")).sendKeys(pass);
    }

    public void submiteFormulario() {
        this.browser.findElement(By.id("login-form")).submit();
    }

    public String getUrl() {
        return this.browser.getCurrentUrl();
    }

    public String findElementeById(String byId) {
        return this.browser.findElement(By.id(byId)).getText();
    }

    public boolean getPageSource(String text) {
        return this.browser.getPageSource().contains(text);
    }

    public void navigateTo(String urlParcial) {
        this.browser.navigate().to("http://localhost:8080/" + urlParcial);
    }
}
