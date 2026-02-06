import javax.swing.*;

public class si {
    JFrame k;
    JLabel l1, l2, l3;
    JTextField t1,t2,t3;
    JButton b1;

    public si() {
        k = new JFrame("SICalculator");
        l1 = new JLabel("Principle");
        l2 = new JLabel("Rate");
        l3 = new JLabel("Time");
        t1 = new JTextField(15);
        t2 = new JTextField(15);
        t3 = new JTextField(15);
        b1 = new JButton("Intrest");

        k.setSize(300, 300);
        k.setVisible(true);
        k.setDefaultCloseOperation(3);
        k.setLayout(null);
        l1.setBounds(20, 50, 100, 20);
        t1.setBounds(150, 50, 100, 20);
        l2.setBounds(20, 100, 100, 20);
        t2.setBounds(150, 100, 100, 20);
        l3.setBounds(20, 150, 100, 20);
        t3.setBounds(150, 150, 100, 20);
        b1.setBounds(150, 200, 80, 20);
        k.add(l1);
        k.add(l2);
        k.add(l3);
        k.add(t1);
        k.add(t2);
        k.add(t3);
        k.add(b1);
    }

    public static void main(String[] args) {
        new si();
    }

}