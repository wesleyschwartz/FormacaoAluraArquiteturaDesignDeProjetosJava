package br.com.alura.leilaoCucumber.acceptance.steps;

import br.com.alura.leilaoCucumber.e2e.pages.Browser;
import br.com.alura.leilaoCucumber.e2e.pages.LeiloesPage;
import br.com.alura.leilaoCucumber.e2e.pages.NovoLeilaoPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LeilaoSteps {
    private Browser browser;
    private LeiloesPage leiloesPage;
    private NovoLeilaoPage novoLeilaoPage;

    @Given("um usuario logado")
    public void um_usuario_logado() {
        browser = new Browser();
        browser.seed();
        leiloesPage = browser.getLoginPage().realizaLoginComoFulano();
    }

    @When("acessa a pagina de novo leilao")
    public void acessa_a_pagina_de_novo_leilao() {
        this.novoLeilaoPage = this.leiloesPage.visitaPaginaParaCriarUmNovoLeilao();
    }

    @When("preenche o formulario com dados validos")
    public void preenche_o_formulario_com_dados_validos() {
        this.leiloesPage = this.novoLeilaoPage.preencheForm("PC NOVO", "1500", "01/03/2023");
    }

    @Then("volta para a pagina de leiloes")
    public void volta_para_a_pagina_de_leiloes() {
        Assert.assertTrue(this.leiloesPage.estaNaPaginaDeLeiloes());
    }

    @Then("o novo leilao aparece na tabela")
    public void o_novo_leilao_aparece_na_tabela() {
        Assert.assertTrue(this.leiloesPage.existe("PC NOVO", "1500.00", "01/03/2023"));
        this.browser.clean();
    }
}
