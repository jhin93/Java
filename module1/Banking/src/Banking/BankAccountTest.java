package Banking;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

class BankAccountTest {

	// declare objects for testing
	Customer customer;
	BankAccount mycheckingAccount;
	BankAccount mySavingAccount;

	@Before
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
		assertEquals(100, this.mycheckingAccount.balance(), 0.001);

		//make deposit of negative amount
		this.mycheckingAccount.deposit(-100);
		// test that current balance is 100
		assertEquals(100, this.mycheckingAccount.balance(), 0.001);

		//balance should not change if amount is negative
		assertEquals(100, this.mycheckingAccount.balance(), 0.001);

		//deposit 0
		this.mycheckingAccount.deposit(0);

		//balance should be the same
		assertEquals(100, this.mycheckingAccount.balance(), 0.001);
	}

	@Test
	void testWithdraw() {
		//deposit initial 100 into savings
		this.mySavingAccount.deposit(100);

		//assert current balance is 100
		assertEquals(100, this.mySavingAccount.balance(), 0.001);

		try {
			this.mySavingAccount.withdraw(80);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// balance should be 20
		assertEquals(20, this.mySavingAccount.balance(), 0.001);

		//try to withdraw amount greater than balance
		//expect the exception to be thrown
		assertThrows(Exception.class, () -> {
			this.mySavingAccount.withdraw(21);
		});

		// balance should be 20
		assertEquals(20, this.mySavingAccount.balance(), 0.001);

		// try to make withdrawal
		// does not throw exception
		try {
			this.mySavingAccount.withdraw(19);
			assertTrue(true);
		} catch (Exception e) {
			fail("Should not have thrown an exception");
		}

		// balance should be 1
		assertEquals(1, this.mySavingAccount.balance(), 0.001);
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
		assertEquals(40, this.mycheckingAccount.balance(), 0.001);

		//reset the fast cash amount
		this.mycheckingAccount.setFastcashAmount(20);
		try {
			this.mycheckingAccount.fastWithdraw();
			assertTrue(true);
		} catch (Exception e) {
			fail("Should not have thrown an exception");
		}

		// balance should be 20
		assertEquals(20, this.mycheckingAccount.balance(), 0.001);

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
		assertEquals(0, this.mycheckingAccount.balance(), 0.001);

		//expect exception with I try to make fast withdraw because of 0 balance
		assertThrows(Exception.class, () -> {
			this.mycheckingAccount.fastWithdraw();
		});
	}
}
