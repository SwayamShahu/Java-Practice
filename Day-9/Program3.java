/*
Challenge 3: The BankAccount 🏦
This challenge combines void methods, methods with return values, and basic logic.

Task:
1. Create a simple BankAccount class.
Class Name: BankAccount
2. Fields:
    1. String accountHolderName;
    2. double balance;
3. Methods:
    - deposit(double amount): A void method that adds the amount to the balance. Print a confirmation message. (Bonus: Add a check to prevent depositing a negative amount).
    - withdraw(double amount): A void method that subtracts the amount from the balance. Print a confirmation. (Bonus: Add a check to prevent withdrawing more money than is in the account).
    - getBalance(): This method should return the current balance.
    - printAccountDetails(): A void method that prints the account holder's name and their final balance.
4. In your main method: Create a BankAccount, deposit some money, try to withdraw money, and finally, print the account details.

*/

class BankAccount{
    String accountHolderName;
    double balance;

    public void deposit(double amount){
        if(amount > 0){
            this.balance = this.balance + amount;
            System.out.println("Money is been deposited!!!!!");
        }
    }
    public void withdraw(double amount){
        if(amount <= this.balance){
            this.balance = this.balance - amount;
            System.out.println("Money is been withdraw!!!!!");
        }else{
            System.out.println("Insufficient Balance");
        }
    }
    public double getBalance(){
        return balance;
    }
    public void printAccountDetails(){
        System.out.println("Account Holder: " + this.accountHolderName);
        System.out.println("Balance: " + this.balance);
    }
}
public class Program3 {
    public static void main(String[] args) {
        BankAccount obj =  new BankAccount();
        obj.accountHolderName = "Sam";
        obj.balance = 10000;

        obj.deposit(500);

        obj.withdraw(250);

        obj.getBalance();

        obj.printAccountDetails();
    }
}
