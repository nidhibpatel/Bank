/*
 * Nidhi Patel
 * Project:- MachineProblem2
 * Project description:- Banking application for only savings & checking accounts
 * Account class
 */
public class Account {
	private double balance; //current balance
	private int acctNum; //The account number
	
	public Account (int num)
	{
		balance = 0.0;
		acctNum = num;
	}
	//deposit method adds the amt to the balance
	public void deposit(double amt)
	{
		//if amount is greater than 0 add it to the balance
		if (amt > 0.0)
		{
			balance = balance + amt;
		}
	}
	//withdraw method subtracts the amount from the balance
	public void withdraw (double amt)
	{
		//subtracts the amount from the balance
		if (amt > 0.0)
		{
			balance = balance - amt;
		}
	}
	//Returns the balance 
	public double getBalance()
	{
		return balance;
	}
	//Returns the account number
	public double getAccountNum()
	{
		return acctNum;
	}
	//toString method is used to print 
	public String toString()
	{
		
		return "Account Number: " + acctNum + ", "+ "Balance is: " + balance;
	}
	//print method actually prints
	public final void print()
	{
		System.out.println(toString());
	}
	
}
