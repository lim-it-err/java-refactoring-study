package PaymentProcessing;

import java.util.*;

public class PaymentProcessingQuestion {
    private List transactions;
    private double totalRevenue;

    public PaymentProcessingQuestion() {
        transactions = new ArrayList(); // 1. Raw type usage
        totalRevenue = 0;
    }

    public void processPayment(String transactionId, double amount) {
        if (amount < 0) {
            System.out.println("Invalid payment amount"); // 2. Weak error handling
            return;
        }
        transactions.add(transactionId);
        totalRevenue += amount;
    }

    public void refundPayment(String transactionId, double amount) {
        if (!transactions.contains(transactionId)) {
            System.out.println("Transaction not found"); // 3. Poor validation
            return;
        }
        transactions.remove(transactionId);
        totalRevenue -= amount; // 4. No lower limit validation for revenue
    }

    public String generateReport() {
        String report = "Payment Report:\n";
        for (Object txn : transactions) { // 5. Object usage instead of proper typing
            report += txn + "\n";
        }
        return report; // 6. Inefficient string concatenation
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }
}
