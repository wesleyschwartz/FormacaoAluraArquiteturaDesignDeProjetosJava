package br.com.alura.leilaoCucumber.acceptance.steps;

import br.com.alura.leilaoCucumber.e2e.pages.Browser;
import br.com.alura.leilaoCucumber.e2e.pages.LeiloesPage;
import br.com.alura.leilaoCucumber.e2e.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps {
    private Browser browser;
    private LoginPage loginPage;
    LeiloesPage leiloesPage;

    @Given("o usuario")
    public void o_usuario() {
        browser = new Browser();
        browser.seed(); //Popula banco
        loginPage = browser.getLoginPage();

    }

    @When("tenta se logar com dados validos")
    public void tenta_se_logar_com_dados_validos() {
        leiloesPage = this.loginPage.realizaLoginComo("fulano", "pass");
    }

    @Then("eh redirecionado para pagina de leiloes")
    public void eh_redirecionado_para_pagina_de_leiloes() {
        Assert.assertTrue(this.leiloesPage.estaNaPaginaDeLeiloes());
        browser.clean();
    }

    @When("tenta se logar com dados invalidos")
    public void tenta_se_logar_com_dados_invalidos() {
        leiloesPage = this.loginPage.realizaLoginComo("testeErrado", "pass");
    }

    @Then("continua na pagina de login")
    public void continua_na_pagina_de_login() {
        Assert.assertTrue(this.loginPage.estaNaPaginaDeLoginComErro());
        browser.clean();
    }
}
