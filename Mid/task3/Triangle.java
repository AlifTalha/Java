import java.lang.*;

public class Triangle extends Shape
{

	double y;
	public Triangle()
	{
		System.out.println("This is empty for Triangle");
	}
	public Triangle(double x, double y)
	{
		super(x);
		System.out.println("This is parameterized for Triangle");
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
		return 0.5*x*y;
	}


}
