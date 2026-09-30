package com.lb.jpa.gestaovagas.mapper;
import com.lb.jpa.gestaovagas.domain.model.Vaga;
import com.lb.jpa.gestaovagas.dto.VagaRequestDTO;
import com.lb.jpa.gestaovagas.dto.VagaResponseDTO;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface VagaMapper {
    VagaResponseDTO toDTO(Vaga entity);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "dataCriacao", ignore = true)
    Vaga toEntity(VagaRequestDTO dto);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "dataCriacao", ignore = true)
    void updateEntityFromDTO(VagaRequestDTO dto, @MappingTarget Vaga entity);
    /**
     * Seu Service precisa converter DTO em Entity (e o contrário)
     * Sem ajuda do MapStruct (Feito na mão):
     * Vaga vaga = new Vaga();
     * vaga.setTitulo(dto.titulo());
     * vaga.setEmpresa(dto.empresa());
     * Com ajuda, diminui o codigo repetitivo e converte automaticamente,
     * apenas descrevendo o que quer
     */
}