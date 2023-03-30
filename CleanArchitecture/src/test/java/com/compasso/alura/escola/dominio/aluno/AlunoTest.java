package com.compasso.alura.escola.dominio.aluno;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void naoDeveriaAdicionarTelefone() {
        Aluno aluno = new Aluno(new CPF("123.456.789-10"), "testetelefone", new Email("teste@telefone.com"));
        aluno.adicionarTelefone("12", "12345789");
        aluno.adicionarTelefone("13", "12345789");
        assertThrows(IllegalArgumentException.class, () -> aluno.adicionarTelefone("14", "123456789"));
        assertEquals(2, aluno.getTelefoneList().size());
    }
    @Test
    void deveriaAdicionarTelefone(){
        Aluno aluno = new Aluno(new CPF("123.456.789-10"), "testetelefone", new Email("teste@telefone.com"));
        aluno.adicionarTelefone("12", "12345789");
        assertEquals(1, aluno.getTelefoneList().size());
    }
}