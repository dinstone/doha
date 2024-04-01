#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.domain.model;

public class OrderAggregate {

    private String id;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static OrderAggregate create(String userId, String poi, String sn) {
        OrderAggregate order = new OrderAggregate();
        order.setId(userId+poi+sn);
        return order;
    }
}
