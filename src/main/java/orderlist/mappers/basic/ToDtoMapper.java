package orderlist.mappers.basic;

public interface ToDtoMapper<DTO, E> extends MappingConfig {
    DTO toDto(E entity);
}
