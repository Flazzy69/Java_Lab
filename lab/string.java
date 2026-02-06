public class string {
    public static void main(String[] args) {
        String str = "Kshitiz";

        System.out.println("Using charAt():");
        System.out.println("Character at index 2: " + str.charAt(2));

        System.out.println("\nUsing getChars():");
        char[] ch = new char[7];
        str.getChars(0, 7, ch, 0);
        System.out.println(ch);

        System.out.println("\nUsing toCharArray():");
        char[] arr = str.toCharArray();
        for (char c : arr) {
            System.out.print(c + " ");
        }
    }
}
