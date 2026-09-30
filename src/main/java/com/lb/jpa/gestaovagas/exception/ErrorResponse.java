package com.lb.jpa.gestaovagas.exception;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDateTime;

public record ErrorResponse(
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM dd'T'HH:mm:ss")
        LocalDateTime timestamp,
        int status,
        String error,
        Object message,
        String pat
) {
}

/**
 * Ele não interrompe nada nem é lançado.
 * Serve para montar o JSON de erro que vai para quem chamou a API:
 * {
 *   "timestamp": "2026-09-30T14:32:10",
 *   "status": 404,
 *   "error": "Not Found",
 *   "message": "Vaga não encontrada",
 *   "path": "/vagas/99"
 * }
 */