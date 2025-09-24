// 3. Bank Account System: Create an abstract class BankAccount with abstract methods deposit() and withdraw(). It should also have a concrete method getBalance() that returns the account balance. Create two subclasses, SavingsAccount and CurrentAccount, that extend BankAccount and implement the abstract methods according to the rules of each account type (e.g., a SavingsAccount might have a transaction limit).

abstract class BankAccount {
    double balance;
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
    public double getBalance(){
        return balance;
    }
}
class SavingsAccount extends BankAccount{
    double transationLimit = 5000;
    public void deposit(double amount){
        balance =  balance + amount;
    }
    public void withdraw(double amount){
        if(amount <= transationLimit && balance >= amount){
            balance = balance - amount;
        }else{
            System.out.println("Transaction limit");
        }
    }
}
class CurrentAccount extends BankAccount{
    public void deposit(double amount){
        balance =  balance + amount;
    }
    public void withdraw(double amount){
        if( balance >= amount){
            balance = balance - amount;
        }else{
            System.out.println("Transaction limit");
        }
    }
}
public class Program3 {
    public static void main(String[] args) {
        CurrentAccount obj1 = new CurrentAccount();
        obj1.balance = 50000;
        obj1.deposit(20000);
        obj1.withdraw(40000);
        System.out.println(obj1.getBalance());

        SavingsAccount obj2 = new SavingsAccount();
        obj2.balance = 50000;
        obj2.deposit(20000);
        obj2.withdraw(40000);
        System.out.println(obj2.getBalance());
    }
}