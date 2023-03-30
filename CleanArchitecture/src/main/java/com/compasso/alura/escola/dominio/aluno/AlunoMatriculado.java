package com.compasso.alura.escola.dominio.aluno;

import com.compasso.alura.escola.Evento;

import java.time.LocalDateTime;

public class AlunoMatriculado implements Evento {
    private final CPF cpfDoAluno;
    private final LocalDateTime momento;

    public AlunoMatriculado(CPF cpfDoAluno) {
        this.cpfDoAluno = cpfDoAluno;
        this.momento = LocalDateTime.now();
    }

    @Override
    public LocalDateTime monento() {
        return this.momento;
    }

    public CPF getCpfDoAluno() {
        return cpfDoAluno;
    }
}



