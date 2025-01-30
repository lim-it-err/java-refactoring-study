package payment_processing_system.src.com.example.payment.service;

import payment_processing_system.src.com.example.payment.repository.PaymentRepository;

import java.util.concurrent.CompletableFuture;

public class PaymentService {
    private final PaymentRepository paymentRepository;

    public PaymentService() {
        this.paymentRepository = new PaymentRepository();
    }

    public void processPayment(String transactionId, double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Payment amount must be positive");
        }
        paymentRepository.save(transactionId, amount);
    }

    public void refundPayment(String transactionId, double amount) {
        if (!paymentRepository.exists(transactionId)) {
            throw new IllegalArgumentException("Transaction not found");
        }
        paymentRepository.save(transactionId + "-REFUND", -amount);
    }

    public CompletableFuture<Void> processBatchPaymentsAsync() {
        return CompletableFuture.runAsync(() -> {
            // TODO: Implement proper batch processing
            System.out.println("Processing batch payments asynchronously...");
        });
    }
}
