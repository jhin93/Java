
/**
 * Represents a counter, with methods
 */
public class Counter {
	//instance variables
	
	/*
	 * Store internal count.
	 */
	int count;
	
	//methods
	/*
	 * Increment internal count
	 */
	public int increment() {
		this.count++;
		return this.count;
	}
	/*
	 * Decrement internal count
	 */
	public int decrement() {
		this.count--;
		return this.count;
	}
	
	/*
	 * Returns the current value of count
	 */
	public int getCount() {
		return this.count;
	}
	
	
}
