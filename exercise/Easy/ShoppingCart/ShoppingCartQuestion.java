package ShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartQuestion {
    private List items;
    private double totalCost;

    public ShoppingCartQuestion() {
        items = new ArrayList();
        totalCost = 0;
    }

    public void addItem(String item, double price) {
        items.add(item);
        totalCost += price;
    }

    public String getTotalCost() {
        return "Total cost: " + totalCost;
    }

    public void removeItem(String item) {
        if (items.contains(item)) {
            items.remove(item);
        }
    }

    public void printCart() {
        System.out.println("Items in cart:");
        for (Object item : items) {
            System.out.println(item);
        }
    }

    public String checkout() {
        items.clear();
        return "Checkout complete. Total cost: " + totalCost;
    }
}
