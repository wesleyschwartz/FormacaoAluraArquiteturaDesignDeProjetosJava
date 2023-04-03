package com.compasso.alura.escola.gameficacao.infra.selo;

import com.compasso.alura.escola.shared.dominio.CPF;
import com.compasso.alura.escola.gameficacao.dominio.selo.RepositorioDeSelos;
import com.compasso.alura.escola.gameficacao.dominio.selo.Selo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RepositorioDeSelosEmMemoria implements RepositorioDeSelos {
    private List<Selo> selos = new ArrayList<>();

    @Override
    public void adicionar(Selo selo) {
        this.selos.add(selo);
    }

    @Override
    public List<Selo> selosDoAlunoDeCPF(CPF cpf) {
        return this.selos.stream().filter(selo -> selo.getCpfDoAluno().equals(cpf)).collect(Collectors.toList());
    }
}
