public class NullExceptionExample {
    public static void main(String[] args) {
        try {
            String name = null;   // null reference
            System.out.println(name.length()); // causes exception
        }
        catch (NullPointerException ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        finally {
            System.out.println("Program End");
        }
    }
}
