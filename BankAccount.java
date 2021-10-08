public class BankAccount {

    // Attributes - Belong to the instance
    private double checkingBalance;
    private double savingsBalance;

    // Class Members - Belong to the class itself
    private static int numOfAccounts; 
    private static double totalMoneyStored;

    public BankAccount(double checkingBalance, double savingsBalance) {
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        numOfAccounts++;
        totalMoneyStored += (checkingBalance + savingsBalance);
    }


    // Getter for Checking
    public double getCheckingBalance() {
        return checkingBalance;
    }
    // Setter for Checking
    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }


    // Getter for Savings
    public double getSavingsBalance() {
        return savingsBalance;
    }
    // Setter for Savings
    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }


    // Deposit Money method
    public void depositMoney(String account, double deposit){
        if(account.equals("checking")) {
            this.setCheckingBalance(this.checkingBalance + deposit);
        }
        else{
            this.setSavingsBalance(this.getSavingsBalance() + deposit);
        }
        BankAccount.totalMoneyStored += deposit;
    }

    // Withdraw Money method
    public void withdrawMoney(String account, double withdrawal) {
        if(account.equals("checking")) {
            if(this.checkingBalance < withdrawal) {
                System.out.println("Insufficient Funds for Checking!!!");
            }
            else {
                this.setCheckingBalance(this.checkingBalance - withdrawal);
            }
        } 
        else{
            if(this.savingsBalance < withdrawal) {
                System.out.println("Insufficient Funds for Savings!!!");
            }
            else {
                this.setSavingsBalance(this.savingsBalance - withdrawal);
            }
        }
        BankAccount.totalMoneyStored -= withdrawal;
    }


    // Getter for Total Money Stored
    public static double getTotalMoney() {
        return totalMoneyStored;
    }
    // Setter for Total Money Stored
    public static void setTotalMoney(double totalMoneyStored) {
        BankAccount.totalMoneyStored = totalMoneyStored;
    }


    // Getter for Number of Accounts
    public static int getNumOfAccounts() {
        return numOfAccounts;
    }
    // Setter for Number of Accounts
    public static void setNumOfAccounts(int numOfAccounts) {
        BankAccount.numOfAccounts = numOfAccounts;
    }
}