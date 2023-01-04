package com.compasso.loja.pedido;

import com.compasso.loja.orcamento.Orcamento;
import com.compasso.loja.pedido.acao.AcaoAposGerarPedido;
import com.compasso.loja.pedido.acao.EnviarEmailPedido;
import com.compasso.loja.pedido.acao.SalvarNoBancoDeDados;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {
    private List<AcaoAposGerarPedido> acoes;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void execute(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        String cliente = dados.getCliente();
        Pedido pedido = new Pedido(cliente, LocalDateTime.now(), orcamento);
        acoes.forEach(acao -> acao.executar(pedido));
    }
}
