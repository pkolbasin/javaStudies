package lesson7;

import lesson6.Order;

import java.util.Date;

public class DemoHomeWork {


    public Order createOrder() {
        Order order = new Order(100, new Date(), false, null, "Dnepr", "Ukraine", "Buy");
        return order;
    }


    public Order createOrderAndCallMethods() {
        Order order = new Order(100, new Date(), true, new Date(), "Kiev", "Ukraine", "SomeValue");
        order.confirmOrder();
        order.checkPrice();
        order.isValidType();
        return order;

    }
}
