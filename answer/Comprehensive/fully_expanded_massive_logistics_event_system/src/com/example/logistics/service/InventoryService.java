package com.example.logistics.service;

import com.example.logistics.repository.InventoryRepository;

public class InventoryService {
    private InventoryRepository inventoryRepository = new InventoryRepository();

    public void updateStock(String warehouseId, String itemId, int change) {
        // FIXME: No stock validation before updating
        System.out.println("Updating stock: " + itemId + " by " + change);
        inventoryRepository.modifyStock(warehouseId, itemId, change);
    }
}
