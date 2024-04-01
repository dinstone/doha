package io.doha.template.port.repository;

import io.doha.template.domain.model.OrderAggregate;

public interface OrderRepository {
    public void save(OrderAggregate order);
}
