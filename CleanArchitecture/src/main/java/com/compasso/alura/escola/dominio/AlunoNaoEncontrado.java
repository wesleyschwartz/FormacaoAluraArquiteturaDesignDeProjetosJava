package com.compasso.alura.escola.dominio;

import com.compasso.alura.escola.dominio.aluno.CPF;

public class AlunoNaoEncontrado extends RuntimeException {
    public AlunoNaoEncontrado(CPF cpf) {
        super("Aluno com "+ cpf +" não encontrado");
    }
}
