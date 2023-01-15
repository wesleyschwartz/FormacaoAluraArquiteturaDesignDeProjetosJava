package model;

import br.com.alura.model.Calculadora;
import org.junit.jupiter.api.Assertions;

class CalculadoraTest {

    @org.junit.jupiter.api.Test
    void deveriaSomarDoisNumeros() {
        Calculadora calculadora = new Calculadora();
        int somar = calculadora.somar(5, 5);
        Assertions.assertEquals(10, somar);
    }
}