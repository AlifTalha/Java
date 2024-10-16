import java.lang.*;
public class Box{
	public double Height;
	public double Length;
	public double Width;
	
	public void setHeight(double h)
	{
		Height=h;
	}
	public void setLength(double l)
	{
		Length=l;
	}
	public void setWidth(double w)
	{
		Width=w;
	}
	
	public double getHeight()
	{
		return Height;
	}
	public double getLength()
	{
		return Length;
	}
	public double getWidth()
	{
		return Width;
	}
	public static void main(String args[])
	{
	    Box ob = new Box();
		Box ob1 = new Box();
		Box ob2 = new Box();
		ob.setHeight(5.22);
		ob1.setLength(6.22);
		ob2.setWidth(7.22);
		System.out.println("Height is :"+ob.getHeight());
		System.out.println("Length is :"+ob1.getLength());
		System.out.println("Width  is :"+ob2.getWidth());
	}
}
		
	
	
	
	
	
	
	
	
	
	
