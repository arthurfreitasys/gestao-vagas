package com.lb.jpa.gestaovagas.dto;
import java.time.LocalDateTime;
import java.util.UUID;
public record VagaResponseDTO(
        /**
         * O que sai da API que vai pro cliente,
         * definindo apenas o que você quer ele veja
         *
         */
        UUID id,
        String titulo,
        String descricao,
        Double salario,
        LocalDateTime dataCriacao
) {
}