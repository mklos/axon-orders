package com.example.orders.api;

/**
 * Created with IntelliJ IDEA.
 * User: magnus.smith
 * Date: 10/02/14
 * Time: 11:59
 *
 */
public class OrderCancelledEvent {
    private final OrderId orderId;


    public OrderCancelledEvent(OrderId orderId) {
        this.orderId = orderId;
    }
}
