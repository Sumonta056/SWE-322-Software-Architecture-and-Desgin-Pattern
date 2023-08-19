package Learning_Design_Patterns.facade;

public class CreditCardProcessor {
    public void processPayment(String creditCardNumber, double amount) {
        System.out.println("Processing payment of $" + amount + " using Credit Card: " + creditCardNumber);
        // Credit card processing logic...
    }
}
