package src.main.java.com.compasso.loja.imposto;

import src.main.java.com.compasso.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Imposto {
    private Imposto outro;

    public Imposto(Imposto outro) {
        this.outro = outro;
    }

    protected abstract BigDecimal realizarCalcular(Orcamento orcamento);

    public  BigDecimal calcular(Orcamento orcamento) {
        BigDecimal valorImposto = realizarCalcular(orcamento);
        BigDecimal valorOutroImposto = BigDecimal.ZERO;
        if (outro != null) {
            valorOutroImposto = outro.realizarCalcular(orcamento);
        }
        return valorImposto.add(valorOutroImposto);
    }
}
