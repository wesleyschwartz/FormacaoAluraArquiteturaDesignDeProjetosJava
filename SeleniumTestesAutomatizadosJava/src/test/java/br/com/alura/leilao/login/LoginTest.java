package br.com.alura.leilao.login;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {

    private WebDriver browser;

    @BeforeEach
    public void setUp() {
        this.browser = new EdgeDriver();
        this.browser.navigate().to("http://localhost:8080/login");
    }

    @BeforeAll
    public static void beforAll() {
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
    }

    @AfterEach
    void tearDown() {
        this.browser.quit();
    }


    @Test
    public void deveriaEfetuarLoginComDadosValidos() {
        browser.findElement(By.id("username")).sendKeys("fulano");
        browser.findElement(By.id("password")).sendKeys("pass");
        browser.findElement(By.id("login-form")).submit();

        assertNotEquals("http://localhost:8080/login", browser.getCurrentUrl());
        assertEquals("fulano", browser.findElement(By.id("user-logado")).getText());
    }

    @Test
    public void naoDeveriaEfetuarLoginComDadosInvalidos() {
        browser.findElement(By.id("username")).sendKeys("3132131321321");
        browser.findElement(By.id("password")).sendKeys("pass");
        browser.findElement(By.id("login-form")).submit();

        assertEquals("http://localhost:8080/login?error", browser.getCurrentUrl());
        assertEquals("Usuário e senha inválidos.", browser.findElement(By.id("alert-danger")).getText());
        assertTrue(browser.getPageSource().contains("Usuário e senha inválidos."));
    }

    @Test
    public void naoDeveriaAcessarPaginaRestritaSemEstarLogado(){
        this.browser.navigate().to("http://localhost:8080/leiloes/2");

        assertEquals("http://localhost:8080/login", browser.getCurrentUrl());
        assertFalse(browser.getPageSource().contains("Dados do Leilão"));
    }

}
