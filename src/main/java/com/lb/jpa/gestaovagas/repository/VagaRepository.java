package com.lb.jpa.gestaovagas.repository;
import com.lb.jpa.gestaovagas.domain.model.Vaga;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface VagaRepository extends JpaRepository<Vaga, UUID> {
}

/**
 * SpringData gera a implementação sozinha
 * com metodos: save, findbyid, findAll, etc
 */