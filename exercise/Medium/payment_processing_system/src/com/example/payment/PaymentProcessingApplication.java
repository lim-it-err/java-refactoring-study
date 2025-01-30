package payment_processing_system.src.com.example.payment;

import com.example.payment.service.PaymentService;

public class PaymentProcessingApplication {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

        // FIXME: No transaction rollback mechanism, potential inconsistency
        paymentService.processPayment("TXN123", 100.50);
        paymentService.refundPayment("TXN123", 50.25);

        System.out.println("Payment Processing System - Transactions Complete");
    }
}
