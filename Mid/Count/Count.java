import java.util.Scanner;
public class Count{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int x,y;
		System.out.print("Enter x number :");
		x=input.nextInt();
		System.out.print("Enter y number :");
		y=input.nextInt();
		int count=0;
		for(int i=x;i<=y;i++)
		{
			for(int j=2;j<=i-1;i++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				System.out.print(i);
				count++;
			}
		}
}}
		