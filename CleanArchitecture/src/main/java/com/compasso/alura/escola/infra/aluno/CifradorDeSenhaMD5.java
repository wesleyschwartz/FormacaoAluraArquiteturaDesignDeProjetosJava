package com.compasso.alura.escola.infra.aluno;

import com.compasso.alura.escola.dominio.cifradorDeSenha.CifradorDeSenha;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CifradorDeSenhaMD5 implements CifradorDeSenha {
    @Override
    public String cifrarSenha(String senha) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(senha.getBytes());
            byte[] bytes = messageDigest.digest();
            StringBuilder stringBuilder = new StringBuilder();
            for (byte aByte : bytes) {
                stringBuilder.append(Integer.toString((aByte & 0xff) + 0x100, 16).substring(1));
            }
            return stringBuilder.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("erro ao gerar senha");
        }
    }

    @Override
    public boolean validarSenhaCifrada(String senhaCrifada, String senha) {
        return senhaCrifada.equals(cifrarSenha(senha));
    }
}
