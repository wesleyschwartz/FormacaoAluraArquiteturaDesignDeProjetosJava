package com.compasso.loja.descontos;

import com.compasso.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoValorMaiorQue500 extends Desconto {
    public DescontoValorMaiorQue500(Desconto next) {
        super(next);
    }

    @Override
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }
}
