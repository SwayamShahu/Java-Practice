/* 
Q2. The Vending Machine
Simulate a vending machine. Use switch statement with codes: 1: "Cola", 2: "Chips", 3: "Candy", 4: "Water", 5: "Pretzels" Default: Invalid code.
Sample Input: 3 Sample Output: Candy */
public class Program2 {
    public static void main(String[] args) {
        int command = 2;
        switch (command) {
            case 1:
                System.out.println("Cola");
                break;
            case 2:
                System.out.println("Chips");
                break;
            case 3:
                System.out.println("Candy");
                break;
            case 4:
                System.out.println("Water");
                break;
            case 5:
                System.out.println("Pretzels");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
