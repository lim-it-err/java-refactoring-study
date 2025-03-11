package com.example.logistics.repository;

import java.util.HashMap;
import java.util.Map;

public class WarehouseRepository {
    private static Map<String, Integer> storage = new HashMap<>();

    public void allocate(String warehouseId, String itemId, int quantity) {
        storage.put(itemId, storage.getOrDefault(itemId, 0) + quantity);
    }

    public void deallocate(String warehouseId, String itemId, int quantity) {
        storage.put(itemId, storage.getOrDefault(itemId, 0) - quantity);
    }
}
