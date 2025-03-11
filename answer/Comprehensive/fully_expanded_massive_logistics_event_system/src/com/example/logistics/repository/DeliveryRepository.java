package com.example.logistics.repository;

import java.util.HashMap;
import java.util.Map;

public class DeliveryRepository {
    private static Map<String, String> orders = new HashMap<>();

    public void markAsDispatched(String orderId) {
        orders.put(orderId, "DISPATCHED");
    }

    public boolean orderExists(String orderId) {
        return orders.containsKey(orderId);
    }
}
