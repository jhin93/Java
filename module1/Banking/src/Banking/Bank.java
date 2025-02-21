package Banking;

import java.util.Scanner;

/*
 * Represents a bank for managing customers and their bank accounts.
 */
public class Bank {

	public static void main(String[] args) {
		
		//create new instance of Bank class
		Bank bank = new Bank();
		
		// calls the run method in the bank class
		bank.run();
	}
	
	/*
	 * Runs the program by initializing and managing, bank accounts and customers
	 */
	public void run() {
		System.out.println("Welcome to the bank! What is your name? ");

		// create scanner to get user input
		Scanner scanner = new Scanner(System.in);

		// get the next token (word), which is the customer's name
		String name = scanner.next();

		System.out.println("Hello " + name + "! We are creating a new bank account for you.");

		// create a new customer
		Customer customer = new Customer(name);

		// get address
		System.out.println("What is your address?");

		// get the next token (word), which is the customer's address
		String address = scanner.next();

		// set the address for the customer
		customer.setAddress(address);

		// create a checking and savings account for the customer
		BankAccount checkingAccount = new BankAccount("checking", customer);
		BankAccount savingsAccount = new BankAccount("savings", customer);

		// gets and prints the customer info associated with the checking account
		System.out.println();
		System.out.println("Customer info: ");
		System.out.println(checkingAccount.getCustomerInfo());

		// gets and prints the account info associated with the checking and savings account
		System.out.println("Checking account info: ");
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println("Savings account info: ");
		System.out.println(savingsAccount.getAccountInfo());

		//deposits

		//into checking
		System.out.println();
		System.out.println("Amount(decimal) to deposit into checking account?: ");
		double amount = scanner.nextDouble();
		checkingAccount.deposit(amount);

		//into savings
		System.out.println();
		System.out.println("Amount(decimal) to deposit into savings account?: ");
		amount = scanner.nextDouble();
		savingsAccount.deposit(amount);

		//print new balances
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println(savingsAccount.getAccountInfo());

		//withdraws

		//from checking
		System.out.println();
		System.out.println("Amount(decimal) to withdraw from checking account?: ");
		amount = scanner.nextDouble();
		try {
			checkingAccount.withdraw(amount); // withdraw from checking
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		//from savings
		System.out.println();
		System.out.println("Amount(decimal) to withdraw from savings account?: ");
		amount = scanner.nextDouble();
		try {
			savingsAccount.withdraw(amount); // withdraw from savings
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		//print new balances
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println(savingsAccount.getAccountInfo());

		//close scanner
		scanner.close();
	}

}
