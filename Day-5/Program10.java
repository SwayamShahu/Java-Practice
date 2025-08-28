/*
    Q10. The Discount Calculator
    Store discounts:
    - >1000 -> 20%
    - >500 & <=1000 -> 10%
    - <=500 -> none
    Sample Input: purchaseAmount=750.0 
    Sample Output: Final price after 10% discount: $675.0 
*/
public class Program10 {
    public static void main(String[] args) {
        double amount = 750.0;  // sample input
        double finalPrice;

        if (amount > 1000) {
            finalPrice = amount - (amount * 0.20);
            System.out.println("Final price after 20% discount: $" + finalPrice);
        } else if (amount > 500) {
            finalPrice = amount - (amount * 0.10);
            System.out.println("Final price after 10% discount: $" + finalPrice);
        } else {
            System.out.println("Final price after no discount: $" + amount);
        }
    }
}
