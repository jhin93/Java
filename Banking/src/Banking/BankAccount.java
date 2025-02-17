package Banking;
/*
 * Represents a checking/savings account for a customer
 */
public class BankAccount {
    //instance variables
    /*
     * Type of account(checking/savings)
     */

    String accountType;

    /*
     * Balance for bank account
     */
    double balance;

    /*
     * Customer for this accout.
     */
    Customer customer;

    // constructor
    /*
     * Creates a bank account with the given account type, balance, and customer.
     * @param accountType the type of account
     * @param customer the customer for this account
     */
    public BankAccount(String accountType, Customer customer) {
        this.accountType = accountType;
        this.customer = customer;
    }

    //methods
    /*
     * Deposits the given amount.
     */
    public void deposit(double amount) {
        this.balance += amount;
    }

    /*
     * Withdraws the given amount.
     */
    public void withdraw(double amount) throws Exception {
        if(amount > this.balance) {
            throw new Exception("Amount is greater than balance");
        }
        this.balance -= amount;
    }

    /*
     * Returns account type and balance for this bank accout.
     * @return string with all the info
     */
    public String getAccountInfo() {
        return this.accountType + ": " + this.balance;
    }

    /*
     * Returns customer name and address for this bank account.
     * @return string with all the info
     */
    public String getCustomerInfo() {
        return this.customer.getName() + " from " + this.customer.getAddress();
    }
    

}
