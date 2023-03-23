package com.compasso.alura.escola;

import com.compasso.alura.escola.dominio.aluno.Email;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {
    @Test
    void naoDeveriaCriarEmailComEnderecoInvalido(){
        assertThrows(IllegalArgumentException.class, () -> new Email(null));
        assertThrows(IllegalArgumentException.class, () -> new Email("invaliado"));
        assertThrows(IllegalArgumentException.class, () -> new Email(""));
    }
    @Test
    void deveriaCriarEmailComEnderecoValido(){
        Email emailCerto = new Email("email@certo.com");
        assertEquals("email@certo.com", emailCerto.getEndereco());
    }

}