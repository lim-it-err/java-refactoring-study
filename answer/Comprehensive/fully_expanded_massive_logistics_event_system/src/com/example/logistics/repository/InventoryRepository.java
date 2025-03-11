package com.example.logistics.repository;

import java.util.HashMap;
import java.util.Map;

public class InventoryRepository {
    private static Map<String, Integer> stockLevels = new HashMap<>();

    public void modifyStock(String warehouseId, String itemId, int change) {
        stockLevels.put(itemId, stockLevels.getOrDefault(itemId, 0) + change);
        // FIXME: No negative stock validation, allowing overselling
    }

    public int getStockLevel(String itemId) {
        return stockLevels.getOrDefault(itemId, 0);
    }
}
