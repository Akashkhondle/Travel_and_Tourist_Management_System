
package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class DeleteDetails extends JFrame implements ActionListener{
        JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20;
    JButton b1;
    String username;
    DeleteDetails(String username)
    {
        this.username = username;
        setBounds(400,120,850,600);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
         l1 = new JLabel("Username");
          l1.setBounds(30, 10, 150, 25);
          add(l1);
          
          
          l2 = new JLabel();
          l2.setBounds(220, 10, 150, 25);
          add(l2);
          
          l3 = new JLabel("ID");
          l3.setBounds(30, 60, 150, 25);
          add(l3);
          
          
          l4 = new JLabel();
          l4.setBounds(220, 60, 150, 25);
          add(l4);
          
          l5 = new JLabel("Number");
          l5.setBounds(30, 110, 150, 25);
          add(l5);
          
          
          l6 = new JLabel();
          l6.setBounds(220, 110, 150, 25);
          add(l6);
          
          l7 = new JLabel("Name");
          l7.setBounds(30, 160, 150, 25);
          add(l7);
          
          
          l8 = new JLabel();
          l8.setBounds(220, 160, 150, 25);
          add(l8);
          
          
          l9 = new JLabel("Gender");
          l9.setBounds(30, 210, 150, 25);
          add(l9);
          
          
          l10 = new JLabel();
          l10.setBounds(220, 210, 150, 25);
          add(l10);
          
           l11 = new JLabel("Country");
          l11.setBounds(500, 10, 150, 25);
          add(l11);
          
          
          l12 = new JLabel();
          l12.setBounds(690, 10, 150, 25);
          add(l12);
          
          
          l13 = new JLabel("Address");
          l13.setBounds(500, 60, 150, 25);
          add(l13);
          
          
          l14 = new JLabel();
          l14.setBounds(690, 60, 150, 25);
          add(l14);
          
          
          l15 = new JLabel("Phone");
          l15.setBounds(500, 110, 150, 25);
          add(l15);
          
          
          l16 = new JLabel();
          l16.setBounds(690, 110, 150, 25);
          add(l16);
          
          l17 = new JLabel("Email");
          l17.setBounds(500, 160, 150, 25);
          add(l17);
          
          
          l18 = new JLabel();
          l18.setBounds(690, 160, 150, 25);
          add(l18);
          
          b1 = new JButton("Delete");
          b1.setBackground(Color.BLACK);
          b1.setForeground(Color.WHITE);
          b1.setBounds(350,270,100,25);
          b1.addActionListener(this);
          add(b1);
          
          
           ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
          Image i2 = i1.getImage().getScaledInstance(600, 200, Image.SCALE_DEFAULT);
          ImageIcon i3 = new ImageIcon(i2);
          JLabel l19 = new JLabel(i3);
          l19.setBounds(20,320,600,200);
          add(l19);
          
           ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
          Image i5 = i4.getImage().getScaledInstance(600, 200, Image.SCALE_DEFAULT);
          ImageIcon i6 = new ImageIcon(i5);
          JLabel l20 = new JLabel(i3);
          l20.setBounds(600,320,600,200);
          add(l20);
          
          try{
                
                Conn c = new Conn();
                String query = "select * from customer where username = '"+username+"'";
                ResultSet rs = c.s.executeQuery(query);
                
                
                while(rs.next())
                {
                    l2.setText(rs.getString("username"));
                    l4.setText(rs.getString("id"));
                    l6.setText(rs.getString("number"));
                    l8.setText(rs.getString("name"));
                    l10.setText(rs.getString("gender"));
                    l12.setText(rs.getString("country"));
                    l14.setText(rs.getString("address"));
                    l16.setText(rs.getString("phone"));
                    l18.setText(rs.getString("email"));
                    
                }    
            }catch(Exception ae)
            {
                ae.printStackTrace();
            }
          
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {
         try{
                
                Conn c = new Conn();
               c.s.executeUpdate("delete from account where username = '"+username+"'");
                  c.s.executeUpdate("delete from customer where username = '"+username+"'");
                  c.s.executeUpdate("delete from bookpackage where username = '"+username+"'");
                     c.s.executeUpdate("delete from bookhotel where username = '"+username+"'");
                
                JOptionPane.showMessageDialog(null,"Data Deleted Successfully");
               System.exit(0);
            }catch(Exception ae)
            {
                ae.printStackTrace();
            }
          
    }
    public static void main(String[] args)
    {
        new DeleteDetails("akash@123");
    }
    
}
