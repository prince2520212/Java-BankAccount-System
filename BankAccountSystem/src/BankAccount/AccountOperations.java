package BankAccount;

public interface AccountOperations {
	
	 void deposit(double amount);
	 void withdraw(double amount) throws InsufficientFundsException;
	 void displayInfo();

}
