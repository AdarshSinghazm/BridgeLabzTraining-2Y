class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;
    
    public BankAccount(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Successfully withdrew: $" + amount);
            } else {
                System.out.println("Insufficient balance!");
            }
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }
    
    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }
    
    public void displayAccountDetails() {
        System.out.println("Account Details:");
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        displayBalance();
    }
}

public class ATMSimulationProgram {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("John Doe", "ACC001", 1000.0);
        BankAccount account2 = new BankAccount("Jane Smith", "ACC002", 500.0);
        
        account1.displayAccountDetails();
        System.out.println();
        
        account1.deposit(200.0);
        account1.withdraw(150.0);
        account1.withdraw(1200.0);
        account1.displayBalance();
        
        System.out.println("\n" + "=".repeat(30) + "\n");
        
        account2.displayAccountDetails();
        account2.withdraw(600.0);
        account2.deposit(300.0);
        account2.displayBalance();
    }
}