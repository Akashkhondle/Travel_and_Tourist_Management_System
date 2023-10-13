

package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class ViewBookedHotel extends JFrame implements ActionListener{
        JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20;
    JButton b1;
    ViewBookedHotel(String username)
    {
        setBounds(300,160,950,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel l = new JLabel("VIEW BOOKED HOTELS DETAILS");
         l.setBounds(60, 0, 400, 30);
          l.setFont(new Font("Tahoma",Font.BOLD,14));
          add(l);
        
        
         l1 = new JLabel("Username");
          l1.setBounds(30, 40, 150, 25);
          add(l1);
          
          
          l2 = new JLabel();
          l2.setBounds(220, 40, 150, 25);
          add(l2);
          
          l3 = new JLabel("Hotel Name");
          l3.setBounds(30, 80, 150, 25);
          add(l3);
          
          
          l4 = new JLabel();
          l4.setBounds(220, 80, 150, 25);
          add(l4);
          
          l5 = new JLabel("Total Persons");
          l5.setBounds(30, 120, 150, 25);
          add(l5);
          
          
          l6 = new JLabel();
          l6.setBounds(220, 120, 150, 25);
          add(l6);
          
          l7 = new JLabel("Total Days");
          l7.setBounds(30, 160, 150, 25);
          add(l7);
          
          
          l8 = new JLabel();
          l8.setBounds(220, 160, 150, 25);
          add(l8);
          
          
          l9 = new JLabel("AC/Non-AC");
          l9.setBounds(30, 200, 150, 25);
          add(l9);
          
          
          l10 = new JLabel();
          l10.setBounds(220, 200, 150, 25);
          add(l10);
          
           l11 = new JLabel("Food Included?");
          l11.setBounds(30, 240, 150, 25);
          add(l11);
          
          
          l12 = new JLabel();
          l12.setBounds(220, 240, 150, 25);
          add(l12);
          
          
          l13 = new JLabel("ID");
          l13.setBounds(30, 280, 150, 25);
          add(l13);
          
          
          l14 = new JLabel();
          l14.setBounds(220, 280, 150, 25);
          add(l14);
          
           l15 = new JLabel("Number");
          l15.setBounds(30, 320, 150, 25);
          add(l15);
          
          
          l16 = new JLabel();
          l16.setBounds(220, 320, 150, 25);
          add(l16);
          
           l17 = new JLabel("Phone");
          l17.setBounds(30, 360, 150, 25);
          add(l17);
          
          
          l18 = new JLabel();
          l18.setBounds(220, 360, 150, 25);
          add(l18);
          
           l19 = new JLabel("Price");
          l19.setBounds(30, 400, 150, 25);
          add(l19);
          
          
          l20 = new JLabel();
          l20.setBounds(220, 400, 150, 25);
          add(l20);
          
          
         
          
          b1 = new JButton("Back");
          b1.setBackground(Color.BLACK);
          b1.setForeground(Color.WHITE);
          b1.setBounds(130,450,100,25);
          b1.addActionListener(this);
          add(b1);
          
          
           ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bookedDetails.jpg"));
          Image i2 = i1.getImage().getScaledInstance(500, 400, Image.SCALE_DEFAULT);
          ImageIcon i3 = new ImageIcon(i2);
          JLabel l15 = new JLabel(i3);
          l15.setBounds(450,20,500,400);
          add(l15);
          
           
          
          try{
                
                Conn c = new Conn();
                String query = "select * from bookhotel where username = '"+username+"'";
                ResultSet rs = c.s.executeQuery(query);
                
                
                while(rs.next())
                {
                    l2.setText(rs.getString("username"));
                    l4.setText(rs.getString("name"));
                    l6.setText(rs.getString("persons"));
                    l8.setText(rs.getString("days"));
                    l10.setText(rs.getString("ac"));
                    l12.setText(rs.getString("food"));
                    l14.setText(rs.getString("id"));
                     l16.setText(rs.getString("number"));
                      l18.setText(rs.getString("phone"));
                       l20.setText(rs.getString("price"));
                   
                }    
            }catch(Exception ae)
            {
                ae.printStackTrace();
            }
          
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        setVisible(false);
    }
    public static void main(String[] args)
    {
        new ViewBookedHotel("akash@123");
    }
    
}
