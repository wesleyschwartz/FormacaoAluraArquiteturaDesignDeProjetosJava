package br.com.alura.service;

import br.com.alura.model.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {
    public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
        BigDecimal reajuste = funcionario.getSalario().multiply(desempenho.percentualReajuste());
        funcionario.reajustarSalario((reajuste));
    }
}
