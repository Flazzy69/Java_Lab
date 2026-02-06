import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            if (n % 3 == 0)
                System.out.println("even & divisible by 3");
            else
                System.out.println("even but not divisible by 3");
        } else {
            if (n % 3 == 0)
                System.out.println("odd & divisible by 3");
            else
                System.out.println("odd but not divisible by 3");
        }
    }
}