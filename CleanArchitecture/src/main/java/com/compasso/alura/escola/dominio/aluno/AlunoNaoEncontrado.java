package com.compasso.alura.escola.dominio.aluno;

public class AlunoNaoEncontrado extends RuntimeException {
    public AlunoNaoEncontrado(CPF cpf) {
        super("Aluno com "+ cpf +" não encontrado");
    }
}
