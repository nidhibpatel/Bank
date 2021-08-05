/*Machine Problem 2
 * Nidhi Patel
 * Project description:- Banking application for only savings & checking accounts
 * Bank class
 */
import java.util.*;

public class Bank {

	public static void main(String[] args) {
		//create array list of accounts (empty at first)
		ArrayList<Account> accounts = new ArrayList<Account>();
		//create a test account
		Account a = new Account(123456);
		//gets the account number, but doesnt do anything with it
		a.getAccountNum();
		//prints the account info (toString runs here)
		System.out.println(a);
		//create a savings test account
		SavingAccount SA = new SavingAccount(1);
		SA.deposit(100); //passing 100 dollars to deposit method of SavingAccount class
		SA.addInterest(); //calling the interest method 
		//create a checking test account
		CheckingAccount CA = new CheckingAccount(2);
		CA.withdraw(1); //Withdrawing 1 dollar  
		
		//storing the accounts in the arraylist
		accounts.add(CA);
		accounts.add(SA);
		//calls the update method
		update(accounts);
		
	}
	//update method goes through the accounts and calls on the 2 methods
	public static void update(ArrayList<Account> accounts)
	{
		//for each goes through the accounts 
		for(Account account : accounts)
		{ 
			//checks for savings 
			if(account instanceof SavingAccount)
			{
				//since it is saving, we add interest, then check new balance
				((SavingAccount) account).addInterest();
				System.out.println(account);
			}
			//checks for checking 
			else if(account instanceof CheckingAccount) {
				//since it is checking we withdraw money which checks overdraft limit
				((CheckingAccount) account).withdraw(100);
				System.out.println(account);	
			}
		}
			
	}
}
