/*
3. Advanced Level: The BankAccount Class 🏦 Task: Create a robust BankAccount class with strict rules for data modification. 
Data Members (Private): 
    - accountNumber (long or String) 
    - accountHolderName (String) 
    - balance (double) 
Methods (Public): 
    - Constructor: A constructor to initialize the account with an accountNumber, accountHolderName, and an initial balance. 
    - Getters: Public getter methods for all three fields. 
    - Immutability: There should be no setter for accountNumber. This property should be immutable after the object is created. 
    - deposit(double amount): This method should add to the balance. It must validate that the deposit amount is a positive number. 
    - withdraw(double amount): This method should subtract from the balance. It must validate two conditions: the withdrawal amount is positive, and the transaction will not result in a negative balance (i.e., check for insufficient funds).        
    - balance (i.e., check for insufficient funds). 
Goal: To implement a class with immutable properties (accountNumber) and a critical state (balance) that is carefully managed through methods with strict validation rules. 
*/


class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.balance = initialBalance;
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds for this withdrawal.");
        }
        balance -= amount;
    }
}
public class Program3 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", "John Doe", 1000.0);
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Initial Balance: " + account.getBalance());

        account.deposit(500.0);
        System.out.println("Balance after deposit: " + account.getBalance());

        account.withdraw(200.0);
        System.out.println("Balance after withdrawal: " + account.getBalance());
    }
}
