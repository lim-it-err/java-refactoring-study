package com.example.logistics;

import com.example.logistics.service.DeliveryService;
import com.example.logistics.service.InventoryService;
import com.example.logistics.service.TrackingService;
import com.example.logistics.service.OrderService;
import com.example.logistics.service.WarehouseService;
import com.example.logistics.events.EventDispatcher;

public class LogisticsApplication {
    private static DeliveryService deliveryService = new DeliveryService();
    private static InventoryService inventoryService = new InventoryService();
    private static TrackingService trackingService = new TrackingService();
    private static OrderService orderService = new OrderService();
    private static WarehouseService warehouseService = new WarehouseService();
    private static EventDispatcher eventDispatcher = new EventDispatcher();

    public static void main(String[] args) {
        System.out.println("Logistics Management System Started...");

        orderService.placeOrder("ORDER123", "CUSTOMER_1");
        deliveryService.dispatchOrder("ORDER123");
        inventoryService.updateStock("WAREHOUSE_1", "ITEM_456", -5);
        trackingService.trackShipment("SHIPMENT789");
        warehouseService.allocateStorage("WAREHOUSE_1", "ITEM_456", 10);

        // TODO: Implement actual event queue processing instead of synchronous method calls
    }
}
