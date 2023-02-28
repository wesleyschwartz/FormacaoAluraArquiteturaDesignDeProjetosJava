package br.com.alura.leilaoCucumber.acceptance.steps;

import br.com.alura.leilaoCucumber.model.Lance;
import br.com.alura.leilaoCucumber.model.Leilao;
import br.com.alura.leilaoCucumber.model.Usuario;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PropondoLanceSteps {
    private Lance lance;
    private Leilao leilao;
    private ArrayList<Lance> lista;

    @Before
    public void setUp() throws Exception {
        this.lista = new ArrayList<Lance>();
        leilao = new Leilao("Computador");
    }

    @Given("Dado um lance valido")
    public void dado_um_lance_valido() {
        Usuario usuario = new Usuario("fulano");
        BigDecimal bigDecimal = new BigDecimal(BigInteger.TEN);
        lance = new Lance(usuario, bigDecimal);
    }


    @When("Quando propoe ao leilao")
    public void quando_propoe_o_lance() {
        leilao.propoe(lance);
    }

    @Then("Entao o lance eh aceito")
    public void entao_o_lance_eh_aceito() {
        Assert.assertEquals(1, leilao.getLances().size());
        Assert.assertEquals(BigDecimal.TEN, leilao.getLances().get(0).getValor());
    }

    /*
       @Given("Dado varios lances validos")
       public void dado_varios_lances_validos() {
           Usuario usuario1 = new Usuario("fulano");
           lance10 = new Lance(usuario1, new BigDecimal(BigInteger.TEN));
           Usuario usuario2 = new Usuario("beltrano");
           lance15 = new Lance(usuario2, new BigDecimal("15.0"));
           leilao = new Leilao("Computador");
       }
   */


    @Given("um lance de {double} reais do usuario {string}")
    public void um_lance_de_reais_do_usuario(Double valor, String nomeUsuario) {
        Lance lance = new Lance(new Usuario(nomeUsuario), new BigDecimal(valor));
        this.lista.add(lance);
    }

    @When("Quando propoe varios lances ao leilao")
    public void quando_propoe_varios_lances_ao_leilao() {
        this.lista.forEach(lance -> leilao.propoe(lance));
    }

    @Then("Entao os lances sao aceitos")
    public void entao_os_lances_sao_aceitos() {
        Assert.assertEquals(this.lista.size(), leilao.getLances().size());
        Assert.assertEquals(this.lista.get(0).getValor(), leilao.getLances().get(0).getValor());
        Assert.assertEquals(this.lista.get(1).getValor(), leilao.getLances().get(1).getValor());
    }

    @Given("um lance invalido de {double} reais e do usuario {string}")
    public void um_lance_invalido_de_reais_e_do_usuario(Double double1, String nomeUsuario) {
        System.out.println(nomeUsuario);
        this.lance = new Lance(new BigDecimal(double1));
    }

    @Then("o lance nao eh aceito")
    public void o_lance_nao_eh_aceito() {
        Assert.assertEquals(0, leilao.getLances().size());
    }

    @Then("o segundo lance nao eh aceito")
    public void o_segundo_lance_nao_eh_aceito() {
        Assert.assertEquals(1, leilao.getLances().size());
        Assert.assertEquals(this.lista.get(0).getValor(), leilao.getLances().get(0).getValor());
    }

    @Given("dado os dois lances")
    public void dado_os_dois_lances(DataTable dataTable) {
        List<Map<String, String>> maps = dataTable.asMaps();
        for (Map<String, String> map : maps) {
            String nomeUsuario = map.get("nomeUsuario");
            String valor = map.get("valor");
            Lance lance = new Lance(new Usuario(nomeUsuario), new BigDecimal(valor));
            this.lista.add(lance);
        }

    }

}
