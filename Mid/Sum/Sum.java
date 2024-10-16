import java.util.Scanner;
public class Sum{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int num1,num2;
		double result;
		System.out.print("Enter 1st number :");
		num1=input.nextInt();
		System.out.print("Enter 2nd number :");
		num2=input.nextInt();
		
		result=num1+num2;
		System.out.println("Sum is :"+result);
		result=num1-num2;
		System.out.println("Sub is :"+result);
		result=num1*num2;
		System.out.println("mul is :"+result);
		result=(double)num1/num2;
		System.out.println("div is :"+result);
		result=num1%num2;
		System.out.println("rem is :"+result);
	}
}
		