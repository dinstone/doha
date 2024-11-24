package io.doha.template.adapter.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import io.doha.template.domain.model.OrderAggregate;
import io.doha.template.port.repository.OrderRepository;

@Component
public class OrderDao implements OrderRepository {

    Logger logger = LoggerFactory.getLogger(OrderDao.class);

    @Override
    public void save(OrderAggregate order) {
        logger.info("save order {} success", order.getId());
    }
}
