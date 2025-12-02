// Abstract class
abstract class Payment {
    public abstract void processPayment(double amount);

    public void verifyTransaction() {
        System.out.println("Transaction verified successfully.");
    }
}

// Subclass 1
class CreditCardPayment extends Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card Payment of " + amount);
    }
}

// Subclass 2
class PayPalPayment extends Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal Payment of " + amount);
    }
}

// Main class
public class PaymentDemo {
    public static void main(String[] args) {
        Payment p;

        p = new CreditCardPayment();   // Polymorphism
        p.processPayment(1500);
        p.verifyTransaction();

        p = new PayPalPayment();       // Polymorphism
        p.processPayment(2500);
        p.verifyTransaction();
    }
}
