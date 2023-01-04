package br.com.alura.compass.service.reajuste;

import br.com.alura.compass.ValidacaoException;
import br.com.alura.compass.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ValidacaoPercentualReajuste implements ValidacaoReajuste {
    @Override
    public void valida(Funcionario funcionario, BigDecimal aumento) {
        BigDecimal salarioAtual = funcionario.getDadosPessoais().getSalario();
        BigDecimal percentualReajuste = aumento.divide(salarioAtual, RoundingMode.HALF_UP);
        if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario");
        }
    }

}
