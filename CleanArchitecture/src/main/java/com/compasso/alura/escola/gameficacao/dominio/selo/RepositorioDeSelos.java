package com.compasso.alura.escola.gameficacao.dominio.selo;

import com.compasso.alura.escola.shared.dominio.CPF;

import java.util.List;

public interface RepositorioDeSelos {
    void adicionar(Selo selo);
    List<Selo> selosDoAlunoDeCPF(CPF cpf);
}
