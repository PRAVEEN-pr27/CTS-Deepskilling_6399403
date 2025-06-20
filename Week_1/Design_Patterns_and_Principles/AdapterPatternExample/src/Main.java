public class Main {
    public static void main(String[] args) {
        // Using PayPal through adapter
        PayPalGateway paypal = new PayPalGateway();
        PaymentProcessor paypalProcessor = new PayPalAdapter(paypal);
        paypalProcessor.processPayment(1500.0);

        // Using Stripe through adapter
        StripeGateway stripe = new StripeGateway();
        PaymentProcessor stripeProcessor = new StripeAdapter(stripe);
        stripeProcessor.processPayment(2500.0);
    }
}
