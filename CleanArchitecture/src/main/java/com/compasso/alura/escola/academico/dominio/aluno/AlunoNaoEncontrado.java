package com.compasso.alura.escola.academico.dominio.aluno;

import com.compasso.alura.escola.shared.dominio.CPF;

public class AlunoNaoEncontrado extends RuntimeException {
    public AlunoNaoEncontrado(CPF cpf) {
        super("Aluno com "+ cpf +" não encontrado");
    }
}
