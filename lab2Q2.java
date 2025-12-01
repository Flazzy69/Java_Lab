import java.util.Scanner;
public class lab2Q2
{
	public static void main(String []args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Swap with variable:");
	System.out.println("Enter two numbers:");
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("Values before swap");
	System.out.println("a="+a);
	System.out.println("b="+b);
	int x=a;
	int y=b;
	int c=a;
	a=b;
	b=c;
	System.out.println("Values after swap");
	System.out.println("a="+a);
 	System.out.println("b="+b);
	System.out.println("Swap without variable:");
	System.out.println("Values before swap");
	System.out.println("x="+x);
	System.out.println("y="+y);
	x=x+y;
	y=x-y;
	x=x-y;
	System.out.println("Values after swap:");
	System.out.println("x="+x);
	System.out.println("y="+y);
	}
}