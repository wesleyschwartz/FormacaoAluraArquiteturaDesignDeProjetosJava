package com.compasso.alura.escola.academico;

import com.compasso.alura.escola.academico.dominio.aluno.Telefone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelefoneTest {
    @Test
    void naoDeveriaCriarTelefoneParaDDDInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new Telefone("", "123456789"));
        assertThrows(IllegalArgumentException.class, () -> new Telefone(null, "123456789"));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("123", "123456789"));

    }
    @Test
    void deveriaCriarTelefoneParaDDDvalido() {
        Telefone telefone = new Telefone("12", "123456789");
        assertEquals(telefone.getDdd(), "12");
    }

   @Test
    void naoDeveriaCriarTelefoneParaNumeroInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new Telefone("12", "1234567"));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("12", null));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("12", ""));

    }
    @Test
   void deveriaCriarTelefoneParaNumeroValido() {
        Telefone telefone = new Telefone("12", "123456789");
        Telefone telefone2 = new Telefone("12", "12345678");
        assertEquals(telefone.getNumero(), "123456789");
        assertEquals(telefone2.getNumero(), "12345678");
    }
}