package com.lb.jpa.gestaovagas.exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}

/**
 * Classe central que captura exceções
 * e devolve resposta padronizada
 */