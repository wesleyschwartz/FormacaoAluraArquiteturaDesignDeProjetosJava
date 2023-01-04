package com.compasso.loja.pedido.acao;

import com.compasso.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {
    public void executar(Pedido pedido){
        System.out.println("Simulando, o envio do email com dados do pedido!");
    }
}
