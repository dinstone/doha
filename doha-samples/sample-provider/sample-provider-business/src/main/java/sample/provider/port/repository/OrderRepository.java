package sample.provider.port.repository;

import sample.provider.domain.model.OrderAggregate;

public interface OrderRepository {
    public void save(OrderAggregate order);
}
