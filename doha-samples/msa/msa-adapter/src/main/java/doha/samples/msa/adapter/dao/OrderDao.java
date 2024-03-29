package doha.samples.msa.adapter.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import doha.samples.msa.domain.model.OrderAggregate;
import doha.samples.msa.port.repository.OrderRepository;

@Component
public class OrderDao implements OrderRepository {

    Logger logger = LoggerFactory.getLogger(OrderDao.class);

    @Override
    public void save(OrderAggregate order) {
        logger.info("save order {} success", order.getId());
    }
}
