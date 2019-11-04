package orderlist.mappers.basic;

public interface TwoWayMapper<DTO, E> extends ToDtoMapper<DTO, E>, ToEntityMapper<DTO, E> {
}
