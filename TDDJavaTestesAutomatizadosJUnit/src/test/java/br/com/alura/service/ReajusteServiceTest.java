package br.com.alura.service;

import br.com.alura.model.Funcionario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ReajusteServiceTest {
    @Test
    public void reajusteDeveriaSerDeTresPorcentoQuandoDesempenhoForADesejar(){
        ReajusteService reajusteService = new ReajusteService();
        Funcionario funcionario = new Funcionario("Adesejar", LocalDate.now(),new BigDecimal("1000.00"));

        reajusteService.concederReajuste(funcionario, Desempenho.A_DESEJAR);

        Assertions.assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }
    @Test
    public void reajusteDeveriaSerDeQuinzePorcentoQuandoDesempenhoForBom(){
        ReajusteService reajusteService = new ReajusteService();
        Funcionario funcionario = new Funcionario("Bom", LocalDate.now(),new BigDecimal("1000.00"));

        reajusteService.concederReajuste(funcionario, Desempenho.BOM);

        Assertions.assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }
    @Test
    public void reajusteDeveriaSerDeVintePorcentoQuandoDesempenhoForOtimo(){
        ReajusteService reajusteService = new ReajusteService();
        Funcionario funcionario = new Funcionario("Bom", LocalDate.now(),new BigDecimal("1000.00"));

        reajusteService.concederReajuste(funcionario, Desempenho.OTIMO);

        Assertions.assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }
}
