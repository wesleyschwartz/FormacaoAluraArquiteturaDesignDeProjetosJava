package com.compasso.alura.escola.academico.dominio.aluno;

import com.compasso.alura.escola.shared.dominio.CPF;

import java.util.List;

public interface RepositorioDeAlunos {
    void matricular(Aluno aluno);
    Aluno buscarPorCPF(CPF cpf);
    List<Aluno> listarTodosAlunosMatriculados();
}
