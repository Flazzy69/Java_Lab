import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter current balance: ");
            double balance = input.nextDouble();

            System.out.print("Enter amount to withdraw: ");
            double amount = input.nextDouble();

            if (amount > balance) {
                throw new Exception("Insufficient Balance! Withdrawal failed.");
            } else {
                balance -= amount;
                System.out.println("Withdrawal successful. Remaining Balance: " + balance);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            input.close();
        }
    }
}