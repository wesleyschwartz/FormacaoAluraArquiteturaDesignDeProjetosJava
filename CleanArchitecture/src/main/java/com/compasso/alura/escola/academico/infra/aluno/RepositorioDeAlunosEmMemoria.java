package com.compasso.alura.escola.academico.infra.aluno;

import com.compasso.alura.escola.academico.dominio.aluno.AlunoNaoEncontrado;
import com.compasso.alura.escola.academico.dominio.aluno.Aluno;
import com.compasso.alura.escola.shared.dominio.CPF;
import com.compasso.alura.escola.academico.dominio.aluno.RepositorioDeAlunos;

import java.util.ArrayList;
import java.util.List;

public class RepositorioDeAlunosEmMemoria implements RepositorioDeAlunos {
    private List<Aluno> matriculados = new ArrayList<>();

    @Override
    public void matricular(Aluno aluno) {
        this.matriculados.add(aluno);
    }

    @Override
    public Aluno buscarPorCPF(CPF cpf) {
        return this.matriculados.stream()
                .filter(aluno -> aluno.getCpf().equals(cpf.getCpf()))
                .findFirst()
                .orElseThrow(() -> new AlunoNaoEncontrado(cpf));
    }

    @Override
    public List<Aluno> listarTodosAlunosMatriculados() {
        return this.matriculados;
    }
}
