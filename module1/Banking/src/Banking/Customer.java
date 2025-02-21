package Banking;

/*
 * Represents a customer of the bank
 */

public class Customer {

    //instance variables
    /*
     * Name of the customer
     */
    String name;
    
    /*
     * Address of the customer
     */
    String address;

    // constructor
    /*
     * Creates a customer with the given name.
     * @param name the name of the customer
     */
    public Customer(String name) {
        //sets instance var name to given name
        this.name = name;   
    }   

    //methods
    /*
     * Sets the address of the customer to be given address
     * @param address the address of the customer
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /*
     * Returns the name of the customer
     */
    public String getName() {
        return this.name;
    }

    /*
     * Returns the address of the customer
     */
    public String getAddress() {
        return this.address;
    }
    
    
}
