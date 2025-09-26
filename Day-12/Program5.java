// ### Problem 1: Abstract Classes (Payment Processing)
// **Task ■** - Create an abstract class named PaymentMethod with: - A private double variable for amount. - A constructor to set amount. - A concrete method getTransactionDetails() that prints the transaction amount. - An abstract boolean method processPayment(). - Create two concrete classes, CreditCardPayment and PayPalPayment, that extend PaymentMethod. - Implement processPayment() in each class with appropriate print statements. **Why it's asked:** Tests understanding of abstraction and forcing subclasses to implement specific logic.

abstract class PaymentMethod {
    private double amount;

    PaymentMethod(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    void getTransactionDetails() {
        System.out.println("The transaction amount is: " + amount);
    }

    abstract boolean processPayment();
}

class CreditCardPayment extends PaymentMethod {
    CreditCardPayment(double amount) {
        super(amount);
    }

    boolean processPayment() {
        System.out.println("Processing credit card payment of: " + getAmount());
        return true;
    }
}

class PayPalPayment extends PaymentMethod {
    PayPalPayment(double amount) {
        super(amount);
    }

    boolean processPayment() {
        System.out.println("Processing PayPal payment of: " + getAmount());
        return true;
    }
}
public class Program5 {
    public static void main(String[] args) {
        PaymentMethod p1 = new CreditCardPayment(1500.00);
        p1.getTransactionDetails();
        p1.processPayment();

        System.out.println();

        PaymentMethod p2 = new PayPalPayment(2500.50);
        p2.getTransactionDetails();
        p2.processPayment();
    }
}
