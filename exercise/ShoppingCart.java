public class ShoppingCart {
    private List items; // 1. Raw type usage
    private double totalCost;

    public ShoppingCart() {
        items = new ArrayList(); // 2. Missing generics
        totalCost = 0;
    }

    public void addItem(String item, double price) {
        items.add(item);
        totalCost += price; // 3. No validation for negative price
    }

    public String getTotalCost() {
        return "Total cost: " + totalCost; // 4. Return type mismatch with expected functionality
    }

    public void removeItem(String item) {
        if (items.contains(item)) {
            items.remove(item);
            // 5. Missing logic to update totalCost
        }
    }

    public void printCart() {
        System.out.println("Items in cart:");
        for (Object item : items) { // 6. Object type used without casting
            System.out.println(item);
        }
    }

    // 7. Missing edge case handling (e.g., empty cart)
    public String checkout() {
        items.clear();
        return "Checkout complete. Total cost: " + totalCost;
    }
}
