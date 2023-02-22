package br.com.alura.leilao.leiloes;

import br.com.alura.leilao.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LeioloesPage extends PageObject {
    private static final String URL_CADASTRO_LEILAO = "http://localhost:8080/leiloes/new";
    private static final String URL_LEILOES = "http://localhost:8080/leiloes";

    public LeioloesPage(WebDriver browser) {
        super(browser);
    }
    public CadastroLeilaoPage carregarFormulario() {
        this.browser.navigate().to(URL_CADASTRO_LEILAO);
        return new CadastroLeilaoPage(browser);
    }

    public boolean isLeilaoCadastrado(String nome, String data, String valorInicial) {
        WebElement linhaDaTabela = this.browser.findElement(By.cssSelector("#tabelaLeiloes tBody tr:last-child"));
        String colunaNome = linhaDaTabela.findElement(By.cssSelector("td:nth-child(1)")).getText();
        String colunaDataAbertura = linhaDaTabela.findElement(By.cssSelector("td:nth-child(2)")).getText();
        String colunaValorInical = linhaDaTabela.findElement(By.cssSelector("td:nth-child(3)")).getText();

        return colunaNome.equals(nome)
                && colunaDataAbertura.equals(data)
                && colunaValorInical.equals(valorInicial);
    }

    public boolean isPaginaAtual() {
        return browser.getCurrentUrl().equals(URL_LEILOES);
    }
}
