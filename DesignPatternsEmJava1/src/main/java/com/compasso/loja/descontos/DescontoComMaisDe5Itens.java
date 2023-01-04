package com.compasso.loja.descontos;

import com.compasso.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoComMaisDe5Itens extends Desconto {
    public DescontoComMaisDe5Itens(Desconto next) {
        super(next);
    }

    @Override
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 5;
    }
}
