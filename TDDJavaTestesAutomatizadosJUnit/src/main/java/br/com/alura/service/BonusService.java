package br.com.alura.service;


import br.com.alura.model.Funcionario;

import java.math.BigDecimal;

public class BonusService {

    public BigDecimal calcularBonus(Funcionario funcionario) {
        BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
        if (valor.compareTo(new BigDecimal("1000")) > 0) {
            throw  new IllegalArgumentException("Funcionario com salario maior que R$1000 nao pode receber bonus");
        }
        return valor;
    }
}
