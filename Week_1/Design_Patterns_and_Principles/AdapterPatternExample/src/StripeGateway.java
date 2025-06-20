public class StripeGateway {
    public void sendPayment(double amount, String currency) {
        System.out.println("Charged " + currency + " " + amount + " using Stripe.");
    }
}
