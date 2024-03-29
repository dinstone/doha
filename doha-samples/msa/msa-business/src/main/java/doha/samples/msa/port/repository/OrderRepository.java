package doha.samples.msa.port.repository;

import doha.samples.msa.domain.model.OrderAggregate;

public interface OrderRepository {
    public void save(OrderAggregate order);
}
