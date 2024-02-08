package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
//import com.toedter.calendar.JDateChooser;


public class SignupOne extends JFrame{
    SignupOne(){
        
        setLayout(null);
        Random ran = new Random();
        long random = Math.abs((ran.nextLong()%9000L)+1000L);
        
        JLabel FormNo = new JLabel ("Application Form No. " + random);
        FormNo.setFont(new Font("Raleway", Font.BOLD, 38));
        FormNo.setBounds (140,20,600,40);
        add(FormNo);
        
        JLabel PersonalDetails = new JLabel ("Page 1: Personal Details");
        PersonalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        PersonalDetails.setBounds (290,80,400,30);
        add(PersonalDetails);
      
        
        JLabel Name = new JLabel ("Name: ");
        Name.setFont(new Font("Raleway", Font.BOLD, 22));
        Name.setBounds (60,120,400,30);
        add(Name);
        
        JTextField NameTextField = new JTextField();
        NameTextField.setFont(new Font("Raleway", Font.BOLD, 20));
        NameTextField.setBounds(350, 125, 400, 30);
        add(NameTextField);
        
        
        JLabel FName = new JLabel ("Father's Name: ");
        FName.setFont(new Font("Raleway", Font.BOLD, 22));
        FName.setBounds (60,160,400,30);
        add(FName);
        
        JTextField FNameTextField = new JTextField();
        FNameTextField.setFont(new Font("Raleway", Font.BOLD, 20));
        FNameTextField.setBounds(350, 165, 400, 30);
        add(FNameTextField);
        
        
        JLabel DOB = new JLabel ("Date of Birth: ");
        DOB.setFont(new Font("Raleway", Font.BOLD, 22));
        DOB.setBounds (60,200,400,30);
        add(DOB);
        
        JLabel Gender = new JLabel ("Gender: ");
        Gender.setFont(new Font("Raleway", Font.BOLD, 22));
        Gender.setBounds (60,240,400,30);
        add(Gender);
        
        JLabel Email = new JLabel ("Email: ");
        Email.setFont(new Font("Raleway", Font.BOLD, 22));
        Email.setBounds (60,280,400,30);
        add(Email);
        
        JTextField EmailTextField = new JTextField();
        EmailTextField.setFont(new Font("Raleway", Font.BOLD, 20));
        EmailTextField.setBounds(350, 285, 400, 30);
        add(EmailTextField);
        
        JLabel MarietalStatus = new JLabel ("Marietal Status: ");
        MarietalStatus.setFont(new Font("Raleway", Font.BOLD, 22));
        MarietalStatus.setBounds (60,320,400,30);
        add(MarietalStatus);
        
        JLabel Address= new JLabel ("Address: ");
        Address.setFont(new Font("Raleway", Font.BOLD, 22));
        Address.setBounds (60,360,400,30);
        add(Address);
        
        JTextField AddressTextField = new JTextField();
        AddressTextField.setFont(new Font("Raleway", Font.BOLD, 20));
        AddressTextField.setBounds(350, 365, 400, 30);
        add(AddressTextField);
        
        
        JLabel City = new JLabel ("City: ");
        City.setFont(new Font("Raleway", Font.BOLD, 22));
        City.setBounds (60,400,400,30);
        add(City);
        
        JTextField CityTextField = new JTextField();
        CityTextField.setFont(new Font("Raleway", Font.BOLD, 20));
        CityTextField.setBounds(350, 405, 400, 30);
        add(CityTextField);
                
        JLabel State = new JLabel ("State: ");
        State.setFont(new Font("Raleway", Font.BOLD, 22));
        State.setBounds (60,440,400,30);
        add(State);
        
        JTextField StateTextField = new JTextField();
        StateTextField.setFont(new Font("Raleway", Font.BOLD, 20));
        StateTextField.setBounds(350, 445, 400, 30);
        add(StateTextField);
        
        JLabel PostCode = new JLabel ("PostCode: ");
        PostCode.setFont(new Font("Raleway", Font.BOLD, 22));
        PostCode.setBounds (60,480,400,30);
        add(PostCode);
        
        JTextField PostTextField = new JTextField();
        PostTextField.setFont(new Font("Raleway", Font.BOLD, 20));
        PostTextField.setBounds(350, 485, 400, 30);
        add(PostTextField);
       
        
        
        
        
        
        
        
        
        
        
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850, 800);
        setLocation(350,10);
        setVisible(true);
    }
    
    public static void main(String args[]){
        new SignupOne();
    }
            
}
