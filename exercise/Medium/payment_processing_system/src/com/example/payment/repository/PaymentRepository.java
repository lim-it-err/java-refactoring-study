package payment_processing_system.src.com.example.payment.repository;

import java.util.HashMap;
import java.util.Map;

public class PaymentRepository {
    private final Map<String, Double> transactions = new HashMap<>();

    public void save(String transactionId, double amount) {
        // FIXME: No validation for duplicate transactions
        transactions.put(transactionId, amount);
    }

    public boolean exists(String transactionId) {
        return transactions.containsKey(transactionId);
    }

    public double getTransactionAmount(String transactionId) {
        return transactions.getOrDefault(transactionId, 0.0);
    }
}
