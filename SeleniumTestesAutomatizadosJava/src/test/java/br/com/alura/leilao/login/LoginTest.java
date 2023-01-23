package br.com.alura.leilao.login;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {
    private LoginPage loginPage;

    @BeforeEach
    public void setUp() {
        this.loginPage = new LoginPage();
    }

    @AfterEach
    void tearDown() {
        loginPage.quitBrowser();
    }

    @Test
    public void deveriaEfetuarLoginComDadosValidos() {
        loginPage.preencheFormularioDeLogin("fulano", "pass");
        loginPage.submiteFormulario();
        assertNotEquals("http://localhost:8080/login", loginPage.getUrl());
        assertEquals("fulano", loginPage.findElementeById("user-logado"));
    }

    @Test
    public void naoDeveriaEfetuarLoginComDadosInvalidos() {
        loginPage.preencheFormularioDeLogin("INVALIDO", "pass");
        loginPage.submiteFormulario();

        assertEquals("http://localhost:8080/login?error", loginPage.getUrl());
        assertEquals("Usuário e senha inválidos.", loginPage.findElementeById("alert-danger"));
        assertTrue(loginPage.getPageSource("Usuário e senha inválidos."));
    }

    @Test
    public void naoDeveriaAcessarPaginaRestritaSemEstarLogado() {
        loginPage.navigateTo("leiloes/2");
        assertEquals("http://localhost:8080/login", loginPage.getUrl());
        assertFalse(loginPage.getPageSource("Dados do Leilão"));
    }

}
