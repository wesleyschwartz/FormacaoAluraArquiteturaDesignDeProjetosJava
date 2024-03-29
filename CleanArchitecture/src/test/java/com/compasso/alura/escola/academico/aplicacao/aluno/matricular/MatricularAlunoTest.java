package com.compasso.alura.escola.academico.aplicacao.aluno.matricular;

import com.compasso.alura.escola.shared.dominio.evento.PublicadorDeEventos;
import com.compasso.alura.escola.academico.dominio.aluno.Aluno;
import com.compasso.alura.escola.shared.dominio.CPF;
import com.compasso.alura.escola.academico.infra.aluno.RepositorioDeAlunosEmMemoria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatricularAlunoTest {

    @Test
    void alunoDeveriaSerPersistido() {
        RepositorioDeAlunosEmMemoria repositorioDeAlunosEmMemoria = new RepositorioDeAlunosEmMemoria();
        PublicadorDeEventos publicadorDeEventos = new PublicadorDeEventos();
        MatricularAluno useCase = new MatricularAluno(repositorioDeAlunosEmMemoria, publicadorDeEventos);
        MatricularAlunoDTO dados = new MatricularAlunoDTO("teste", "123.456.789-10", "teste@email.com");
        useCase.executar(dados);
        Aluno alunoEncontrado = repositorioDeAlunosEmMemoria.buscarPorCPF(new CPF("123.456.789-10"));
        assertEquals("teste", alunoEncontrado.getNome());
        assertEquals("123.456.789-10", alunoEncontrado.getCpf());
        assertEquals("teste@email.com", alunoEncontrado.getEmail());
    }
}