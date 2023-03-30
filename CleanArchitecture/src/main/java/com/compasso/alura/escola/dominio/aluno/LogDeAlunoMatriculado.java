package com.compasso.alura.escola.dominio.aluno;

import com.compasso.alura.escola.Evento;
import com.compasso.alura.escola.dominio.Ouvinte;

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
