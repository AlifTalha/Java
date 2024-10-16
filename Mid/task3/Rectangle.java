import java.lang.*;

public class Rectangle extends Shape
{
	
	double y;
	public Rectangle()
	{
		System.out.println("This is empty for Rectangle");
	}
	public Rectangle(double x, double y)
	{
		super(x);
		System.out.println("This is parameterized for Rectangle");
		this.y = y;
	}

	public void setY(double y)
	{
		this.y = y;
	}
	public double getY()
	{
		return y;
	}
	public double getArea()
	{
		return x*y;     // method overrride
	}
	
 
}