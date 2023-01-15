package br.com.alura.service;

import br.com.alura.model.Funcionario;
import org.junit.jupiter.api.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {
    private Funcionario funcionario;
    private BonusService bonusService;
    private BigDecimal bigDecimal;
    @BeforeEach
    void setUp() {
        this.funcionario =new Funcionario("Arthur", LocalDate.now(), bigDecimal);
        this.bonusService = new BonusService();
    }


    @Test
    void bonusDeveriaSerZeroParaFuncionarioComSalarioAlto() {
        this.funcionario.setSalario(new BigDecimal("25000"));
        Assertions.assertThrows(IllegalArgumentException.class, () -> bonusService.calcularBonus(funcionario));
        try {
            bonusService.calcularBonus(funcionario);
            fail("Nao deu a exception");
        } catch (Exception e) {
            assertEquals("Funcionario com salario maior que R$1000 nao pode receber bonus", e.getMessage());
        }
    }

    @Test
    void bonusDeveriaSer10PorcentoDoSalario() {
        this.funcionario.setSalario(new BigDecimal("2500"));
        BigDecimal aumento = bonusService.calcularBonus(funcionario);
        assertEquals(new BigDecimal("250.0"), aumento);
    }

    @Test
    void bonusDeveriaSerDezPorcentoParaSalarioDeExatamente10Mil() {
       this.funcionario.setSalario(new BigDecimal("1000"));
        BigDecimal aumento = bonusService.calcularBonus(funcionario);
        assertEquals(new BigDecimal("100.0"), aumento);
    }
}