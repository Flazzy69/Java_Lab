import javax.swing.*;
import java.awt.*;

public class borderex {
    JFrame f;
    JButton b1, b2, b3, b4,b5;

    public borderex() {
        f = new JFrame("BorderLayout");
        b1 = new JButton("EAST");
        b2 = new JButton("WEST");
        b3 = new JButton("NORTH");
        b4 = new JButton("SOUTH");
        b5 = new JButton("CENTER");

        f.setSize(300, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setLayout(new BorderLayout());
        f.add(b1,BorderLayout.EAST);
        f.add(b2,BorderLayout.WEST);
        f.add(b3,BorderLayout.NORTH);
        f.add(b4,BorderLayout.SOUTH);
        f.add(b5,BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new borderex();
    }
}
