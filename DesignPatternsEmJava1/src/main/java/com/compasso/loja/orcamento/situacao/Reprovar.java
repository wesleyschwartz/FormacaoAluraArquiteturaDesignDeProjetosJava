package com.compasso.loja.orcamento.situacao;

import com.compasso.loja.orcamento.Orcamento;

public class Reprovar extends SituacaoOrcamento {
    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
