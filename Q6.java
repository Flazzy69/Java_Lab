
import  java.util.Scanner;
public class Q6
{
   public static void main(String[] args)
  {
     Scanner sc= new Scanner (System.in);
System.out.println("Enter any three number"); 
 int n1=sc.nextInt();
int n2=sc.nextInt();
int n3=sc.nextInt();

if (n1>n2)
{
if (n2>n3)
   System.out.println(n3+" is Smallest");
else
  System.out.println(n2+" is Smallest");
}
else 
{
if (n1>n3)
    System.out.println(n3+" is smallest");
else
   System.out.println(n1+" is smallest");
    }
  }
}