#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.port.repository;

import ${package}.domain.model.OrderAggregate;

public interface OrderRepository {
    public void save(OrderAggregate order);
}
