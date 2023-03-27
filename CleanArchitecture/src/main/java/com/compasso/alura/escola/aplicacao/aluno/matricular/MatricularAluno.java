package com.compasso.alura.escola.aplicacao.aluno.matricular;

import com.compasso.alura.escola.dominio.aluno.Aluno;
import com.compasso.alura.escola.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {
    private final RepositorioDeAlunos repositorioDeAlunos;

    public MatricularAluno(RepositorioDeAlunos repositorioDeAlunos) {
        this.repositorioDeAlunos = repositorioDeAlunos;
    }

    public void executar(MatricularAlunoDTO dados) {
        Aluno novoAluno = dados.criarAluno();
        repositorioDeAlunos.matricular(novoAluno);
    }
}
