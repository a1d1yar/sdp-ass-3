public class PaymentProcessorAdapter implements PaymentProcessor{
    private ExternalPaymentGateway externalPaymentGateway;
    public PaymentProcessorAdapter(ExternalPaymentGateway externalPaymentGateway) {
        this.externalPaymentGateway = externalPaymentGateway;
    }

    @Override
    public void processPayment (double amount) {
        externalPaymentGateway.executePayment(amount);
    }
}
