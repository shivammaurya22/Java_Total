class BankAccount{
    private String accountHolder;
    private double balance;

    //constructor
    public BankAccount(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // deposit method
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println(amount+" deposited. new balance is: "+balance);
        }else{
            System.out.println("Inavalid deposit amount.");
        }
    }

    // withdraw amount mehtod
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println(amount+" withdrawn. your new balance is: "+ balance);
        }else{
            System.out.println("Insufficient balance in your account.");
        }
    } 

    // display the account details
    public void displayDetails(){
        System.out.println("Account Holder Name: "+ accountHolder);
        System.out.println("Balance: "+ balance);
    } 
}

class Bank{
    public void performOperations(){
        BankAccount acc1 = new BankAccount("Shivam", 10000);
        acc1.displayDetails();
        acc1.deposit(20000);
        acc1.withdraw(5000);
        acc1.withdraw(50000);
        acc1.displayDetails();
    }
}

public class LinkExample {
    public static void main(String[] args) {
        Bank bank1 = new Bank();
        bank1.performOperations();
    }
}
