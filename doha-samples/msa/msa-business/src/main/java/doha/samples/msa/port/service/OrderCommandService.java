package doha.samples.msa.port.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import doha.samples.msa.domain.model.OrderAggregate;
import doha.samples.msa.domain.service.OrderRuleService;
import doha.samples.msa.port.remote.CalculateRemote;
import doha.samples.msa.port.repository.OrderRepository;

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
