public class TypeCast
{

 public static void main(String[] args)
{
byte b = 120;
short s= 1330;
int i = 10; char c = 'c'; long l = 284712894; float fl = 0.34f; double d = 83.98;
s=b;
System.out.println("The value of b is : "+b);
System.out.println("The value of type casted short is : "+s);
System.out.println("The value of long is : "+l);
l = s;
System.out.println("The value of long is : "+l);
System.out.println("The value of short is : "+s);
System.out.println("The value of type casted to long is : "+l);

l = i;
System.out.println("The value of integer is : "+i);
System.out.println("The value of type casted to long is : "+l);

System.out.println("The explicit typecasting");
byte b1;
short s1= 120;
b1=(byte)s1;
System.out.println("The value of short is : "+s1);
System.out.println("The value of type casted byte is : "+b1);

i = (int) fl;
System.out.println("The value of float is : "+fl);
System.out.println("The value of type casted integer is : "+i);

fl = (float) i;

System.out.println("The value of long is : "+l);
i = (int) l;
System.out.println("The value of long is : "+l);
System.out.println("The value of type casted integer is : "+i);
}
}