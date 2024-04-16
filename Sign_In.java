
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

public class Sign_In extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4, l5;
    JTextField tf1, tf2, tf3, tf4;
    JButton b;
    JDateChooser dateChooser;

    Sign_In() {

        setTitle("SignIn");

        l1 = new JLabel("Name:");
        l1.setFont(new Font("Raleway", Font.BOLD, 20));
        l1.setBounds(100, 130, 90, 30);
        add(l1);
        tf1 = new JTextField();
        tf1.setFont(new Font("Raleway", Font.BOLD, 14));
        tf1.setBounds(200, 140, 400, 30);
        add(tf1);

        l5 = new JLabel("Date of birth: ");
        l5.setFont(new Font("Raleway", Font.BOLD, 20));
        l5.setBounds(90, 230, 200, 30);
        add(l5);
        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(250, 230, 200, 30);
        add(dateChooser);

        b = new JButton("Next");
        b.setFont(new Font("Raleway", Font.BOLD, 14));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(620, 360, 80, 30);
        add(b);

        setLayout(null);
        b.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);
        setSize(800, 450);
        setLocation(300, 120);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        String name = tf1.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();

        try {
            if (ae.getSource() == b) {
                setVisible(false);
                new Transaction("").setVisible(true);

            } else {
                conn c = new conn();
                String q1 = "select * from signup values('" + name + "''" + dob + "')";
                c.s.executeUpdate(q1);
               }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Sign_In().setVisible(true);
    }
}
