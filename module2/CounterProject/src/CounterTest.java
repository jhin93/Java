import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

class CounterTest {

	Counter counter;//declare Counter for testing
	
	@Before
	void setUp() throws Exception {
		this.counter = new Counter(); // initialize counter before every test method
	}

	@Test
	void testIncrement() {
		//calling increment the first time should return 1
		assertTrue(counter.increment() == 1);
		//calling increment the second time should return 2
		assertTrue(counter.increment() == 2);

		// call increment third time
		this.counter.increment();

		// calling increment a third time should not return a count of 2
		assertFalse("should not return 2 after calling increment a third time", counter.getCount() == 2);
		// expect 3 when calling getCount
		assertEquals(3, this.counter.getCount());
		// expect 4 when calling increment a fourth time
		assertNotEquals(3, this.counter.increment());
	}

	@Test
	void testDecrement() {
		// calling decrement the first time should return -1
		assertEquals(-1, this.counter.decrement());

		// calling decrement a second time should return -2
		assertTrue(this.counter.decrement() == -2);

		// calling decrement a third time should not return a count of -1
		this.counter.decrement();
		
	}

}
