import java.util.Scanner;
public class Prime{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int num;
		System.out.print("Enter any positive number :");
		num=input.nextInt();
		int count=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.print("Prime number");
		}
		else
		{
			System.out.print("Not prime number");
		}
	}
}
	