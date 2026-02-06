class Shapes
{
	public double Area(double l)
{
	double a = l*l*l*l;
}
	public double add (double x, double y)
{
	return x + y;
}
	public double Area(double r)
{
	double a= 3.14*r*r;
}


public class Myshapes
{
public static void main (String [] args)
{
	Area ad= new Area();
	double r1=ad.add(5,6);
	double r2=ad.add(5,6,7);
	double r3=ad.add(5,6,7);
	System.out.println("Sum of two doubler="+r1);
	System.out.println("Sum of three doubler="+r2);
	System.out.println("Sum of two double="+r3);
}
}