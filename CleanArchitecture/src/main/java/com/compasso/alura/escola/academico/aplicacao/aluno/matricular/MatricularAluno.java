package com.compasso.alura.escola.academico.aplicacao.aluno.matricular;

import com.compasso.alura.escola.shared.dominio.evento.PublicadorDeEventos;
import com.compasso.alura.escola.academico.dominio.aluno.Aluno;
import com.compasso.alura.escola.academico.dominio.aluno.AlunoMatriculado;
import com.compasso.alura.escola.shared.dominio.CPF;
import com.compasso.alura.escola.academico.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {
    private final RepositorioDeAlunos repositorioDeAlunos;
    private final PublicadorDeEventos publicadorDeEventos;

    public MatricularAluno(RepositorioDeAlunos repositorioDeAlunos, PublicadorDeEventos publicadorDeEventos) {
        this.repositorioDeAlunos = repositorioDeAlunos;
        this.publicadorDeEventos = publicadorDeEventos;
    }

    public void executar(MatricularAlunoDTO dados) {
        Aluno novoAluno = dados.criarAluno();
        repositorioDeAlunos.matricular(novoAluno);
        AlunoMatriculado evento = new AlunoMatriculado(new CPF(novoAluno.getCpf()));
        publicadorDeEventos.publicar(evento);
    }
}
