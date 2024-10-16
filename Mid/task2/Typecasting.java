import java.lang.*;
public class Typecasting{
	
	public 	byte b;
    public  short s;
    public  int i;
	public	char c;
	public	long l;
	public	float f; 
	public	double d;
	
	public static void main(String[] args)
	{
		Typecasting obj = new Typecasting();
		obj.b=2;
		obj.s=5;
		obj.i=1111;
		obj.c='t';
		obj.l=92L;
		obj.f=41.59F;
		obj.d=20.92D;
		
		System.out.println("----------------");
        System.out.println("*****Implicit type casting***** ");
        
		System.out.println();
		obj.i=obj.s;
		System.out.println("Short to Integer : " + obj.i);
		obj.i=obj.b;
		System.out.println("Byte to integer : " + obj.i);
		obj.l=obj.i;
		System.out.println("Integer to long : " + obj.l);
		 
		System.out.println("--------------");
		System.out.println("*****Explicit type casting***** ");
		System.out.println();
		obj.f=(float)obj.i;
		System.out.println("Integer to float : " + obj.f);
		
		obj.f=(float)obj.d;
		System.out.println("Double to float : " + obj.f);
		
		obj.i=(int)obj.l;
		System.out.println("Long to integer : " + obj.i);
		
		
		
	}
	
}
		
	 