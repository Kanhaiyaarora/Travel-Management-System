package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener {

    JButton back;

    About() {
        setBounds(600, 200, 500, 550);
        setLayout(null);
        getContentPane().setBackground(Color.white);

        JLabel text = new JLabel("ABOUT");
        text.setBounds(200, 10, 300, 25);
        text.setForeground(Color.red);
        text.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(text);

        String s = "                                            About Project           \n"
                + " \n"
                + "The Objective of the Travel and Tourism Management System Project is to develop a System that automates the processes and activities of a travel and the purpose is to design a system using which one can perform all the operations related to traveling. \n"
                + " \n"
                + "This application will help in accessing the information related to the Travel to the particular destinations with great ease. The users can track the information related to their tours with great ease through this application. The travel agency information can also be obtained through this application \n"
                + " \n"
                + "                                           Advantages of Project :\n"
                + " \n"
                + "Gives Accurate Information \n"
                + "Simplifies the MANUAL work\n"
                + "It minimizes the documentation related work \n"
                + "Provides up to date information \n"
                + "User Friendly Environment by providing warning messages. \n"
                + "Travelers details can be provided \n"
                + "Booking confirmation notification ";

        TextArea area = new TextArea(s, 10, 40, Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(20, 100, 450, 300);
        add(area);

        back = new JButton("Back");
        back.setBounds(20, 430, 100, 25);
        back.setForeground(Color.white);
        back.setBackground(Color.black);
        back.addActionListener(this);
        add(back);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
    }

    public static void main(String[] args) {
        new About();

    }
}
