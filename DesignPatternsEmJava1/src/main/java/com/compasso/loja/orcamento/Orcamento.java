package com.compasso.loja.orcamento;

import com.compasso.loja.orcamento.situacao.EmAnalise;
import com.compasso.loja.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;

public class Orcamento {
    private BigDecimal valor;
    private int quantidadeItens;

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

    public Orcamento(BigDecimal valor, int quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
        this.situacao = new EmAnalise();
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }


    public BigDecimal getValor() {
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
}
