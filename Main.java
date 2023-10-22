public class Main {
    public static void main(String[] args) {
        // Internal payment processing system
        PaymentProcessor internalProcessor = new InternalPaymentProcessor();

        // External payment gateway (third-party)
        ExternalPaymentGateway externalGateway = new ExternalPaymentGatewayProvider();

        // Use the adapter to process a payment through the external gateway
        PaymentProcessor adapter = new PaymentProcessorAdapter(externalGateway);

        internalProcessor.processPayment(100.0);  // Internal payment
        adapter.processPayment(100.0);            // Payment through the external gateway
    }
}