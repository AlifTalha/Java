import java.lang.*;

public class Square extends Shape
{
	public Square()
	{
		System.out.println("This is empty for Square");
	}
	public Square(double x)
	{
		super(x);
		System.out.println("This is parameterized for Square");
	}
	public double getArea()
	{
		return x*x;   // method override 
	}
	



}