public class Main {
    public static void main(String[] args) {

        PaymentContext payment = new PaymentContext();

        // Credit Card payment
        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9876-5432", "Arjun");
        payment.setPaymentStrategy(creditCard);
        payment.makePayment(1200.00);

        // PayPal payment
        PaymentStrategy paypal = new PayPalPayment("arjun@example.com");
        payment.setPaymentStrategy(paypal);
        payment.makePayment(750.50);
    }
}
