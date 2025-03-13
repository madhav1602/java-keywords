class BankAccount {
    static String bankName = "SBI Bank";
    static int totalAccounts = 0;
    String accountHolderName;
    final int accountNumber;


    // Constructor
    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    // Static method to get total accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // Method to display account details
    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + this.accountHolderName);
            System.out.println("Account Number: " + this.accountNumber);
        } else {
            System.out.println("Invalid account object.");
        }
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Madhav", 1001);
        BankAccount acc2 = new BankAccount("Simran", 1002);

        acc1.displayAccountDetails();
        acc2.displayAccountDetails();


        System.out.println("Total Bank Accounts: " + BankAccount.getTotalAccounts());

    }
}

