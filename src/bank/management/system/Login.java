
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    
    JButton login, signup, clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
    Login(){
        setTitle("Automated Teller Machine");
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank Icon.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i1);
        label.setBounds(70,10, 100,100);
        add(label);
        
        getContentPane().setBackground(Color.white);
        
        JLabel cardno = new JLabel("Welcome to ATM"); 
        cardno.setFont(new Font( "Osward", Font.BOLD, 38));
        cardno.setBounds(200, 40, 400, 40);
        add(cardno);
        
        JLabel Pin = new JLabel("Card No. : "); 
        Pin.setFont(new Font( "Raleway", Font.BOLD, 28));
        Pin.setBounds(200, 120, 400, 40);
        add(Pin);
        
        cardTextField = new JTextField();
        cardTextField.setBounds(350, 127, 230,30 );
        cardTextField.setFont(new Font("Arial", Font.BOLD,14));
        add(cardTextField);
        
        JLabel text = new JLabel("PIN:"); 
        text.setFont(new Font( "Raleway", Font.BOLD, 28));
        text.setBounds(200, 180, 400, 40);
        add(text);
        
        pinTextField = new JPasswordField();
        pinTextField.setBounds(350, 187, 230,30 );
        pinTextField.setFont(new Font("Arial", Font.BOLD,14));
        add(pinTextField);
        
        login = new JButton("SIGN IN");
        login.setBounds(350,250,100,30);
        login.setBackground(Color.cyan);
        login.setForeground(Color.BLACK);
        login.addActionListener(this);
        add(login);
        
         clear = new JButton("CLEAR");
        clear.setBounds(480,250,100,30);
        clear.setBackground(Color.cyan);
        clear.setForeground(Color.BLACK);
        clear.addActionListener(this);
        add(clear);
        
         signup = new JButton("Sign Up");
        signup.setBounds(418,300,100,30);
        signup.setBackground(Color.cyan);
        signup.setForeground(Color.BLACK);
        signup.addActionListener(this);
        add(signup);
        
        setSize(800,480);
        setVisible(true);
        setLocation(350,200);
    }
    
    public static void main(String args[]){
    new Login();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
           if (e.getSource() == clear ){
               cardTextField.setText("");
               pinTextField.setText("");
           }
           else if (e.getSource() == login){
               
           }
           else if (e.getSource() == signup){
               
           }
    }
}

