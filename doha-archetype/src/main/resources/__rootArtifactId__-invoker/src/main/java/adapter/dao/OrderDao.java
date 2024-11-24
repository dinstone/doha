#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.adapter.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import ${package}.domain.model.OrderAggregate;
import ${package}.port.repository.OrderRepository;

@Component
public class OrderDao implements OrderRepository {

    Logger logger = LoggerFactory.getLogger(OrderDao.class);

    @Override
    public void save(OrderAggregate order) {
        logger.info("save order {} success", order.getId());
    }
}
