package com.compasso.alura.escola.shared.dominio.evento;

import java.time.LocalDateTime;
import java.util.Map;

public interface Evento {
    LocalDateTime monento();
    TipoDeEvento tipo();
    Map<String, Object> informacoes();
}
