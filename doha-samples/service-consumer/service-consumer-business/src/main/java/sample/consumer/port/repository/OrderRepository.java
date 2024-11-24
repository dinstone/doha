package sample.consumer.port.repository;

import sample.consumer.domain.model.OrderAggregate;

public interface OrderRepository {
    public void save(OrderAggregate order);
}
