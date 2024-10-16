import java.lang.*;
public class Account{
	public int accountNumber;
	public String accountName;
	public double balance;
	
	public void setaccountNumber(int accountNumber)
	{
	this.accountNumber=accountNumber;
	}
	public void setaccountName(String accountName)
	{
	this.accountName=accountName;
	}
	public void setBalance(double balance)
	{
	this.balance=balance;
	}
	
	public int getaccountNumber()
	{
		return accountNumber;
	}
	public String getaccountName()
	{
		return accountName;
	}
	public double getBlance()
	{
		return balance;
	}
	
	public static void main(String[] args){
		Account obj = new Account();
		obj.setaccountNumber(111111);
		obj.setaccountName("XXXXX");
		obj.setBalance(100000.00);
		
		System.out.println("Account Number is : "+obj.getaccountNumber());
		System.out.println("Account Name is   : "+obj.getaccountName());
		System.out.println("Balance is        : "+obj.getBlance());
	}
}
		