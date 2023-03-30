package com.compasso.alura.escola;

import com.compasso.alura.escola.dominio.Ouvinte;

import java.util.ArrayList;
import java.util.List;

public class PublicadorDeEventos {
    private List<Ouvinte> ouvinteList = new ArrayList<>();

    public void add(Ouvinte ouvinte) {
        this.ouvinteList.add(ouvinte);
    }

    public void publicar(Evento evento) {
        this.ouvinteList.forEach(ouvinte -> ouvinte.processa(evento));
    }
}
