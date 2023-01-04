package src.main.java.com.compasso.loja.testes;

import src.main.java.com.compasso.loja.orcamento.ItemOrcamento;
import src.main.java.com.compasso.loja.orcamento.Orcamento;
import src.main.java.com.compasso.loja.orcamento.OrcamentoProxy;

import java.math.BigDecimal;

public class TestesComposicao {
    public static void main(String[] args) {
        Orcamento antigo  = new Orcamento();
        antigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        antigo.reprovar();
        Orcamento novo = new Orcamento();
        novo.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
        novo.adicionarItem(antigo);

        OrcamentoProxy orcamentoProxy = new OrcamentoProxy(novo);

        System.out.println(orcamentoProxy.getValor());
        System.out.println(orcamentoProxy.getValor());
        System.out.println(orcamentoProxy.getValor());
        System.out.println(orcamentoProxy.getValor());
        System.out.println(orcamentoProxy.getValor());
    }
}
