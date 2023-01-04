package src.main.java.com.compasso.loja.testes;

import src.main.java.com.compasso.loja.imposto.CalculadoraDeImpostos;
import src.main.java.com.compasso.loja.imposto.ICMS;
import src.main.java.com.compasso.loja.imposto.ISS;
import src.main.java.com.compasso.loja.orcamento.ItemOrcamento;
import src.main.java.com.compasso.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos2 {
    public static void main(String[] args) {
        Orcamento orcamento1 = new Orcamento();
        orcamento1.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        BigDecimal calcular = calculadoraDeImpostos.calcular(orcamento1, new ISS(new ICMS(null)));
        System.out.println(calcular);
    }
}
