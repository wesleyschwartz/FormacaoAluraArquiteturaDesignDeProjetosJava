package br.com.alura.leilao.login;

import br.com.alura.leilao.PageObject;
import br.com.alura.leilao.leiloes.LeioloesPage;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    private final static String URL_LOGIN = "http://localhost:8080/login";

    public LoginPage() {
        super(null);
        this.browser.navigate().to(URL_LOGIN);
    }

    public void quitBrowser() {
        this.browser.quit();
    }

    public void preencheFormularioDeLogin(String usuario, String pass) {
        this.browser.findElement(By.id("username")).sendKeys(usuario);
        this.browser.findElement(By.id("password")).sendKeys(pass);
    }

    public LeioloesPage submiteFormulario() {
        this.browser.findElement(By.id("login-form")).submit();
        return new LeioloesPage(browser);
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
