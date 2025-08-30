package BankAccount;

public class Main {
    public static void main(String[] args) throws InsufficientFundsException {
        
        AccountOperations[] accounts = new AccountOperations[2];
        accounts[0] = new SavingsAccount("Prince", 5000, 25000);
        accounts[1] = new CurrentAccount("Shyam", 10000, 20000);

        System.out.println("\n--- Polymorphism with Interface ---");
        for (AccountOperations acc : accounts) {
            acc.deposit(6000);   // deposit allowed
            acc.withdraw(12000);  // handled differently for each account type
            acc.displayInfo();
            System.out.println();
        }

        System.out.println("Total Account Holders: " + Bank.getTotalHolders());
    }
}

