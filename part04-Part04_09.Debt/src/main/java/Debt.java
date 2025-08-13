/**
 * A class that simulates a debt with attributes {@code balance} 
 * and {@code interestRate} and methods {@code printBalance} and {@code waitOneYear}.
 * 
 * <p> Allows a year to pass and add interest with the {@code waitOneYear} method.
 * Print out the current balance of the debt with the {@code printBalance}
 * method.</p>
 * 
 * @author Adam McCarthy
 * @version 1.0
 */
public class Debt {
    /**
     * The current balance of the debt.
     */
    private double balance;
    /**
     * The interest charged on the debt.
     */
    private double interestRate;
    
    /**
     * Construct a Debt object.
     * 
     * @param initialBalance        the balance outstanding initially 
     * @param initialInterestRate   the interest rate initially
     */
    public Debt(double initialBalance, double initialInterestRate){
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    }
    
    /**
     * Simulate checking the outside balance of the debt.
     */
    public void printBalance() {
        System.out.println(this.balance);
    }
    
    /**
     * Simulate a year passing on the debt and the interest being added
     */
    public void waitOneYear(){
        this.balance *= interestRate;
    }
}
