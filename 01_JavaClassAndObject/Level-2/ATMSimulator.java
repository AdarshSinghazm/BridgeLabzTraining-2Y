public class ATMSimulator {
    String accountHolder;
    int accountNumber;
    double balance;

    public ATMSimulator(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        ATMSimulator b = new ATMSimulator("Abhi", 12345, 5000.0);
        b.deposit(2000);
        b.withdraw(3000);
        b.displayBalance();
    }
}
