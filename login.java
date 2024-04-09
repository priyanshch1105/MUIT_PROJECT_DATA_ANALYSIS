
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import java.sql.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class login extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l11;
    JTextField tf1;
    JPasswordField pf1;
    JButton b1, b2, b3;
    JFrame f1;

    login() {

        setTitle("Banking Managnement System");

        l1 = new JLabel("INDO BANK OF INDIA");
        l1.setFont(new Font("Osward", Font.BOLD, 38));
        l1.setBounds(230, 40, 450, 40);
        add(l1);

        b1 = new JButton("SIGN IN");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);

        b2 = new JButton("Sign Up");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);

        b3 = new JButton("Logout");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);

        setLayout(null);

        b1.setFont(new Font("Arial", Font.BOLD, 14));
        b1.setBounds(300, 300, 100, 30);
        add(b1);

        b2.setFont(new Font("Arial", Font.BOLD, 14));
        b2.setBounds(430, 300, 100, 30);
        add(b2);

        b3.setFont(new Font("Arial", Font.BOLD, 14));
        b3.setBounds(300, 350, 230, 30);
        add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);

        setSize(800, 480);
        setLocation(500, 200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == b1) {
                setVisible(false);
                new Sign_In().setVisible(true);
            } else if (ae.getSource() == b2) {
                setVisible(false);
                new Sign_up().setVisible(true);
            } else if (ae.getSource() == b3) {
                setVisible(false);
                new login().setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new login().setVisible(true);

    }
}
