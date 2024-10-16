import java.lang.*;
public class Customer{
	private String phoneNumber;
	private Account account;
	public Customer()
	{
		System.out.println("Empty customer");
	}
	public Customer(String phoneNumber,Account account)
	{
		this.phoneNumber=phoneNumber;
		this.account=account;
		System.out.println("para Customer");
	}
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber=phoneNumber;
	}
	public void setAccount(Account account)
	{
		this.account=account;
	}
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	public Account getAccount()
	{
		return account;
	}
	public void showDetails()
	{
		account.showDetails();
		System.out.println("customer Phone number is :"+phoneNumber);
	}
}