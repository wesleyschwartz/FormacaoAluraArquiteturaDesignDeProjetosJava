package com.compasso.alura.escola.academico.aplicacao.indicacao;

import com.compasso.alura.escola.academico.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {
    void enviarPara(Aluno indicado);
}
