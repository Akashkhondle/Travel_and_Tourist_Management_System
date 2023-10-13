package travel.management.system;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
public class AddCustomer extends JFrame implements ActionListener{
     JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
     JComboBox c;
     JTextField t1,t2,t3,t4,t5;
     JRadioButton r1,r2;
     JButton b1,b2;
    AddCustomer(String username)
    {
        
        setBounds(400,150,800,480);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
          
          l1 = new JLabel("Username");
          l1.setBounds(30, 10, 150, 25);
          add(l1);
          
          
          l2 = new JLabel();
          l2.setBounds(220, 10, 150, 25);
          add(l2);
          
           l3 = new JLabel("ID");
          l3.setBounds(30, 50, 150, 25);
          add(l3);
          
          c = new JComboBox(new String[] {"Passport","Aadhar Card","Pan Card","Ration Card"});
          c.setBounds(220, 50, 150, 25);
          c.setBackground(Color.WHITE);
          add(c);
          
          l4 = new JLabel("Number");
          l4.setBounds(30, 90, 150, 25);
          add(l4);
          
          
          t1 = new JTextField();
          t1.setBounds(220,90,150,25);
          add(t1);
          
          
          l5 = new JLabel("Name");
          l5.setBounds(30, 130, 150, 25);
          add(l5);
          
          
          l6 = new JLabel();
          l6.setBounds(220, 130, 150, 25);
          add(l6);
          
          l7 = new JLabel("Gender");
          l7.setBounds(30, 170, 150, 25);
          add(l7);
          
          r1 = new JRadioButton("Male");
          r1.setBounds(220,170,70,25);
          r1.setBackground(Color.WHITE);
          add(r1);
          
           r2 = new JRadioButton("Female");
          r2.setBounds(300,170,70,25);
          r2.setBackground(Color.WHITE);
          add(r2);
          
          ButtonGroup bg = new ButtonGroup();
          bg.add(r1);
          bg.add(r2);
          
           l8 = new JLabel("Country");
          l8.setBounds(30, 210, 150, 25);
          add(l8);
          
          
          t2 = new JTextField();
          t2.setBounds(220,210,150,25);
          add(t2);
          
          l9 = new JLabel("Address");
          l9.setBounds(30, 250, 150, 25);
          add(l9);
          
          
          t3 = new JTextField();
          t3.setBounds(220,250,150,25);
          add(t3);
          
          l10 = new JLabel("Phone");
          l10.setBounds(30, 290, 150, 25);
          add(l10);
          
          
          t4 = new JTextField();
          t4.setBounds(220,290,150,25);
          add(t4);
          
          l11 = new JLabel("Email");
          l11.setBounds(30, 330, 150, 25);
          add(l11);
          
          
          t5 = new JTextField();
          t5.setBounds(220,330,150,25);
          add(t5);
          
          b1 = new JButton("Add");
          b1.setBackground(Color.BLACK);
          b1.setForeground(Color.WHITE);
          b1.setBounds(70,390,100,25);
          b1.addActionListener(this);
          add(b1);
          
          b2 = new JButton("Back");
          b2.setBackground(Color.BLACK);
          b2.setForeground(Color.WHITE);
          b2.setBounds(220,390,100,25);
          b2.addActionListener(this);
          add(b2);
          
          
           ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/newcustomer.jpg"));
          Image i2 = i1.getImage().getScaledInstance(400, 500, Image.SCALE_DEFAULT);
          ImageIcon i3 = new ImageIcon(i2);
          JLabel l12 = new JLabel(i3);
          l12.setBounds(400,20,400,400);
          add(l12);
          
          
          try{
              Conn c = new Conn();
            ResultSet rs=  c.s.executeQuery("select * from account where username ='"+username+"'" );
              while(rs.next())
              {
                  l2.setText(rs.getString("username"));
                  l6.setText(rs.getString("name"));
              }
              
          }catch(Exception ex)
          {
              ex.printStackTrace();
          }
          
          
          
          
          
          
          
          
          
          
                  
          
          
        
          setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == b1)
        {
            String username = l2.getText();
            String id = (String)c.getSelectedItem();
            String number = t1.getText();
            String name = l6.getText();
            String gender = null;
            
            if(r1.isSelected())
            {
                gender = "Male";
            }
            else
            {
                gender = "Female";
            }
            
             String country = t2.getText();
             String address = t3.getText();
             String phone = t4.getText();
             String email = t5.getText();
             
             
            try{
                Conn c = new Conn();
                String query = "insert into customer values('"+username+"','"+id+"','"+number+"','"+name+"','"+gender+"','"+country+"','"+address+"','"+phone+"','"+email+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Customer Details Added Successfully");
                setVisible(false);
            
                
            }catch(Exception ae)
            {
                ae.printStackTrace();
            }
            
            
            
                
            
            
        }else
        {
            setVisible(false);
        }
    }
    
    public static void main(String[] args)
    {
        new AddCustomer("akash@123");
        
    }
    
}
