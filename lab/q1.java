public class q1 {
    public static void main(String[] args) {
        try {
            int result = 50 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception: Division by zero is not allowed.");
        }

        try {
            int[] arr = {10, 20, 30};
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: Array index is out of bounds.");
        }

        try {
            String s = "ABC";
            int i = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("Exception: Cannot convert this string to an integer.");
        }
    }
}
