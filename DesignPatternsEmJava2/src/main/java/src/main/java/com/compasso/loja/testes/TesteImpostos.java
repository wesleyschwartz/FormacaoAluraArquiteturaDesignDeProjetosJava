package src.main.java.com.compasso.loja.testes;

import src.main.java.com.compasso.loja.imposto.CalculadoraDeImpostos;
import src.main.java.com.compasso.loja.orcamento.ItemOrcamento;
import src.main.java.com.compasso.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteImpostos {
    public static void main(String[] args) {
        Orcamento orcamento1 = new Orcamento();
        orcamento1.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        // BigDecimal calcularISS = calculadoraDeImpostos.calcular(orcamento, new ISS());
        // BigDecimal calcularICMS = calculadoraDeImpostos.calcular(orcamento, new ICMS());
        //     System.out.println("ISS: " + calcularISS);
        //       System.out.println("ICMS: " + calcularICMS);

    }
}
