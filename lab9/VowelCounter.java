import java.io.*;

public class VowelCounter {
    public static void main(String[] args) {
        String data = "Java is Object oriented programming";
        String file = "test.txt";

        try {
            FileOutputStream fos = new FileOutputStream(file);
            for (int k = 0; k < data.length(); k++) {
                char c = data.charAt(k);
                fos.write(c);
            }
            fos.close();

            FileInputStream fis1 = new FileInputStream(file);
            int i;
            while ((i = fis1.read()) != -1) {
                System.out.print((char) i);
            }
            fis1.close();
            System.out.println();

            FileInputStream fis2 = new FileInputStream(file);
            int count = 0;
            int j;
            while ((j = fis2.read()) != -1) {
                char ch = (char) j;
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    count++;
                }
            }
            fis2.close();

            System.out.println("Total number of vowels: " + count);

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
