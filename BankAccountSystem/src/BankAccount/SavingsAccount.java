package BankAccount;

public class SavingsAccount extends Bank {
    private int limit;

    public SavingsAccount(String holderName, double balance , int limit) {
        super(holderName, balance);
        this.limit = limit;
    }

    @Override
    public void deposit(double amount) {
        if(amount > limit) {
            System.out.println("Sorry, can't deposit more than: " + limit);
        } else {
            super.deposit(amount);
        }
    }

    @Override
    public void withdraw(double amount) {
        if(amount > limit) {
            System.out.println("Can't Withdraw. Try amount lesser than: " + limit);
        } else {
            try {
                super.withdraw(amount);
            } catch(InsufficientFundsException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }
    }
}
