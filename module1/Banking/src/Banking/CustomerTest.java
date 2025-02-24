package Banking;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomerTest {
	// declare customer for testing
	Customer customer;

	@BeforeEach
	void setUp() {
		this.customer = new Customer("Brandon");
	}

	@Test
	void testSetAddress() {
		// confirns the initial address is null
		assertNull(this.customer.getAddress()); // Address should be null before setting. No initialize address in constructor.

		// set address for customer
		this.customer.setAddress("Brooklyn, NY");

		//check that address aws set correctly
		assertEquals("Brooklyn, NY", this.customer.getAddress());

		//reset address for customer
		this.customer.setAddress("Cranston, RI");

		//check that address was reset correctly
		assertEquals("Cranston, RI", this.customer.getAddress());
	}

}
