package com.compasso.loja.testes;

import com.compasso.loja.pedido.GeraPedido;
import com.compasso.loja.pedido.GeraPedidoHandler;
import com.compasso.loja.pedido.acao.EnviarEmailPedido;
import com.compasso.loja.pedido.acao.SalvarNoBancoDeDados;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestesPedidos {
    public static void main(String[] args) {
        String cliente = "Wesley";
        BigDecimal valorOrcamento = new BigDecimal("200");
        int quantidadeItens = Integer.parseInt("2");
        GeraPedido geraPedido = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler geraPedidoHandler = new GeraPedidoHandler(Arrays.asList(new SalvarNoBancoDeDados(), new EnviarEmailPedido()));
        geraPedidoHandler.execute(geraPedido);
    }
}
