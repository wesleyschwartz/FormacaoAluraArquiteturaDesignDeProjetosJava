package com.compasso.alura.escola;

import com.compasso.alura.escola.aplicacao.aluno.matricular.MatricularAluno;
import com.compasso.alura.escola.aplicacao.aluno.matricular.MatricularAlunoDTO;
import com.compasso.alura.escola.dominio.aluno.LogDeAlunoMatriculado;
import com.compasso.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoPorLinhaDeComando {
    public static void main(String[] args) {
        String nome = "Wesley Schwartz";
        String cpf = "123.456.789-10";
        String email = "wesley@email.com";
        PublicadorDeEventos publicadorDeEventos = new PublicadorDeEventos();
        publicadorDeEventos.add(new LogDeAlunoMatriculado());
        MatricularAluno matricularAluno = new MatricularAluno(new RepositorioDeAlunosEmMemoria(), publicadorDeEventos);
        matricularAluno.executar(new MatricularAlunoDTO(nome, cpf, email));


    }

}
