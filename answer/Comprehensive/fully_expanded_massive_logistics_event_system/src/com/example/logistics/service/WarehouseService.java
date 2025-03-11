package com.example.logistics.service;

import com.example.logistics.repository.WarehouseRepository;

public class WarehouseService {
    private WarehouseRepository warehouseRepository = new WarehouseRepository();

    public void allocateStorage(String warehouseId, String itemId, int quantity) {
        // FIXME: No optimization for space allocation, inefficient storage system
        warehouseRepository.allocate(warehouseId, itemId, quantity);
    }

    public void removeStorage(String warehouseId, String itemId, int quantity) {
        // FIXME: No checks for minimum stock level
        warehouseRepository.deallocate(warehouseId, itemId, quantity);
    }
}
