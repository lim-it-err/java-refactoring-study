package InventoryManagement;

import java.util.*;

public class InventoryManagementQuestion {
    private Map inventory;

    public InventoryManagementQuestion() {
        inventory = new HashMap(); // 1. Raw type usage
    }

    public void addProduct(String productId, int quantity) {
        if (quantity < 0) {
            System.out.println("Invalid quantity"); // 2. Weak error handling
            return;
        }
        inventory.put(productId, inventory.getOrDefault(productId, 0) + quantity);
    }

    public void removeProduct(String productId, int quantity) {
        if (!inventory.containsKey(productId) || inventory.get(productId) < quantity) {
            System.out.println("Not enough stock"); // 3. Poor validation
            return;
        }
        inventory.put(productId, inventory.get(productId) - quantity);
    }

    public int checkStock(String productId) {
        return inventory.getOrDefault(productId, 0);
    }

    public String generateReport() {
        String report = "Inventory Report:\n";
        for (Object key : inventory.keySet()) { // 4. Object usage instead of proper typing
            report += key + " - " + inventory.get(key) + "\n";
        }
        return report; // 5. Inefficient string concatenation
    }
}
