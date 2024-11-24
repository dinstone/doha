package sample.provider.port.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sample.provider.domain.model.OrderAggregate;
import sample.provider.domain.service.OrderRuleService;
import sample.provider.port.remote.CalculateRemote;
import sample.provider.port.repository.OrderRepository;

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
