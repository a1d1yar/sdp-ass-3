public class InternalPaymentProcessor implements PaymentProcessor{
    @Override
    public void processPayment (double amount) {
        System.out.println("Processing payment internally: $" + amount);
    }
}
