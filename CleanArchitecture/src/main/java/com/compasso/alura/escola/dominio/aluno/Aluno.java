package com.compasso.alura.escola.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

// AGGREATE ROOT
public class Aluno {
    private CPF cpf;
    private String nome;
    private Email email;
    private List<Telefone> telefoneList = new ArrayList<>();
    private String senha;

    public void adicionarTelefone(String ddd, String numero) {
        if (telefoneList.size() == 2) {
            throw new IllegalArgumentException("Numero de telefones ja atingido!");
        }
        this.telefoneList.add(new Telefone(ddd, numero));
    }

    public Aluno(CPF cpf, String nome, Email email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public String getCpf() {
        return cpf.getCpf();
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email.getEndereco();
    }

    public List<Telefone> getTelefoneList() {
        return telefoneList;
    }
}
