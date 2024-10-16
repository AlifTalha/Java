import java.lang.*;
public class Demo
{
	public static void main(String[] args)
	{
		Parent obj=new Parent();
		obj.setA(10);
		System.out.println(obj.getA());
		
		System.out.println();
		System.out.println();
		Child1 c1=new Child1();
		c1.setA(30);
		System.out.println(c1.getA());
		Child1 c2=new Child2();
		c2.setA(40);
		System.out.println(c2.getA());
		Child2 c3=new Child2();
		c3.setA(50);
		System.out.println(c3.getA());
		
	}
}
		