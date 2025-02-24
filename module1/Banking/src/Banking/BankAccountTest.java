package Banking;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankAccountTest {

	// declare objects for testing
	Customer customer;
	BankAccount mycheckingAccount;
	BankAccount mySavingAccount;

	@BeforeEach
	void setUp() {
		// initialize objects here for testing
		this.customer = new Customer("Brandon");
		this.mycheckingAccount = new BankAccount("checking", this.customer);
		this.mySavingAccount = new BankAccount("savings", this.customer);
	}

	@Test
	void testDeposit() {
		//make deposit
		this.mycheckingAccount.deposit(100);
		// test that current balance is 100
		assertEquals(100, this.mycheckingAccount.balance());

		//make deposit of negative amount
		this.mycheckingAccount.deposit(-100);
		// test that current balance is 100
		assertEquals(100, this.mycheckingAccount.balance());

		//balance should not change if amount is negative
		assertEquals(100, this.mycheckingAccount.balance());

		//deposit 0
		this.mycheckingAccount.deposit(0);

		//balance should be the same
		assertEquals(100, this.mycheckingAccount.balance());
	}

	@Test
	void testWithdraw() {
		//deposit initial 100 into savings
		this.mySavingAccount.deposit(100);

		//assert current balance is 100
		assertEquals(100, this.mySavingAccount.balance());

		try {
			this.mySavingAccount.withdraw(80);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// balance should be 20
		assertEquals(20, this.mySavingAccount.balance());

		//try to withdraw amount greater than balance
		//expect the exception to be thrown
		assertThrows(Exception.class, () -> {
			this.mySavingAccount.withdraw(21);
		});

		// balance should be 20
		assertEquals(20, this.mySavingAccount.balance());

		// try to make withdrawal
		// does not throw exception
		assertDoesNotThrow(() -> {
			this.mySavingAccount.withdraw(19);
		});

		// balance should be 1
		assertEquals(1, this.mySavingAccount.balance());
	}

	@Test
	void testFastWithdraw() {
		// initial deposit
		this.mycheckingAccount.deposit(100);

		// try to make fast withdraw
		// default amount is 60
		try {
			this.mycheckingAccount.fastWithdraw();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// balance should be 40
		assertEquals(40, this.mycheckingAccount.balance());

		//reset the fast cash amount
		this.mycheckingAccount.setFastcashAmount(20);
		assertDoesNotThrow(() -> {
			this.mycheckingAccount.fastWithdraw();	
		});

		// balance should be 20
		assertEquals(20, this.mycheckingAccount.balance());

		//set fast cash amount to negative value
		//should be ignored
		this.mycheckingAccount.setFastcashAmount(-50);
		
		//should still withdraw 20
		try {
			this.mycheckingAccount.fastWithdraw();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//balance should be 0 after fast withdraw
		assertEquals(0, this.mycheckingAccount.balance());

		//expect exception with I try to make fast withdraw because of 0 balance
		assertThrows(Exception.class, () -> {
			this.mycheckingAccount.fastWithdraw();
		});
	}
}
