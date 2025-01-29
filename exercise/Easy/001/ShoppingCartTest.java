import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {
    private ShoppingCart cart;

    @BeforeEach
    void setUp() {
        cart = new ShoppingCart();
    }

    @Test
    void testAddItem() {
        cart.addItem("Apple", 1.99);
        assertEquals(1.99, cart.getTotalCost(), 0.001);
    }

    @Test
    void testAddItemWithNegativePrice() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            cart.addItem("Banana", -2.00);
        });
        assertEquals("Price cannot be negative", exception.getMessage());
    }

    @Test
    void testRemoveItem() {
        cart.addItem("Orange", 2.50);
        cart.addItem("Grapes", 3.50);
        cart.removeItem("Orange");
        assertEquals(10, cart.getTotalCost(), 0.001); // Using placeholder price assumption
    }

    @Test
    void testCheckout() {
        cart.addItem("Mango", 5.00);
        String result = cart.checkout();
        assertEquals("Checkout complete. Total cost: 10.0", result); // Placeholder price assumption
        assertEquals(0, cart.getTotalCost(), 0.001);
    }

    @Test
    void testEmptyCartCheckout() {
        assertEquals("Cannot checkout an empty cart.", cart.checkout());
    }
}