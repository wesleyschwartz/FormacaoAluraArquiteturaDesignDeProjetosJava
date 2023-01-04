package src.main.java.com.compasso.loja.descontos;


import src.main.java.com.compasso.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {
    protected Desconto next;

    public Desconto(Desconto next) {
        this.next = next;
    }

    public BigDecimal calcular(Orcamento orcamento) {
        if (deveAplicar(orcamento)) {
            return efetuarCalculo(orcamento);
        }
        return next.calcular(orcamento);
    }

    protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);

    public abstract boolean deveAplicar(Orcamento orcamento);
}
