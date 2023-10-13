package travel.management.system;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
public class UpdateCustomer extends JFrame implements ActionListener{
     JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
     JComboBox c;
     JTextField t1,t2,t3,t4,t5,tid,tgen;
     JRadioButton r1,r2;
     JButton b1,b2;
    UpdateCustomer(String username)
    {
       
        
        setBounds(450,150,800,500);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
          JLabel l = new JLabel("UPDATE CUSTOMER DETAILS");
          l.setBounds(50, 0, 300, 25);
          l.setFont(new Font("Tahoma",Font.PLAIN,20));
          add(l);
          
          
          l1 = new JLabel("Username");
          l1.setBounds(30, 30, 150, 25);
          add(l1);
          
          
          l2 = new JLabel();
          l2.setBounds(220, 30, 150, 25);
          add(l2);
          
           l3 = new JLabel("ID");
          l3.setBounds(30, 70, 150, 25);
          add(l3);
          
            tid = new JTextField();
          tid.setBounds(220,70,150,25);
          add(tid);
          
          l4 = new JLabel("Number");
          l4.setBounds(30, 110, 150, 25);
          add(l4);
          
          
          t1 = new JTextField();
          t1.setBounds(220,110,150,25);
          add(t1);
          
          
          l5 = new JLabel("Name");
          l5.setBounds(30, 150, 150, 25);
          add(l5);
          
          
          l6 = new JLabel();
          l6.setBounds(220, 150, 150, 25);
          add(l6);
          
          l7 = new JLabel("Gender");
          l7.setBounds(30, 190, 150, 25);
          add(l7);
          
           tgen = new JTextField();
          tgen.setBounds(220,190,150,25);
          add(tgen);
          
           l8 = new JLabel("Country");
          l8.setBounds(30, 230, 150, 25);
          add(l8);
          
          
          t2 = new JTextField();
          t2.setBounds(220,230,150,25);
          add(t2);
          
          l9 = new JLabel("Address");
          l9.setBounds(30, 270, 150, 25);
          add(l9);
          
          
          t3 = new JTextField();
          t3.setBounds(220,270,150,25);
          add(t3);
          
          l10 = new JLabel("Phone");
          l10.setBounds(30, 310, 150, 25);
          add(l10);
          
          
          t4 = new JTextField();
          t4.setBounds(220,310,150,25);
          add(t4);
          
          l11 = new JLabel("Email");
          l11.setBounds(30, 350, 150, 25);
          add(l11);
          
          
          t5 = new JTextField();
          t5.setBounds(220,350,150,25);
          add(t5);
          
          b1 = new JButton("Update");
          b1.setBackground(Color.BLACK);
          b1.setForeground(Color.WHITE);
          b1.setBounds(70,400,100,25);
          b1.addActionListener(this);
          add(b1);
          
          b2 = new JButton("Back");
          b2.setBackground(Color.BLACK);
          b2.setForeground(Color.WHITE);
          b2.setBounds(220,400,100,25);
          b2.addActionListener(this);
          add(b2);
          
          
           ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/update.png"));
          Image i2 = i1.getImage().getScaledInstance(400, 300, Image.SCALE_DEFAULT);
          ImageIcon i3 = new ImageIcon(i2);
          JLabel l12 = new JLabel(i3);
          l12.setBounds(400,80,400,300);
          add(l12);
          
          
          try{
              Conn c = new Conn();
            ResultSet rs=  c.s.executeQuery("select * from customer where username ='"+username+"'" );
              while(rs.next())
              {
                  l2.setText(rs.getString("username"));
                  l6.setText(rs.getString("name"));
                  tid.setText(rs.getString("id"));
                  tgen.setText(rs.getString("gender"));
                  t1.setText(rs.getString("number"));
                  t2.setText(rs.getString("country"));
                  t3.setText(rs.getString("address"));
                  t4.setText(rs.getString("phone"));
                  t5.setText(rs.getString("email"));
                  
                  
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
            String id = tid.getText();
            String number = t1.getText();
            String name = l6.getText();
            String gender = tgen.getText();
             String country = t2.getText();
             String address = t3.getText();
             String phone = t4.getText();
             String email = t5.getText();
             
             
            try{
                Conn c = new Conn();
                String query = "update customer set username ='"+username+"',id= '"+id+"',number='"+number+"',name='"+name+"',gender='"+gender+"',country= '"+country+"',address ='"+address+"',phone ='"+phone+"',email ='"+email+"'";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Customer Details Updated Successfully");
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
        new UpdateCustomer("akash@123");
        
    }
    
}
