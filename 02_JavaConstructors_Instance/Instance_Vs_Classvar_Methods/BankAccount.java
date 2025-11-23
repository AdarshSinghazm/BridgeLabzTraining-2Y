public class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(1001, "Alice", 5000);
        sa.displayAccount();
        sa.deposit(1500);
        System.out.println("Updated Balance: ₹" + sa.getBalance());
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void displayAccount() {
        System.out.println("Account No: " + accountNumber + " | Holder: " + accountHolder);
    }

}
