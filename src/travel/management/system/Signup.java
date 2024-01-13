package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Signup extends JFrame implements ActionListener {

    JButton back, create;
    JTextField tfusername, tfname, tfpassword, tfanswer;
    Choice security;

    Signup() {
        setBounds(350, 200, 900, 360); //setBounds = setSize + setLocation
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(133, 193, 233));
        p1.setBounds(0, 0, 500, 400);
        p1.setLayout(null);
        add(p1);

        // Username 
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(50, 20, 125, 25);
        lblusername.setFont(new Font("Tahoma", Font.BOLD, 14));
        p1.add(lblusername);

        tfusername = new JTextField();
        tfusername.setBounds(200, 20, 220, 25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);

        // name 
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(50, 60, 125, 25);
        lblname.setFont(new Font("Tahoma", Font.BOLD, 14));
        p1.add(lblname);

        tfname = new JTextField();
        tfname.setBounds(200, 60, 220, 25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);

        // Password 
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(50, 100, 125, 25);
        lblpassword.setFont(new Font("Tahoma", Font.BOLD, 14));
        p1.add(lblpassword);

        tfpassword = new JTextField();
        tfpassword.setBounds(200, 100, 220, 25);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpassword);

        // Security Question
        JLabel lblsecurity = new JLabel("Security Question");
        lblsecurity.setBounds(50, 140, 130, 25);
        lblsecurity.setFont(new Font("Tahoma", Font.BOLD, 14));
        p1.add(lblsecurity);

        security = new Choice();
        security.add("Your best friend nickname");
        security.add("Your favourite song name");
        security.add("Your favourite food ");
        security.add("Your favourite place");
        security.setBounds(200, 140, 220, 35);
        p1.add(security);

        // Answer 
        JLabel lblanswer = new JLabel("Answer");
        lblanswer.setBounds(50, 180, 125, 25);
        lblanswer.setFont(new Font("Tahoma", Font.BOLD, 14));
        p1.add(lblanswer);

        tfanswer = new JTextField();
        tfanswer.setBounds(200, 180, 220, 25);
        tfanswer.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfanswer);
//                                  ##### BUTTON   ######################
        // back button
        back = new JButton("Back");
        back.setBounds(80, 250, 100, 30);
        back.setForeground(Color.black); // new Color(133,193,233)
        back.setFont(new Font("Tahoma", Font.BOLD, 14));
        back.setBackground(Color.white);
        back.addActionListener(this);
        p1.add(back);

        // create button
        create = new JButton("Create");
        create.setBounds(250, 250, 100, 30);
        create.setForeground(Color.black); // new Color(133,193,233)
        create.setFont(new Font("Tahoma", Font.BOLD, 14));
        create.setBackground(Color.white);
        create.addActionListener(this);
        p1.add(create);

        // Image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
        Image i2 = i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(580, 50, 250, 250);
        add(image);

        setVisible(true); // frame visibility
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == create) {
            String username = tfusername.getText();
            String name = tfname.getText();
            String password = tfpassword.getText();
            String question = security.getSelectedItem();
            String answer = tfanswer.getText();

            String query = "insert into account values('" + username + "', '" + name + "','" + password + "', '" + question + "', '" + answer + "')";
            try {
                Conn c = new Conn();
                c.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Account Created Successfully");

                setVisible(false);
                new Login();
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ae.getSource() == back) {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Signup();

    }

}
