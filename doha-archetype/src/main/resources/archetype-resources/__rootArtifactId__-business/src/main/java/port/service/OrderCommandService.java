#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.port.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ${package}.domain.model.OrderAggregate;
import ${package}.domain.service.OrderRuleService;
import ${package}.port.remote.CalculateRemote;
import ${package}.port.repository.OrderRepository;

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
