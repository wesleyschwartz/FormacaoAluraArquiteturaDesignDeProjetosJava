package br.com.alura.compass.service.reajuste;

import br.com.alura.compass.model.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajuste {
    void valida(Funcionario funcionario, BigDecimal aumento);
}
