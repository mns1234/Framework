package Practice;

public class Account {

	public int accountNumber;
	public int accountBalance;
	
	public void withdraw(int amount)
	{
		accountBalance-=amount;
	}
	
	public void deposit(int amount){
		accountBalance+=amount;
	}
	
	public int getaccountBalance(){
		return accountBalance;
	}
	
	
	
	
}
