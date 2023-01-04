package com.compasso.loja.testes;

import com.compasso.loja.imposto.CalculadoraDeImpostos;
import com.compasso.loja.imposto.ICMS;
import com.compasso.loja.imposto.ISS;
import com.compasso.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        BigDecimal calcularISS = calculadoraDeImpostos.calcular(orcamento, new ISS());
        BigDecimal calcularICMS = calculadoraDeImpostos.calcular(orcamento, new ICMS());
        System.out.println("ISS: " + calcularISS);
        System.out.println("ICMS: " + calcularICMS);

    }
}
