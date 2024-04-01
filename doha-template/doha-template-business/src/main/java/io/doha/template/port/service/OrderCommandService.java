package io.doha.template.port.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.doha.template.domain.model.OrderAggregate;
import io.doha.template.domain.service.OrderRuleService;
import io.doha.template.port.remote.CalculateRemote;
import io.doha.template.port.repository.OrderRepository;

@Component
public class OrderCommandService {

    @Autowired
    CalculateRemote calculateRemote;

    @Autowired
    OrderRepository repository;

    public String createOrder(String userId, String poi, String sn) {
        double c = calculateRemote.add(Math.random(), 0.9);

        OrderAggregate order = OrderAggregate.create(userId, poi, sn + c);

        repository.save(order);

        return order.getId();
    }
}
