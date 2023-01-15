package br.com.alura.service;

import java.math.BigDecimal;

public enum Desempenho {
    BOM {
        @Override
        BigDecimal percentualReajuste() {
            return new BigDecimal("0.15");
        }
    }, OTIMO {
        @Override
        BigDecimal percentualReajuste() {
            return new BigDecimal("0.20");
        }
    }, A_DESEJAR {
        @Override
        BigDecimal percentualReajuste() {
            return new BigDecimal("0.03");
        }
    };

    abstract BigDecimal percentualReajuste();
}
