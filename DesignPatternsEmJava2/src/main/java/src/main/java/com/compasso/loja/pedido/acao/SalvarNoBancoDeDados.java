package src.main.java.com.compasso.loja.pedido.acao;

import src.main.java.com.compasso.loja.pedido.Pedido;

public class SalvarNoBancoDeDados implements AcaoAposGerarPedido {
    public void executar(Pedido pedido) {
        System.out.println("Simulando, o save no banco de dados!");
    }
}
