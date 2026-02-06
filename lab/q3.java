public class q3 {
    public static void main(String[] args) {
        String str = "Hello Java World";

        // a. Character extraction
        System.out.println("Char at index 1: " + str.charAt(1));
        char[] charArray = str.toCharArray();
        
        // b. Comparison
        String s2 = "hello java world";
        System.out.println("Equals: " + str.equals(s2));
        System.out.println("Equals Ignore Case: " + str.equalsIgnoreCase(s2));
        System.out.println("Compare To: " + str.compareTo(s2));

        // c. Modifying
        System.out.println("Substring: " + str.substring(6, 10));
        System.out.println("Concat: " + str.concat("!"));
        System.out.println("Replace: " + str.replace("Java", "Coding"));
    }
}
