package src.main.java.com.compasso.loja.pedido;


import src.main.java.com.compasso.loja.orcamento.Orcamento;

import java.time.LocalDateTime;

public class Pedido {
    private String client;
    private LocalDateTime data;
    private Orcamento orcamento;

    public Pedido(String client, LocalDateTime data, Orcamento orcamento) {
        this.client = client;
        this.data = data;
        this.orcamento = orcamento;
    }

    public String getClient() {
        return client;
    }

    public LocalDateTime getData() {
        return data;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }
}
