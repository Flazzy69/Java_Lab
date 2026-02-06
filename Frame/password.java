import javax.swing.*;

public class password {
    JFrame k;
    JLabel l1, l2;
    JTextField t1;
    JPasswordField p1;
    JButton b1;

    public password() {
        k = new JFrame("Facebook");
        l1 = new JLabel("Username");
        l2 = new JLabel("Password");
        t1 = new JTextField(15);
        p1 = new JPasswordField(15);
        b1 = new JButton("Login");

        k.setSize(300, 300);
        k.setVisible(true);
        k.setDefaultCloseOperation(3);
        k.setLayout(null);
        l1.setBounds(20, 50, 100, 20);
        t1.setBounds(150, 50, 100, 20);
        l2.setBounds(20, 100, 100, 20);
        p1.setBounds(150, 100, 100, 20);
        b1.setBounds(150, 150, 80, 20);
        k.add(l1);
        k.add(l2);
        k.add(t1);
        k.add(p1);
        k.add(b1);
    }

    public static void main(String[] args) {
        new password();
    }

}
