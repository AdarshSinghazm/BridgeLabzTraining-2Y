class Customer {
    String name;
    double balance;

    Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void viewBalance() {
        System.out.println(name + "'s balance: " + balance);
    }
}

class Bank {
    String bankName;

    Bank(String bankName) {
        this.bankName = bankName;
    }

    void openAccount(Customer c, double deposit) {
        c.balance += deposit;
        System.out.println("Account opened for " + c.name + " in " + bankName
                + " with deposit: " + deposit);
    }
}

public class Bank_Accounts {
    public static void main(String[] args) {
        Bank bank = new Bank("State Bank");
        Customer c1 = new Customer("Abhishek", 1000);

        bank.openAccount(c1, 5000);
        c1.viewBalance();
    }
}
