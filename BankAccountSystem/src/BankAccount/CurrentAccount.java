package BankAccount;

public class CurrentAccount extends Bank {
    
    private int overdraftLimit;

    public CurrentAccount(String holderName, double balance, int overdraftLimit) {
        super(holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() + overdraftLimit >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal Successful: Balance = " + getBalance() + 
                               " | Overdraft Remaining = " + (overdraftLimit + getBalance()));
        } else {
            System.out.println("Withdrawal Denied. Overdraft limit exceeded.");
        }
    }
}

