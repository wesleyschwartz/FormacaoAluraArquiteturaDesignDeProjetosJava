package src.main.java.com.compasso.loja.orcamento;

import src.main.java.com.compasso.loja.orcamento.situacao.EmAnalise;
import src.main.java.com.compasso.loja.orcamento.situacao.Finalizado;
import src.main.java.com.compasso.loja.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Orcamento implements Orcavel {
    private BigDecimal valor;
    private List<Orcavel> itens = new ArrayList<>();
    private SituacaoOrcamento situacao;

    public SituacaoOrcamento getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }

    public Orcamento(BigDecimal valor) {
        this.valor = valor;
    }

    public Orcamento() {
        this.itens = new ArrayList<>();
        this.valor = BigDecimal.ZERO;
        this.situacao = new EmAnalise();
    }

    public int getQuantidadeItens() {
        return itens.size();
    }


    public BigDecimal getValor() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return valor;
    }

    public void aplicarDescontoExtra() {

        BigDecimal valorDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
    }

    public void aprovar() {
        this.situacao.aprovar(this);
    }

    public void reprovar() {
        this.situacao.reprovar(this);
    }

    public void finalizar() {
        this.situacao.finalizar(this);
    }

    public boolean isFinalizado() {
        return this.situacao instanceof Finalizado;
    }
    public void adicionarItem(Orcavel itemOrcamento){
        this.valor = valor.add(itemOrcamento.getValor());
        this.itens.add(itemOrcamento);
    }
}
