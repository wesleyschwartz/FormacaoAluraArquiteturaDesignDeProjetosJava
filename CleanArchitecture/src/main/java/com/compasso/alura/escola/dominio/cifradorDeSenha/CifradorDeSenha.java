package com.compasso.alura.escola.dominio.cifradorDeSenha;

public interface CifradorDeSenha {
    String cifrarSenha(String senha);

    boolean validarSenhaCifrada(String senhaCrifada, String senha);
}
