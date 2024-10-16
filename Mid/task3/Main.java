import java.lang.*;

public class Main
{
	public static void main(String []args)
	{
		Rectangle r1 = new Rectangle();
		r1.setX(9.98);
		r1.setY(6.98);

		System.out.println("The X of rectangle is: "+r1.getX());
		System.out.println("The Y of rectangle is: "+r1.getY());
		System.out.println("The area of rectangle is: "+r1.getArea());

		System.out.println("------------------------");

		Rectangle r2 = new Rectangle(5.63,2.97);
		System.out.println("The X of rectangle is: "+r2.getX());
		System.out.println("The Y of rectangle is: "+r2.getY());
		System.out.println("The area of rectangle is: "+r2.getArea());
		System.out.println("------------------------");

		Square s1 = new Square();
		s1.setX(12.35);
		System.out.println("The X of square is: "+s1.getX());
		System.out.println("The area of square is: "+s1.getArea());
		System.out.println("------------------------");

		Square s2 = new Square(5.68);
		System.out.println("The X of square is: "+s2.getX());
		System.out.println("The area of square is: "+s2.getArea());
		System.out.println("------------------------");


		Triangle t1= new Triangle(12.78,10.34);
		t1.setX(10.98);
		t1.setY(10.78);

		System.out.println("The X of triangle is: "+t1.getX());
		System.out.println("The Y of rectangle is: "+t1.getY());
		System.out.println("The area of rectangle is: "+t1.getArea());

		System.out.println("------------------------");

		Triangle t2 = new Triangle(10.67,9.67);
		System.out.println("The X of triangle is: "+t2.getX());
		System.out.println("The Y of triangle is: "+t2.getY());
		System.out.println("The area of triangle is: "+t2.getArea());
		System.out.println("------------------------");


		Circle c1 = new Circle();
		c1.setX(10.95);
		System.out.println("The X of circle is: "+c1.getX());
		System.out.println("The area of circle is: "+c1.getArea());
		System.out.println("------------------------");

		Circle c2 = new Circle(5.78);
		System.out.println("The X of circle is: "+c2.getX());
		System.out.println("The area of circle is: "+c2.getArea());
		System.out.println("------------------------");


	}
}

