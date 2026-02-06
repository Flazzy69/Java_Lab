import	java.util.Scanner;
public class lab4Q1
{
	public static void main(String[]args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter any number");
int num =sc.nextInt();
int sum=0;
int temp=num;
while(temp!=0){
int digit = temp % 10;
sum+= digit;
temp /=10;
}
System.out.println("Sum of digit = "+sum);
}
}