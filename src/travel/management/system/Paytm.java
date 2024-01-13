package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Paytm extends JFrame implements ActionListener {
JButton back;
    
    Paytm() {
        setBounds(500, 200, 800, 600);
        JEditorPane pane = new JEditorPane();
        pane.setEditable(false);

        try {
            pane.setPage("https://paytm.com/rent-payment");
        } catch (Exception e) {
            pane.setContentType("text/html");
            pane.setText("<html>Could Not Load, Please Connect to the Internet, error 404!</html>");
        }

        JScrollPane sp = new JScrollPane(pane);
        getContentPane().add(sp);
        
        back = new JButton("Back");
        back.setBounds(610, 20, 80, 40);
        back.setForeground(Color.white);
        back.setBackground(new Color(0,46,110));
        back.addActionListener(this);
        pane.add(back);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
    setVisible(false);
    new Payment();
    }
    
    public static void main(String[] args) {
        new Paytm();
    }
}
