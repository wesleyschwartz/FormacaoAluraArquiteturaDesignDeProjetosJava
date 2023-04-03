package com.compasso.alura.escola;

import com.compasso.alura.escola.academico.aplicacao.aluno.matricular.MatricularAluno;
import com.compasso.alura.escola.academico.aplicacao.aluno.matricular.MatricularAlunoDTO;
import com.compasso.alura.escola.academico.dominio.aluno.LogDeAlunoMatriculado;
import com.compasso.alura.escola.academico.infra.aluno.RepositorioDeAlunosEmMemoria;
import com.compasso.alura.escola.gameficacao.aplicacao.GereSeloAlunoNovato;
import com.compasso.alura.escola.gameficacao.infra.selo.RepositorioDeSelosEmMemoria;
import com.compasso.alura.escola.shared.dominio.evento.PublicadorDeEventos;

public class MatricularAlunoPorLinhaDeComando {
    public static void main(String[] args) {
        String nome = "Wesley Schwartz";
        String cpf = "123.456.789-10";
        String email = "wesley@email.com";
        PublicadorDeEventos publicadorDeEventos = new PublicadorDeEventos();
        publicadorDeEventos.add(new LogDeAlunoMatriculado());
        MatricularAluno matricularAluno = new MatricularAluno(new RepositorioDeAlunosEmMemoria(), publicadorDeEventos);
        publicadorDeEventos.add(new GereSeloAlunoNovato(new RepositorioDeSelosEmMemoria()));
        matricularAluno.executar(new MatricularAlunoDTO(nome, cpf, email));


    }

}
