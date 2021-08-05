/*Machine Problem 2
 * Nidhi Patel
 * Project description:- Banking application for only savings & checking accounts
 *Savings Account
 */
public class SavingAccount extends Account {
	private double interestRate;
	private double interest;
	//constructor, takes in account number
	public SavingAccount(int num) 
	{
		super(num);
		interestRate = 2.5;
	}
	//this method adds 2.5% interest to the balance
	public void addInterest()
	{
		 interest = (interestRate/100)*getBalance(); 
		 deposit(interest);
	}
	//toString is used to print variables
	public String toString()
	{
		return super.toString()+ "," + " interest: " + interest;
	} 	
}
