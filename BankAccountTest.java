public class BankAccountTest {
    public static void main(String[] args) {
        System.out.println("Hello Bank Accounts!");
        
        BankAccount account1 = new BankAccount(5000.0, 7000.0);
        BankAccount account2 = new BankAccount(10000.0, 25000.0);
        System.out.println(" ");

        System.out.println("Current Account(s) Status");
        System.out.println("# of Accounts: " + BankAccount.getNumOfAccounts());
        System.out.println("Checking: " + account1.getCheckingBalance());
        System.out.println("Savings: " + account2.getSavingsBalance());
        System.out.println("Total Bank Money: " + BankAccount.getTotalMoney());
        System.out.println(" ");

        account1.depositMoney("checking", 1000.0);
        account2.depositMoney("savings", 2000.0);

        System.out.println("Updated Account(s) Status");
        System.out.println("# of Accounts: " + BankAccount.getNumOfAccounts());
        System.out.println("Checking: " + account1.getCheckingBalance());
        System.out.println("Savings: " + account2.getSavingsBalance());
        System.out.println("Total Bank Money: " + BankAccount.getTotalMoney());
        System.out.println(" ");

        account1.withdrawMoney("checking", 1000.0);
        account2.withdrawMoney("savings", 10000);

        System.out.println("Updated Account(s) Status");
        System.out.println("# of Accounts: " + BankAccount.getNumOfAccounts());
        System.out.println("Checking: " + account1.getCheckingBalance());
        System.out.println("Savings: " + account2.getSavingsBalance());
        System.out.println("Total Bank Money: " + BankAccount.getTotalMoney());
        System.out.println(" ");

    }
}
