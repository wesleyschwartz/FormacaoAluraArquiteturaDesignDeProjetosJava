package com.compasso.loja.testes;

import com.compasso.loja.descontos.CalculadoraDeDescontos;
import com.compasso.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDescontos {
    public static void main(String[] args) {
        Orcamento orcamento1 = new Orcamento(new BigDecimal("400"), 6);
        CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
        BigDecimal calcular1 = calculadoraDeDescontos.calcular(orcamento1);
        System.out.println(calcular1);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("1000"), 2);
        BigDecimal calcular2 = calculadoraDeDescontos.calcular(orcamento2);
        System.out.println(calcular2);
        Orcamento orcamento3 = new Orcamento(new BigDecimal(("200")), 2);
        System.out.println(calculadoraDeDescontos.calcular(orcamento3));

    }
}
