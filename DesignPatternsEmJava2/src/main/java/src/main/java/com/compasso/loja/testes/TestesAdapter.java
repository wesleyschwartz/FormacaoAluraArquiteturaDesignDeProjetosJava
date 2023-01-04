package src.main.java.com.compasso.loja.testes;

import src.main.java.com.compasso.loja.http.JavaHttpClient;
import src.main.java.com.compasso.loja.orcamento.ItemOrcamento;
import src.main.java.com.compasso.loja.orcamento.Orcamento;
import src.main.java.com.compasso.loja.orcamento.RegistroDeOrcamento;

import java.math.BigDecimal;

public class TestesAdapter {
    public static void main(String[] args) {
        Orcamento orcamento1 = new Orcamento();
        orcamento1.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        orcamento1.aprovar();
        orcamento1.finalizar();

        RegistroDeOrcamento registroDeOrcamento = new RegistroDeOrcamento(new JavaHttpClient());
        registroDeOrcamento.registrar(orcamento1);
    }
}
