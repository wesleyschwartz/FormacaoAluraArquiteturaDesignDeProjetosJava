package src.main.java.com.compasso.loja.imposto;


import src.main.java.com.compasso.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS extends Imposto {
    public ISS(Imposto outro) {
        super(outro);
    }

    @Override
    public BigDecimal realizarCalcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }
}
