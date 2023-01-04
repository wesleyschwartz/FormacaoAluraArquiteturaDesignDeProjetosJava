package src.main.java.com.compasso.loja.orcamento.situacao;


import src.main.java.com.compasso.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Aprovado extends SituacaoOrcamento {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        return orcamento.getValor().multiply((new BigDecimal("0.02")));
    }

    @Override
    public void finalizar(Orcamento orcamento) {
    orcamento.setSituacao(new Finalizado());
    }
}
