package com.example.logistics.service;

import com.example.logistics.repository.DeliveryRepository;
import com.example.logistics.events.EventDispatcher;

public class DeliveryService {
    private DeliveryRepository deliveryRepository = new DeliveryRepository();
    private EventDispatcher eventDispatcher = new EventDispatcher();

    public void dispatchOrder(String orderId) {
        if (!deliveryRepository.orderExists(orderId)) {
            System.out.println("Order does not exist: " + orderId); // FIXME: No rollback mechanism
            return;
        }
        System.out.println("Dispatching order: " + orderId);
        deliveryRepository.markAsDispatched(orderId);
        eventDispatcher.publishEvent("ORDER_DISPATCHED", orderId);
    }
}
