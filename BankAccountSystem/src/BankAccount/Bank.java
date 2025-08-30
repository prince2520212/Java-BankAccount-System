package BankAccount;

public class Bank implements AccountOperations {

    private String holderName;
    private double balance;
    private static int holders = 0;
    private static int accountCounter = 1000;
    private int accountNumber;

    public Bank(String holderName , double balance) {
        this.holderName = holderName;
        this.balance = balance;
        this.accountNumber = ++accountCounter;
        holders++;
        
        System.out.println("Holder Name: " + holderName + 
                           " | Account Number: " + accountNumber +
                           " | Current Balance: " + balance);
    }

    public static int getTotalHolders() {
        return holders;
    }
    
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public void displayInfo() {
        System.out.println("Holder Name: " + holderName + " | Current Balance: " + balance);
    }

    @Override
    public void deposit(double amount){
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " | Available Balance: " + balance);
        } else {
            System.out.println("Error: Deposit amount must be greater than 0");
        }
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        if(balance < amount) {
            throw new InsufficientFundsException("Insufficient Funds! Available balance: " + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Available Balance: " + balance);
        }
    }
}
