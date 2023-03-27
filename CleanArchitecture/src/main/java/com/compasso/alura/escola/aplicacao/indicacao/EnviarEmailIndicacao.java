package com.compasso.alura.escola.aplicacao.indicacao;

import com.compasso.alura.escola.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {
    void enviarPara(Aluno indicado);
}
