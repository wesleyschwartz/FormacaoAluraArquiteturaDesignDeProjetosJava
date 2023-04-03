package com.compasso.alura.escola.gameficacao.aplicacao;

import com.compasso.alura.escola.gameficacao.dominio.selo.RepositorioDeSelos;
import com.compasso.alura.escola.gameficacao.dominio.selo.Selo;
import com.compasso.alura.escola.shared.dominio.CPF;
import com.compasso.alura.escola.shared.dominio.evento.Evento;
import com.compasso.alura.escola.shared.dominio.evento.Ouvinte;
import com.compasso.alura.escola.shared.dominio.evento.TipoDeEvento;

public class GereSeloAlunoNovato extends Ouvinte {
    private final RepositorioDeSelos repositorioDeSelos;

    public GereSeloAlunoNovato(RepositorioDeSelos repositorioDeSelos) {
        this.repositorioDeSelos = repositorioDeSelos;
    }


    @Override
    protected void reageAo(Evento evento) {
        CPF cpf = (CPF) evento.informacoes().get("cpf");
        Selo novato = new Selo(cpf, "Novato");
        repositorioDeSelos.adicionar(novato);
    }

    @Override
    protected boolean deveProcessar(Evento evento) {
        return evento.tipo().equals(TipoDeEvento.ALUNO_MATRICULADO);
    }
}
