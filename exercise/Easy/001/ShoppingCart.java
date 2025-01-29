import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<String> items; // 1. Use generics
    private double totalCost;

    public ShoppingCart() {
        items = new ArrayList<>(); // 2. Use diamond operator
        totalCost = 0;
    }

    public void addItem(String item, double price) {
        if (item == null || item.isEmpty()) {
            throw new IllegalArgumentException("Item name cannot be null or empty");
        }
        if (price < 0) { // 3. Validate price
            throw new IllegalArgumentException("Price cannot be negative");
        }
        items.add(item);
        totalCost += price;
    }

    public double getTotalCost() { // 4. Change return type to double
        return totalCost;
    }

    public void removeItem(String item) {
        if (items.contains(item)) {
            items.remove(item);
            recalculateTotalCost(); // 5. Update total cost after removal
        }
    }

    private void recalculateTotalCost() { // Helper method to update total cost
        totalCost = 0;
        for (String item : items) {
            // Assuming a real system would have item-price mapping
            totalCost += 10; // Placeholder for price lookup logic
        }
    }

    public void printCart() {
        if (items.isEmpty()) {
            System.out.println("Cart is empty"); // 7. Handle empty cart case
            return;
        }
        System.out.println("Items in cart:");
        for (String item : items) { // 6. Use appropriate type
            System.out.println(item);
        }
    }

    public String checkout() {
        if (items.isEmpty()) {
            return "Cannot checkout an empty cart."; // Handle empty checkout
        }
        double finalCost = totalCost;
        items.clear();
        totalCost = 0;
        return "Checkout complete. Total cost: " + finalCost;
    }
}
