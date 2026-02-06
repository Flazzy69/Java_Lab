import java.io.*;
public class FileReadWrite {
    public static void main(String[] args) {

        try {
            FileWriter fw = new FileWriter("javacutie.txt");
            fw.write("Happy birthday to you java sir");
            fw.close();

            System.out.println("Data written to file successfully.");
            
            FileReader fr = new FileReader("javacutie.txt");
            int ch;

            System.out.println("Reading data from file:");
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            fr.close();

        } catch (IOException e) {
            System.out.println("Error occurred.");
        }
    }
}