class BankAccount {
    private double balance;  // Private variable (can't be accessed directly)

    // Constructor
    BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // Getter method (to access balance)
    public double getBalance() {
        return balance;
    }

    // Setter method (to update balance)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
}

public class Encapsulation1 {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(5000);  // Initial balance
        System.out.println("Current Balance: " + myAccount.getBalance());
        
        myAccount.deposit(1500);  // Depositing money
        System.out.println("Updated Balance: " + myAccount.getBalance());
    }
}
