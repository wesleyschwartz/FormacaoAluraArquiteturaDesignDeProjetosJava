package br.com.alura.leilao.leiloes;

import br.com.alura.leilao.login.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LeiloesTest {

    private LeioloesPage leioloesPage;
    private CadastroLeilaoPage cadastrarLeilaoPage;

    @AfterEach
    void tearDown() {
        leioloesPage.quitBrowser();
    }

    @BeforeEach
    void setUp() {
        LoginPage loginPage = new LoginPage();
        loginPage.preencheFormularioDeLogin("fulano", "pass");
        this.leioloesPage = loginPage.submiteFormulario();
        this.cadastrarLeilaoPage = leioloesPage.carregarFormulario();
    }

    @Test
    public void deveriaCadastrarLeilao() {

        String data = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
        String hora = new SimpleDateFormat("HH:mm:ss").format(new Date());
        String nomeLeilao = "Leilao Automatico" + data + " " + hora;
        String valorInicial = "500.00";
        this.leioloesPage = cadastrarLeilaoPage.cadastrarLeilao(nomeLeilao, valorInicial, data);

        Assertions.assertTrue(leioloesPage.isLeilaoCadastrado(nomeLeilao, data, valorInicial));
    }
    @Test
    public void deveriaValidarCadastroDeLeilao(){
        this.leioloesPage = cadastrarLeilaoPage.cadastrarLeilao("", "","");
        Assertions.assertFalse(this.cadastrarLeilaoPage.isPaginaAtual());
        Assertions.assertTrue(this.leioloesPage.isPaginaAtual());
        Assertions.assertTrue(this.cadastrarLeilaoPage.isMensagensDeValidacaoVisiveis());

    }

}
