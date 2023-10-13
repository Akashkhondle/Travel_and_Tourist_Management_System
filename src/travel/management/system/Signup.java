package travel.management.system;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;

public class Signup extends JFrame implements ActionListener{
    JButton b1,b2;
    JTextField t1,t2,t3,t4;
    Choice c1;
    Signup(){
        setBounds(200,100,900,400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JPanel p1 = new JPanel();
          p1.setBackground(new Color(131,193,233));
          p1.setBounds(0,0,400,400);
          p1.setLayout(null);
          add(p1);
          
          JLabel l1 = new JLabel("Username");
          l1.setBounds(50, 20, 125, 25);
          l1.setFont(new Font("Tahoma",Font.BOLD,14));
          p1.add(l1);
          
           t1 = new JTextField();
          t1.setBounds(190,20,180,25);
          t1.setBorder(BorderFactory.createEmptyBorder());
          p1.add(t1);
        
           JLabel l2 = new JLabel("Name");
          l2.setBounds(50, 60, 125, 25);
          l2.setFont(new Font("Tahoma",Font.BOLD,14));
          p1.add(l2);
          
           t2 = new JTextField();
          t2.setBounds(190,60,180,25);
          t2.setBorder(BorderFactory.createEmptyBorder());
          p1.add(t2);
          
           JLabel l3 = new JLabel("Password");
          l3.setBounds(50, 100, 125, 25);
          l3.setFont(new Font("Tahoma",Font.BOLD,14));
          p1.add(l3);
          
           t3 = new JTextField();
          t3.setBounds(190,100,180,25);
          t3.setBorder(BorderFactory.createEmptyBorder());
          p1.add(t3);
          
           JLabel l4 = new JLabel("Security Question");
          l4.setBounds(50, 140, 125, 25);
          l4.setFont(new Font("Tahoma",Font.BOLD,14));
          p1.add(l4);
          
           c1 = new Choice();
          c1.add("who is your favourite cricket player");
          c1.add("Your Lucky Number");
          c1.add("Fav Marvel Superhero");
          c1.add("Your Childhood superhero");
          c1.setBounds(190,140,180,30);
          p1.add(c1);
          
          JLabel l5 = new JLabel("Answer");
          l5.setBounds(50, 180, 125, 25);
          l5.setFont(new Font("Tahoma",Font.BOLD,14));
          p1.add(l5);
          
           t4 = new JTextField();
          t4.setBounds(190,180,180,25);
          t4.setBorder(BorderFactory.createEmptyBorder());
          p1.add(t4);
          
           b1 = new JButton("Create");
           b1.setBackground(Color.WHITE);
           b1.setBounds(50,250,100,30);
           b1.setForeground(new Color(133,193,233));
           b1.setFont(new Font ("Tohma",Font.BOLD,14));
           b1.addActionListener(this);
         
          p1.add(b1);
          
           b2 = new JButton("Back");
          b2.setBounds(250,250,100,30);
          b2.setBackground(Color.WHITE);
          b2.setForeground(new Color(133,193,233));
          b2.setFont(new Font ("Tohma",Font.BOLD,14));
          b2.addActionListener(this);
          p1.add(b2);
          
          ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
          Image i2 = i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
          ImageIcon i3 = new ImageIcon(i2);
          JLabel l6 = new JLabel(i3);
          l6.setBounds(550,70,200,200);
          add(l6);
          
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == b1)
        {
            // create button
            
            String username = t1.getText();
            String name = t2.getText();
            String password = t3.getText();
            String question = c1.getSelectedItem();
            String answer = t4.getText();
            
            String query = "insert into account values('"+username+"','"+name+"','"+password+"','"+question+"','"+answer+"')";
            try{
                Conn c = new Conn();
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Account Created Successfully");
                setVisible(false);
            new Login();
                
            }catch(Exception ae)
            {
                ae.printStackTrace();
            }
            
        }else if(e.getSource() == b2)
        {
            //back button
            setVisible(false);
            new Login();
        }
        
    }
    public static void main(String[] args)
    {
        new Signup();
    }
    
}
