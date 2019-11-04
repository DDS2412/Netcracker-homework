package orderlist.mappers.basic;

import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

public interface ToEntityMapper<DTO, E> extends MappingConfig {
    E toEntity(DTO dto);

    E updateEntity(@MappingTarget E entity, DTO dto);
}
