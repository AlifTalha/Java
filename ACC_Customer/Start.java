import java.lang.*;
public class Start{
	public static void main(String[] args)
	{
		
		Account ac=new Account();
		Customer cs=new Customer();
		
		ac.setAccountHolderName("talha");
		ac.setAccountNumber(121111);
		ac.setBalance(200000.00);
		cs.setPhoneNumber("1113215");
		System.out.println("********************");
		
		System.out.println("Customer PhnNumber: "+cs.getPhoneNumber());
		ac.showDetails();
		Account ac1=new Account(14110,"AAAA",2000.00);
		Customer cs1=new Customer("11521",ac1);
		System.out.println("Customer PhnNumber: "+cs1.getPhoneNumber());
        System.out.println("Customer Account Number: "+cs1.getAccount().getAccountNumber());
        System.out.println("Customer Account Holder Name: "+cs1.getAccount().getAccountHolderName());
        System.out.println("Customer Balance: "+cs1.getAccount().getBalance());
		
		
		
	}
}