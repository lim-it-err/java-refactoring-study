package com.example.logistics.service;

import com.example.logistics.repository.OrderRepository;
import com.example.logistics.events.EventDispatcher;

public class OrderService {
    private OrderRepository orderRepository = new OrderRepository();
    private EventDispatcher eventDispatcher = new EventDispatcher();

    public void placeOrder(String orderId, String customerId) {
        if (orderRepository.orderExists(orderId)) {
            System.out.println("Duplicate order detected: " + orderId); // FIXME: No proper duplicate handling
            return;
        }
        orderRepository.createOrder(orderId, customerId);
        eventDispatcher.publishEvent("ORDER_PLACED", orderId);
    }

    public void cancelOrder(String orderId) {
        orderRepository.cancelOrder(orderId);
        System.out.println("Order cancelled: " + orderId); // FIXME: No refund mechanism
    }
}
