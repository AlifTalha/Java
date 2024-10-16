import java.util.Scanner;
public class Loop{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	int x;
	int y;
	int sum=0;
	System.out.print("Enter x is :");
	x=input.nextInt();
	System.out.print("Enter y is :");
	y=input.nextInt();
	
	for(int i=x;i<=y;i++)
	{
     sum=sum+i;
	}
    System.out.print("Sum is :"+sum);
	}
}	
		