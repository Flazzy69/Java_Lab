class Adder
{
	public int add (int a, int b)
{
	return a + b;
}
	public int add (int a, int b, int c)
{
	return a + b + c;
}
	public double add (double x, double y)
{
	return x + y;
}
}


public class Methodoverloader
{
public static void main (String [] args)
{
	Adder ad= new Adder();
	int r1=ad.add(5,6);
	int r2=ad.add(5,6,7);
	double r3=ad.add(5,6,7);
	System.out.println("Sum of two integer="+r1);
	System.out.println("Sum of three integer="+r2);
	System.out.println("Sum of two double="+r3);
}
}