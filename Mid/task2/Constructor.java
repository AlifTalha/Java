import java.lang.*;
public class Constructor{
	public int accountNumber;
	public String accountName;
	public double balance;
	
	public Constructor()
	{
		System.out.println("This is empty constructor");
	}
	public Constructor(int accountNumber, String accountName,double balance)
	{
	  this.accountNumber=accountNumber;
	  this.accountName=accountName;
	  this.balance=balance;
	  System.out.println("This is parameterized constructor");
	}
	
	public void showDisplay()
   {
        System.out.println("Account Number is : "+accountNumber);
		System.out.println("Account Name is   : "+accountName);
		System.out.println("Balance is        : "+balance);
   }   
	
	public static void main(String[] args){
		Constructor obj = new Constructor();
		Constructor obj1 = new Constructor(1111,"XXXXX",111111.00);
		obj.showDisplay();
		obj1.showDisplay();
		
	}
}
		