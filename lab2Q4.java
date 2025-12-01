import java.util.Scanner;

public class lab2Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1, m2, m3, m4, m5;

        System.out.println("Enter marks of 5 subjects:");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        m4 = sc.nextInt();
        m5 = sc.nextInt();

        int total = m1 + m2 + m3 + m4 + m5;
        double average = total / 5.0;

        System.out.println("Total Marks = " + total);
        System.out.println("Average Marks = " + average);
    }
}