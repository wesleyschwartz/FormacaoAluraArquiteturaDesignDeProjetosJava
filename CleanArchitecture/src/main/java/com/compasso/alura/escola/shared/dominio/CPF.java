package com.compasso.alura.escola.shared.dominio;

public class CPF {
    private String cpf;

    public CPF(String cpf) {
        if (cpf == null || !cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
            throw new IllegalArgumentException("CPF inválido");
        }
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return cpf;
    }
}
