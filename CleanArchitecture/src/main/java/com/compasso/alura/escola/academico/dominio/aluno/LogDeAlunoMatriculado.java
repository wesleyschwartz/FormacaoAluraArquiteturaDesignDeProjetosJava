package com.compasso.alura.escola.academico.dominio.aluno;

import com.compasso.alura.escola.shared.dominio.evento.Evento;
import com.compasso.alura.escola.shared.dominio.evento.Ouvinte;

import java.time.format.DateTimeFormatter;

public class LogDeAlunoMatriculado extends Ouvinte {
    @Override
    public void reageAo(Evento evento) {
        String momentoFormatado = evento.monento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.printf("Aluno com CPF %s matriculado em: %s%n", ((AlunoMatriculado) evento).getCpfDoAluno(), momentoFormatado);
    }

    @Override
    protected boolean deveProcessar(Evento evento) {
        return evento instanceof AlunoMatriculado;
    }
}
