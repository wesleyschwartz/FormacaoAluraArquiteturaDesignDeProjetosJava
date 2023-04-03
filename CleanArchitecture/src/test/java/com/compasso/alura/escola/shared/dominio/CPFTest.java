package com.compasso.alura.escola.shared.dominio;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CPFTest {
    @Test
    void deveriaCriarCPFValido(){
        CPF cpf = new CPF("552.982.240-16");
        assertEquals( "552.982.240-16",cpf.getCpf());
    }
    @Test
    void naoDeveriaCriarCPFInvalido(){
       assertThrows(IllegalArgumentException.class, () -> new CPF(""));
       assertThrows(IllegalArgumentException.class, () -> new CPF("12345678910"));
       assertThrows(IllegalArgumentException.class, () -> new CPF(null));
    }

}