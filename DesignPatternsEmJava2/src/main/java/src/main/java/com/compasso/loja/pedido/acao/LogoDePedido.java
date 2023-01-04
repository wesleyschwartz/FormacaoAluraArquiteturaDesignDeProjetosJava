package src.main.java.com.compasso.loja.pedido.acao;

import src.main.java.com.compasso.loja.pedido.Pedido;

public class LogoDePedido implements AcaoAposGerarPedido{
    @Override
    public void executar(Pedido pedido) {
        System.out.println("Pedido foi gerado" + pedido);
    }
}
