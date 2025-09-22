public class BankAccount {
    private static String bankName = "MyBank";
    private static int totalAccounts = 0;
    
    private final String accountNumber;
    private String accountHolderName;
    
    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }
    
    public static String getBankName() {
        return bankName;
    }
    
    public static int getTotalAccounts() {
        return totalAccounts;
    }
    
    public void displayDetails() {
        System.out.println("Bank: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
    }
    
    public static boolean isValidAccount(Object obj) {
        return obj instanceof BankAccount;
    }
}