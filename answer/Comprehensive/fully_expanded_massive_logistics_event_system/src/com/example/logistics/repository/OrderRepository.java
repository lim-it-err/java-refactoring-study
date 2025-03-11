package com.example.logistics.repository;

import java.util.HashMap;
import java.util.Map;

public class OrderRepository {
    private static Map<String, String> orders = new HashMap<>();

    public void createOrder(String orderId, String customerId) {
        orders.put(orderId, customerId);
    }

    public boolean orderExists(String orderId) {
        return orders.containsKey(orderId);
    }

    public void cancelOrder(String orderId) {
        orders.remove(orderId);
        // FIXME: No refund mechanism implemented when order is canceled
    }
}
