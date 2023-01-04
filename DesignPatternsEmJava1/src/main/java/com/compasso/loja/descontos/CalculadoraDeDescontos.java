package com.compasso.loja.descontos;

import com.compasso.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {
    public BigDecimal calcular(Orcamento orcamento) {
        Desconto desconto = new DescontoComMaisDe5Itens(
                new DescontoValorMaiorQue500(
                        new SemDesconto()));
        return desconto.calcular(orcamento);
    }
}
