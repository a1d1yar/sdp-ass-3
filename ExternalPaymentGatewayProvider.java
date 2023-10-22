public class ExternalPaymentGatewayProvider implements ExternalPaymentGateway{
    @Override
    public void executePayment (double totalAmount) {
        System.out.println("Processing payment through the external gateway: $" + totalAmount);
    }
}
