class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int acc, double bal) {
        this.accountNumber = acc;
        this.balance = bal;
    }

    void displayAccountType() {
        System.out.println("Generic Bank Account");
    }
}

// Subclass 1
class SavingsAccount extends BankAccount {
    double interestRate;
    SavingsAccount(int acc, double bal, double rate) {
        super(acc, bal);
        this.interestRate = rate;
    }
    @Override
    void displayAccountType() {
        System.out.println("Savings Account | Interest Rate: " + interestRate + "%");
    }
}

// Subclass 2
class CheckingAccount extends BankAccount {
    double withdrawalLimit;
    CheckingAccount(int acc, double bal, double limit) {
        super(acc, bal);
        this.withdrawalLimit = limit;
    }
    @Override
    void displayAccountType() {
        System.out.println("Checking Account | Withdrawal Limit: $" + withdrawalLimit);
    }
}

// Subclass 3
class FixedDepositAccount extends BankAccount {
    int tenureYears;
    FixedDepositAccount(int acc, double bal, int tenure) {
        super(acc, bal);
        this.tenureYears = tenure;
    }
    @Override
    void displayAccountType() {
        System.out.println("Fixed Deposit Account | Tenure: " + tenureYears + " years");
    }
}

public class BankTest {
    public static void main(String[] args) {
        BankAccount a1 = new SavingsAccount(101, 5000, 4.5);
        BankAccount a2 = new CheckingAccount(102, 3000, 1000);
        BankAccount a3 = new FixedDepositAccount(103, 10000, 5);

        a1.displayAccountType();
        a2.displayAccountType();
        a3.displayAccountType();
    }

}
