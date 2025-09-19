class BankAccount {
    protected double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    private static final double PENALTY = 50.0; 

    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Over-withdrawal attempt! Penalty applied.");
            balance -= PENALTY;
        } else {
            balance -= amount;
            System.out.println("Savings withdrawal: " + amount + ", Remaining Balance: " + balance);
        }
    }
}

class CheckingAccount extends BankAccount {
    private static final double OVERDRAFT_LIMIT = 500.0;

    CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance + OVERDRAFT_LIMIT) {
            balance -= amount;
            System.out.println("Checking withdrawal: " + amount + ", Remaining Balance: " + balance);
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }
}

public class Program5 {
    public static void main(String[] args) {
        BankAccount acc;

        acc = new SavingsAccount(1000);
        acc.withdraw(200);  
        acc.withdraw(1200);  

        // Checking Account
        acc = new CheckingAccount(1000);
        acc.withdraw(1200);  
        acc.withdraw(2000);  
    }
}

