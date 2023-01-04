package src.main.java.com.compasso.loja.testes;

import src.main.java.com.compasso.loja.descontos.CalculadoraDeDescontos;
import src.main.java.com.compasso.loja.orcamento.ItemOrcamento;
import src.main.java.com.compasso.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDescontos {
    public static void main(String[] args) {
        Orcamento orcamento1 = new Orcamento();
        orcamento1.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
        BigDecimal calcular1 = calculadoraDeDescontos.calcular(orcamento1);
        System.out.println(calcular1);
        Orcamento orcamento2 = new Orcamento();
        orcamento2.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
        BigDecimal calcular2 = calculadoraDeDescontos.calcular(orcamento2);
        System.out.println(calcular2);
        Orcamento orcamento3 = new Orcamento();
        orcamento3.adicionarItem(new ItemOrcamento(new BigDecimal("1000")));
        System.out.println(calculadoraDeDescontos.calcular(orcamento3));

    }
}
