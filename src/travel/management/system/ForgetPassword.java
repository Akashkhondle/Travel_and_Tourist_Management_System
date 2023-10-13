
package travel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class ForgetPassword extends JFrame implements ActionListener {
    JTextField t1,t2,t3,t4,t5;
    JButton b1,b2,b3;
    ForgetPassword()
    {
        setBounds(200,100,900,400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/forgotpassword.jpg"));
          Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
          ImageIcon i3 = new ImageIcon(i2);
          JLabel l1 = new JLabel(i3);
          l1.setBounds(580,50,200,200);
          add(l1);
          
          JPanel p1 = new JPanel();
          p1.setBackground(new Color(131,193,233));
          p1.setBounds(30,30,500,280);
          p1.setLayout(null);
          add(p1);
          
           JLabel l2 = new JLabel("Username");
          l2.setBounds(50, 20, 100, 25);
          l2.setFont(new Font("Tahoma",Font.BOLD,14));
          p1.add(l2);
          
          t1 = new JTextField();
          t1.setBounds(220,20,150,25);
          t1.setBorder(BorderFactory.createEmptyBorder());
          p1.add(t1);
          
           b1 = new JButton("Search");
           b1.setBackground(Color.GRAY);
           b1.setBounds(380,20,100,25);
           b1.setForeground(Color.WHITE);
            b1.addActionListener(this);
           p1.add(b1);
           
            JLabel l3 = new JLabel("Name");
          l3.setBounds(50, 60, 100, 25);
          l3.setFont(new Font("Tahoma",Font.BOLD,14));
          p1.add(l3);
          
          t2 = new JTextField();
          t2.setBounds(220,60,150,25);
          t2.setBorder(BorderFactory.createEmptyBorder());
          p1.add(t2);
          
          JLabel l4 = new JLabel("Security Question");
          l4.setBounds(50, 100, 150, 25);
          l4.setFont(new Font("Tahoma",Font.BOLD,14));
          p1.add(l4);
          
          t3 = new JTextField();
          t3.setBounds(220,100,150,25);
          t3.setBorder(BorderFactory.createEmptyBorder());
          p1.add(t3);
          
          JLabel l5 = new JLabel("Answer");
          l5.setBounds(50, 140, 150, 25);
          l5.setFont(new Font("Tahoma",Font.BOLD,14));
          p1.add(l5);
          
          t4 = new JTextField();
          t4.setBounds(220,140,150,25);
          t4.setBorder(BorderFactory.createEmptyBorder());
          p1.add(t4);
           
          b2 = new JButton("Retrieve");
           b2.setBackground(Color.GRAY);
           b2.setBounds(380,140,100,25);
           b2.setForeground(Color.WHITE);
            b2.addActionListener(this);
           p1.add(b2);
           
            JLabel l6 = new JLabel("Password");
          l6.setBounds(50, 180, 150, 25);
          l6.setFont(new Font("Tahoma",Font.BOLD,14));
          p1.add(l6);
          
          t5 = new JTextField();
          t5.setBounds(220,180,150,25);
          t5.setBorder(BorderFactory.createEmptyBorder());
          p1.add(t5);
          
           b3 = new JButton("Back");
           b3.setBackground(Color.GRAY);
           b3.setBounds(150,230,100,25);
           b3.setForeground(Color.WHITE);
            b3.addActionListener(this);
           p1.add(b3);
           
           
      
        
          
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == b1)
        {
            //Search button 
            try{
                String query = "select * from account where username = '"+t1.getText()+"'";
                Conn c = new Conn();
                
                ResultSet rs = c.s.executeQuery(query);
                
                while(rs.next())
                {
                    t2.setText(rs.getString("name"));
                    t3.setText(rs.getString("security"));
                    
                }    
            }catch(Exception ae)
            {
                ae.printStackTrace();
            }
            
        }else if(e.getSource() == b2)
        {
            //Retrive button
            try{
                String query = "select * from account where answer = '"+t4.getText()+"' AND username = '"+t1.getText()+"' ";
                Conn c = new Conn();
                
                ResultSet rs = c.s.executeQuery(query);
                
                while(rs.next())
                {
                    t5.setText(rs.getString("password"));
                    
                    
                }    
            }catch(Exception ae)
            {
                ae.printStackTrace();
            }
            
        }else
        {
            setVisible(true);
            new Login();
        }
        
    }
    
    
    public static void main(String[] args)
    {
        new ForgetPassword();
    }
    
}
