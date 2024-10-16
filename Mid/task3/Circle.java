import java.lang.*;

public class Circle extends Shape
{
	public Circle()
	{
		System.out.println("This is empty for Circle");
	}
	public Circle(double x)
	{
		super(x);
		System.out.println("This is parameterized for Circle");
	}
	public double getArea()
	{
		return 3.1416*x*x;  
	}

}