package br.com.alura.service;

import br.com.alura.model.Funcionario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void bonusDeveriaSerZeroParaFuncionarioComSalarioAlto() {
        Funcionario funcionario = new Funcionario("Arthur", LocalDate.now(), new BigDecimal("25000"));
        BonusService bonusService = new BonusService();
        BigDecimal aumento = bonusService.calcularBonus(funcionario);
        assertEquals(BigDecimal.ZERO, aumento);
    }
    @Test
    void bonusDeveriaSer10PorcentoDoSalario() {
        Funcionario funcionario = new Funcionario("Arthur", LocalDate.now(), new BigDecimal("2500"));
        BonusService bonusService = new BonusService();
        BigDecimal aumento = bonusService.calcularBonus(funcionario);
        assertEquals(new BigDecimal("250.0"), aumento);
    }
    @Test
    void bonusDeveriaSerDezPorcentoParaSalarioDeExatamente10Mil() {
        Funcionario funcionario = new Funcionario("Arthur", LocalDate.now(), new BigDecimal("1000"));
        BonusService bonusService = new BonusService();
        BigDecimal aumento = bonusService.calcularBonus(funcionario);
        assertEquals(new BigDecimal("100.0"), aumento);
    }
}