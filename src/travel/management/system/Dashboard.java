package travel.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import java.sql.*;

public class Dashboard extends JFrame implements ActionListener {

    String username;
    JButton addPersonalDetails, viewPersonalDetails, updatePersonalDetails, checkPackages, bookPackage, viewPackage;
    JButton viewHotels, destinations, bookHotel, viewBookedHotel, payments, calculator, notepad,about,deletePersonalDetails;

    Dashboard(String username) {
        this.username = username;
//    setBounds(0,0,1600,1000);
        setExtendedState(JFrame.MAXIMIZED_BOTH);//screen sized frame
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setLayout(null);
//    p1.setBackground(new Color(0,0,102));
        p1.setBackground(new Color(133, 193, 233));
        p1.setBounds(0, 0, 1600, 65);
        add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5, 0, 70, 70);
        p1.add(icon);

        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(80, 10, 300, 40);
        heading.setForeground(Color.white);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        p1.add(heading);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
//    p1.setBackground(new Color(0,0,102));
        p2.setBackground(new Color(133, 193, 233));
        p2.setBounds(0, 65, 300, 800);
        add(p2);

        addPersonalDetails = new JButton("Add Personal Details");
        addPersonalDetails.setBounds(0, 0, 300, 50);
        addPersonalDetails.setForeground(Color.black);
        addPersonalDetails.setBackground(new Color(133, 193, 233));
        addPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        addPersonalDetails.setMargin(new Insets(0, 0, 0, 60));
        addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);

        updatePersonalDetails = new JButton("Update Personal Details");
        updatePersonalDetails.setBounds(0, 50, 300, 50);
        updatePersonalDetails.setForeground(Color.black);
        updatePersonalDetails.setBackground(new Color(133, 193, 233));
        updatePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        updatePersonalDetails.setMargin(new Insets(0, 0, 0, 30));
        updatePersonalDetails.addActionListener(this);
        p2.add(updatePersonalDetails);

        viewPersonalDetails = new JButton("View Personal Details");
        viewPersonalDetails.setBounds(0, 100, 300, 50);
        viewPersonalDetails.setForeground(Color.black);
        viewPersonalDetails.setBackground(new Color(133, 193, 233));
        viewPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewPersonalDetails.setMargin(new Insets(0, 0, 0, 50));
        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);

        deletePersonalDetails = new JButton("Delete Personal Details");
        deletePersonalDetails.setBounds(0, 150, 300, 50);
        deletePersonalDetails.setForeground(Color.black);
        deletePersonalDetails.setBackground(new Color(133, 193, 233));
        deletePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        deletePersonalDetails.setMargin(new Insets(0, 0, 0, 40));
        deletePersonalDetails.addActionListener(this);
        p2.add(deletePersonalDetails);

        checkPackages = new JButton("Check Packages");
        checkPackages.setBounds(0, 200, 300, 50);
        checkPackages.setForeground(Color.black);
        checkPackages.setBackground(new Color(133, 193, 233));
        checkPackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        checkPackages.setMargin(new Insets(0, 0, 0, 100));
        checkPackages.addActionListener(this);
        p2.add(checkPackages);

        bookPackage = new JButton("Book Package");
        bookPackage.setBounds(0, 250, 300, 50);
        bookPackage.setForeground(Color.black);
        bookPackage.setBackground(new Color(133, 193, 233));
        bookPackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookPackage.setMargin(new Insets(0, 0, 0, 120));
        bookPackage.addActionListener(this);
        p2.add(bookPackage);

        viewPackage = new JButton("View Package");
        viewPackage.setBounds(0, 300, 300, 50);
        viewPackage.setForeground(Color.black);
        viewPackage.setBackground(new Color(133, 193, 233));
        viewPackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewPackage.setMargin(new Insets(0, 0, 0, 120));
        viewPackage.addActionListener(this);
        p2.add(viewPackage);

        viewHotels = new JButton("View Hotels");
        viewHotels.setBounds(0, 350, 300, 50);
        viewHotels.setForeground(Color.black);
        viewHotels.setBackground(new Color(133, 193, 233));
        viewHotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewHotels.setMargin(new Insets(0, 0, 0, 130));
        viewHotels.addActionListener(this);
        p2.add(viewHotels);

        bookHotel = new JButton("Book Hotel");
        bookHotel.setBounds(0, 400, 300, 50);
        bookHotel.setForeground(Color.black);
        bookHotel.setBackground(new Color(133, 193, 233));
        bookHotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookHotel.setMargin(new Insets(0, 0, 0, 140));
        bookHotel.addActionListener(this);
        p2.add(bookHotel);

        viewBookedHotel = new JButton("View Booked Hotel");
        viewBookedHotel.setBounds(0, 450, 300, 50);
        viewBookedHotel.setForeground(Color.black);
        viewBookedHotel.setBackground(new Color(133, 193, 233));
        viewBookedHotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewBookedHotel.setMargin(new Insets(0, 0, 0, 75));
        viewBookedHotel.addActionListener(this);
        p2.add(viewBookedHotel);

        destinations = new JButton("Destinations");
        destinations.setBounds(0, 500, 300, 50);
        destinations.setForeground(Color.black);
        destinations.setBackground(new Color(133, 193, 233));
        destinations.setFont(new Font("Tahoma", Font.PLAIN, 20));
        destinations.setMargin(new Insets(0, 0, 0, 130));
        destinations.addActionListener(this);
        p2.add(destinations);

        payments = new JButton("Payments");
        payments.setBounds(0, 550, 300, 50);
        payments.setForeground(Color.black);
        payments.setBackground(new Color(133, 193, 233));
        payments.setFont(new Font("Tahoma", Font.PLAIN, 20));
        payments.setMargin(new Insets(0, 0, 0, 150));
        payments.addActionListener(this);
        p2.add(payments);

        calculator = new JButton("Calculator");
        calculator.setBounds(0, 600, 300, 50);
        calculator.setForeground(Color.black);
        calculator.setBackground(new Color(133, 193, 233));
        calculator.setFont(new Font("Tahoma", Font.PLAIN, 20));
        calculator.setMargin(new Insets(0, 0, 0, 145));
        calculator.addActionListener(this);
        p2.add(calculator);

        notepad = new JButton("Notepad");
        notepad.setBounds(0, 650, 300, 50);
        notepad.setForeground(Color.black);
        notepad.setBackground(new Color(133, 193, 233));
        notepad.setFont(new Font("Tahoma", Font.PLAIN, 20));
        notepad.setMargin(new Insets(0, 0, 0, 155));
        notepad.addActionListener(this);
        p2.add(notepad);

        about = new JButton("About");
        about.setBounds(0, 700, 300, 50);
        about.setForeground(Color.black);
        about.setBackground(new Color(133, 193, 233));
        about.setFont(new Font("Tahoma", Font.PLAIN, 20));
        about.setMargin(new Insets(0, 0, 0, 175));
        about.addActionListener(this);
        p2.add(about);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1300, 800, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(300, 65, 1300, 800);
        add(image);

        JLabel text = new JLabel("Travel and Tourism Management System");
        text.setBounds(130, 0, 1200, 70);
        text.setForeground(Color.white);
        text.setFont(new Font("Raleway", Font.BOLD, 50));
        image.add(text);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == addPersonalDetails) {
//            setVisible(false);
            new AddCustomer(username);
        } else if (ae.getSource() == viewPersonalDetails) {
            new ViewCustomer(username);
        } else if (ae.getSource() == updatePersonalDetails) {
            new UpdateCustomer(username);
        } else if (ae.getSource() == checkPackages) {
            new CheckPackage();
        } else if (ae.getSource() == bookPackage) {
            new BookPackage(username);
        } else if (ae.getSource() == viewPackage) {
            new ViewPackage(username);
        } else if (ae.getSource() == viewHotels) {
            new CheckHotels();
        } else if (ae.getSource() == destinations) {
            new Destinations();
        } else if (ae.getSource() == bookHotel) {
            new BookHotel(username);
        } else if (ae.getSource() == viewBookedHotel) {
            new ViewBookedHotel(username);
        } else if (ae.getSource() == payments) {
            new Payment();
        } else if (ae.getSource() == calculator) {
            try {
                Runtime.getRuntime().exec("calc.exe");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else if (ae.getSource() == notepad) {
            try {
                Runtime.getRuntime().exec("notepad.exe");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else if (ae.getSource() == about) {
            new About();
        }else if(ae.getSource()== deletePersonalDetails){
    new DeleteDetails(username);
    }
        
    }

    public static void main(String args[]) {
        new Dashboard("kanhaiya");
    }

}
