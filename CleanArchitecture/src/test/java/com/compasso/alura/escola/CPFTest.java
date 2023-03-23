package com.compasso.alura.escola;


import com.compasso.alura.escola.dominio.aluno.CPF;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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