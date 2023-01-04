package src.main.java.com.compasso.loja.pedido;

import src.main.java.com.compasso.loja.orcamento.Orcamento;
import src.main.java.com.compasso.loja.pedido.acao.AcaoAposGerarPedido;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {
    private List<AcaoAposGerarPedido> acoes;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void execute(GeraPedido dados) {
        Orcamento orcamento = new Orcamento();

        String cliente = dados.getCliente();
        Pedido pedido = new Pedido(cliente, LocalDateTime.now(), orcamento);
        acoes.forEach(acao -> acao.executar(pedido));
    }
}
