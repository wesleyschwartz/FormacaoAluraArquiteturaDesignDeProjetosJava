package br.com.alura.compass.service.reajuste;

import br.com.alura.compass.ValidacaoException;
import br.com.alura.compass.model.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public class ValidacaoPeriodReajuste implements ValidacaoReajuste {
    @Override
    public void valida(Funcionario funcionario, BigDecimal aumento) {
        Period period = Period.between(funcionario.getDataUltimoReajuste(), LocalDate.now());
        if (period.getMonths() < 6) {
            throw new ValidacaoException("Intervalo entre reajuste deve ser de no minimo 6 meses");
        }
    }
}
