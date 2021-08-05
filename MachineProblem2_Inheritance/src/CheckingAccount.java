/*Machine Problem 2
 * Nidhi Patel
 * Project description:- Banking application for only savings & checking accounts
 * Checking Account
 */
public class CheckingAccount extends Account {
	private double overdraftLimit;
	//constructor, takes in account number and sets the overdraft limit to 200
	public CheckingAccount(int num) {
		super(num);
		overdraftLimit = -200;	
	}
	@Override
	//checks if you have crossed your overdraft limit or not everytime you withdraw
	public void withdraw (double amt)
	{
		//if balance is less than or equal to 0 or greater than the overdraft limit(-200) you can borrow
		if(getBalance() <= 0 && getBalance() >= overdraftLimit)
		{
			super.withdraw(amt);
			System.out.println("Your account balance is IN OVERDRAFT, you can still borrow $" + (getBalance() + Math.abs(overdraftLimit)));
		}
		//if your balance is greater than 0 you don't need to borrow from overdraft while withdrawing.
		else if (getBalance() > 0 ){
			super.withdraw(amt);
			System.out.println("Your account balance is NOT IN OVERDRAFT.");
		}
		else {
			System.out.println("You have CROSSED YOUR OVERDRAFT LIMIT, you cannot withdraw anymore");
		}
	}
	//toString method
	public String toString()
	{
		return super.toString() + "," + " Overdraft Limit " + overdraftLimit;
	}
}
