import javax.swing.*;

public class f1 {
    JFrame k;
    JLabel l1, l2;
    JTextField t1, t2;
    JButton b1;

    public f1() {
        k = new JFrame("Calculator App");
        l1 = new JLabel("Form");
        l2 = new JLabel("Snum");
        t1 = new JTextField(15);
        t2 = new JTextField(15);
        b1 = new JButton("Add");

        k.setSize(300, 300);
        k.setVisible(true);
        k.setDefaultCloseOperation(3);
        k.setLayout(null);
        l1.setBounds(20, 50, 100, 20);
        t1.setBounds(150, 50, 100, 20);
        l2.setBounds(20, 100, 100, 20);
        t2.setBounds(150, 100, 100, 20);
        b1.setBounds(150, 150, 80, 20);
        k.add(l1);
        k.add(l2);
        k.add(t1);
        k.add(t2);
        k.add(b1);
    }

    public static void main(String[] args) {
        new f1();
    }

}
