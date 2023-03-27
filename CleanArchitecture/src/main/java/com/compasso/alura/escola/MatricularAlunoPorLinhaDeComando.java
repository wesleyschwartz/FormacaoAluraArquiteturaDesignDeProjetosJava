package com.compasso.alura.escola;

import com.compasso.alura.escola.aplicacao.aluno.matricular.MatricularAluno;
import com.compasso.alura.escola.aplicacao.aluno.matricular.MatricularAlunoDTO;
import com.compasso.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoPorLinhaDeComando {
    public static void main(String[] args) {
        String nome = "Wesley Schwartz";
        String cpf = "123-456-789-10";
        String email = "wesley@email.com";

        MatricularAluno matricularAluno = new MatricularAluno(new RepositorioDeAlunosEmMemoria());
        matricularAluno.executar(new MatricularAlunoDTO(cpf, nome, email));


    }

}
