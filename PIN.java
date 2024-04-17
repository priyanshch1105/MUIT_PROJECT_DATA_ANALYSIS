
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class PIN extends JFrame implements ActionListener{

    JPasswordField passwordField1,passwordField2;
    JButton b1,b2;
    JLabel l1,l2,l3,l4;
    String pin;
    PIN(String pin){
        this.pin = pin;

        l1 = new JLabel("CHANGE YOUR PIN");
        l1.setFont(new Font("System", Font.BOLD, 16));
        l1.setForeground(Color.BLACK);

        l2 = new JLabel("New PIN:");
        l2.setFont(new Font("System", Font.BOLD, 16));
        l2.setForeground(Color.BLACK);

        l3 = new JLabel("Re-Enter New PIN:");
        l3.setFont(new Font("System", Font.BOLD, 16));
        l3.setForeground(Color.BLACK);

        passwordField1 = new JPasswordField();
        passwordField1.setFont(new Font("Raleway", Font.BOLD, 25));

        passwordField2 = new JPasswordField();
        passwordField2.setFont(new Font("Raleway", Font.BOLD, 25));

        b1 = new JButton("CHANGE");
        b2 = new JButton("BACK");

        b1.addActionListener(this);
        b2.addActionListener(this);

        setLayout(null);

        l1.setBounds(280,330,800,35);
        add(l1);

        l2.setBounds(180,390,150,35);
        add(l2);

        l3.setBounds(180,440,200,35);
        add(l3);

        passwordField1.setBounds(350,390,180,25);
        add(passwordField1);

        passwordField2.setBounds(350,440,180,25);
        add(passwordField2);

        b1.setBounds(390,588,150,35);
        add(b1);

        b2.setBounds(390,633,150,35);
         add(b2);

        setSize(960,1080);
        setLocation(500,0);
        setUndecorated(true);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
        try{
            String npin = passwordField1.getText();
            String rpin = passwordField2.getText();

            if(!npin.equals(rpin)){
                JOptionPane.showMessageDialog(null, "Entered PIN does not match");
                return;
            }

            if(ae.getSource()==b1){
                if (passwordField1.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Enter New PIN");
                }
                if (passwordField2.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Re-Enter new PIN");
                }

                conn c = new conn();
                String q = "insert into pass values('"+npin+"','"+rpin+"')";
                c.s.executeUpdate(q);

                JOptionPane.showMessageDialog(null, "PIN changed successfully");
                setVisible(false);
                new Transaction(rpin).setVisible(true);

            }else if(ae.getSource()==b2){
                setVisible(false);
                new Transaction(pin).setVisible(true);

            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        new PIN("").setVisible(true);
    }
}
