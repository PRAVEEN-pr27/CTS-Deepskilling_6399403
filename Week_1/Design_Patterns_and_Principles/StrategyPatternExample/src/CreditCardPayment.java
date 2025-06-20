public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String holderName;

    public CreditCardPayment(String cardNumber, String holderName) {
        this.cardNumber = cardNumber;
        this.holderName = holderName;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card: " + holderName);
    }
}
