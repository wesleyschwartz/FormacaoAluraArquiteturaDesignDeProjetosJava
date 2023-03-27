package com.compasso.alura.escola.aplicacao.aluno.matricular;

import com.compasso.alura.escola.dominio.aluno.Aluno;
import com.compasso.alura.escola.dominio.aluno.CPF;
import com.compasso.alura.escola.dominio.aluno.Email;

public class MatricularAlunoDTO {
    private String nomeAluno;
    private String cpfAluno;
    private String emailAluno;

    public MatricularAlunoDTO(String nomeAluno, String cpfAluno, String emailAluno) {
        this.nomeAluno = nomeAluno;
        this.cpfAluno = cpfAluno;
        this.emailAluno = emailAluno;
    }

    public Aluno criarAluno() {
        return new Aluno(new CPF(cpfAluno), nomeAluno, new Email(emailAluno));
    }
}
