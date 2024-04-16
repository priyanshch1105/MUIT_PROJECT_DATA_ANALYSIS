
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.sql.*;
import java.io.*;
import javax.swing.*;

import com.toedter.calendar.JDateChooser;

public class Sign_up extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12;
    JTextField tf1, tf2, tf3, tf4, tf5, tf11;
    JButton b;
    JComboBox c1;
    JDateChooser dateChooser;
    JRadioButton r1, r2, r3, r4, r5, r6;

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = "" + Math.abs(first4);

    Sign_up() {

        setTitle("SignUp");
        //Using ToolKit image getImage to get the Image

        l1 = new JLabel("Application Form No.: " + first);
        l1.setFont(new Font("Raleway", Font.BOLD, 38));
        l1.setBounds(190, 20, 600, 40);
        add(l1);
        tf1 = new JTextField();
        tf1.setFont(new Font("Raleway", Font.BOLD, 14));
        tf1.setBounds(300, 130, 400, 30);
        add(tf1);

        // top of the page
        l2 = new JLabel("Page : Personal Details");
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        l2.setBounds(290, 80, 600, 30);
        add(l2);
        tf2 = new JTextField();
       tf2.setFont(new Font("Raleway", Font.BOLD, 14));
       tf2.setBounds(300, 180, 400, 30);
       add(tf2);

        // name of the customer who is new Register
        l3 = new JLabel("Name:");
        l3.setFont(new Font("Raleway", Font.BOLD, 20));
        l3.setBounds(90, 130, 90, 30);
        add(l3);
        tf3 = new JTextField(50);
        tf3.setFont(new Font("Raleway", Font.BOLD, 14));
        tf3.setBounds(300, 330, 400, 30);
        add(tf3);

        // father name of the customer
        l4 = new JLabel("Father's Name:");
        l4.setFont(new Font("Raleway", Font.BOLD, 20));
        l4.setBounds(90, 180, 180, 30);
        add(l4);
        tf4 = new JTextField();
        tf4.setFont(new Font("Raleway", Font.BOLD, 14));
        tf4.setBounds(300, 430, 400, 30);
        add(tf4);

        // dob of the customer
        l5 = new JLabel("Date of birth ");
        l5.setFont(new Font("Raleway", Font.BOLD, 20));
        l5.setBounds(90, 230, 200, 30);
        add(l5);
        tf5 = new JTextField();
        tf5.setFont(new Font("Osward", Font.BOLD, 14));
        tf5.setBounds(300, 490, 400, 30);
        add(tf5);
        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300, 240, 200, 30);
        add(dateChooser);

        // gender: male ya female
        l6 = new JLabel("Gender:");
        l6.setFont(new Font("Raleway", Font.BOLD, 20));
        l6.setBounds(90, 280, 200, 30);
        add(l6);
        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(Color.WHITE);
        r1.setBounds(300, 290, 60, 30);
        add(r1);
        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(Color.WHITE);
        r2.setBounds(450, 290, 90, 30);
        add(r2);
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(r1);
        gendergroup.add(r2);

        l7 = new JLabel("Email Address:");
        l7.setFont(new Font("Raleway", Font.BOLD, 20));
        l7.setBounds(90, 330, 200, 30);
        add(l7);

        // martial Status
        l8 = new JLabel("Martial Status:");
        l8.setFont(new Font("Raleway", Font.BOLD, 20));
        l8.setBounds(90, 380, 200, 30);
        add(l8);
        r3 = new JRadioButton("Married");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBackground(Color.WHITE);
        r3.setBounds(300, 390, 100, 30);
        add(r3);
        r4 = new JRadioButton("Unmarried");
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        r4.setBackground(Color.WHITE);
        r4.setBounds(450, 390, 100, 30);
        add(r4);
        r5 = new JRadioButton("Other");
        r5.setFont(new Font("Raleway", Font.BOLD, 14));
        r5.setBackground(Color.WHITE);
        r5.setBounds(635, 390, 100, 30);
        add(r5);
        ButtonGroup maritialgroup = new ButtonGroup();
        maritialgroup.add(r3);
        maritialgroup.add(r4);
        maritialgroup.add(r5);

        l9 = new JLabel("Address:");
        l9.setFont(new Font("Raleway", Font.BOLD, 20));
        l9.setBounds(90, 430, 200, 30);
        add(l9);

        l10 = new JLabel("City:");
        l10.setFont(new Font("Raleway", Font.BOLD, 20));
        l10.setBounds(90, 490, 180, 30);
        add(l10);

        l11 = new JLabel("Pin Code:");
        l11.setFont(new Font("Raleway", Font.BOLD, 20));
        l11.setBounds(90, 530, 180, 30);
        add(l11);
        tf11 = new JTextField();
        tf11.setFont(new Font("Raleway", Font.BOLD, 14));
        tf11.setBounds(300, 530, 400, 30);
        add(tf11);

        l12 = new JLabel("State:");
        l12.setFont(new Font("Raleway", Font.BOLD, 20));
        l12.setBounds(90, 580, 180, 30);
        add(l12);
        String[] state = { " Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat",
                "Haryana", "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand", "Karnataka", "Kerala",
                "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Orissa", "Punjab",
                "Rajasthan", "Sikkim", "Tamil Nadu", "Tripura", "Uttarakhand", "Uttar Pradesh", "West Bengal",
                "Tamil Nadu", "Tripura", "Andaman and Nicobar Islands", "Chandigarh", "Dadra and Nagar Haveli",
                "Daman and Diu", "Delhi", "Lakshadweep", "Pondicherry" };
        c1 = new JComboBox(state);
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 14));
        c1.setBounds(300, 580, 320, 30);
        add(c1);

        b = new JButton("Next");
        b.setFont(new Font("Raleway", Font.BOLD, 14));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(620, 660, 80, 30);
        add(b);

        b.addActionListener(this);

        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        setSize(800, 850);
        setLocation(300, 10);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String formno = first;
        String Name = tf1.getText();
        String fname = tf2.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        }else if (r2.isSelected()){
            gender = "Female";
        }
        String email = tf3.getText();
        String marital =null;
        if (r3.isSelected()){
            marital = "Married";
        } else if (r4.isSelected()) {
            marital = "Unmarried";
        } else if (r5.isSelected()) {
            marital = "Other";
        }

        String address = tf4.getText();
        String city = tf5.getText();
        String pincode = tf11.getText();
        String state = (String)c1.getSelectedItem();

        try{
            if(ae.getSource()==b) {
                setVisible(false);
                new Sign_Up2("").setVisible(true);

                if (tf3.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Fill all the fields");
                }
                else {
                    conn c1 = new conn();
                    String q = "insert into signup values('" + formno + "', '" + Name + "','" + fname + "','" + dob + "','" + gender + "','" + email + "','" + marital + "', '" + address + "', '" + city + "','" + pincode + "','" + state + "' )";
                    c1.s.executeUpdate(q);


                }
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {

        new Sign_up().setVisible(true);
    }

}
