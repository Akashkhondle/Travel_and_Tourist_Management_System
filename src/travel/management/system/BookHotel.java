package travel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.border.LineBorder;

public class BookHotel extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14;
    JTextField t1,t2;
    JButton b1,b2,b3;
    Choice c1,c2,c3;
    String username;
     BookHotel(String username)
    {
        this.username=username;
        setBounds(240,120,1100,570);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
         JLabel l = new JLabel("BOOK HOTEL");
          l.setBounds(100, 10, 200, 30);
          l.setFont(new Font("Tahoma",Font.BOLD,20));
          add(l);
        
         l1 = new JLabel("Username");
          l1.setBounds(40, 70, 100, 20);
           l1.setFont(new Font("Tahoma",Font.PLAIN,16));
          add(l1);
          
          
          l2 = new JLabel();
          l2.setBounds(250, 70, 200, 20);
          l2.setFont(new Font("Tahoma",Font.PLAIN,16));
          add(l2);
          
          l3 = new JLabel("Select Hotel");
          l3.setBounds(40, 110, 150, 20);
           l3.setFont(new Font("Tahoma",Font.PLAIN,16));
          add(l3);
          
          
          c1 = new Choice();
           c1.setBounds(250, 110, 200, 20);
           add(c1);
           
           
           
          try{
                
                Conn c = new Conn();
                
                ResultSet rs = c.s.executeQuery("select * from hotel");
                
                
                while(rs.next())
                {
                    c1.add(rs.getString("name"));         
                    
                }    
            }catch(Exception ae)
            {
                ae.printStackTrace();
            }
          
          l4 = new JLabel("Total Persons");
          l4.setBounds(40, 150, 150, 25);
           l4.setFont(new Font("Tahoma",Font.PLAIN,16));
          add(l4);
          
          t1 = new JTextField("1");
           t1.setBounds(250, 150, 200, 25);
          add(t1);
          
           l4 = new JLabel("No. of Days");
          l4.setBounds(40, 190, 150, 25);
           l4.setFont(new Font("Tahoma",Font.PLAIN,16));
          add(l4);
          
          t2 = new JTextField("1");
           t2.setBounds(250, 190, 200, 25);
          add(t2);
          
          
          l5 = new JLabel("AC/Non-AC");
          l5.setFont(new Font("Tahoma",Font.PLAIN,16));
          l5.setBounds(40, 230, 150, 25);
          add(l5);
          
          
           c2 = new Choice();
           c2.add("AC");
           c2.add("Non-AC");
           c2.setBounds(250, 230, 200, 20);
           add(c2);
          
           
            
          l6 = new JLabel("Food Included");
          l6.setFont(new Font("Tahoma",Font.PLAIN,16));
          l6.setBounds(40, 270, 150, 25);
          add(l6);
          
          
           c3 = new Choice();
           c3.add("Yes");
           c3.add("No");
           c3.setBounds(250, 270, 200, 20);
           add(c3);
          
           
            l7 = new JLabel("ID");
          l7.setBounds(40, 310, 150, 25);
           l7.setFont(new Font("Tahoma",Font.PLAIN,16));
          add(l7);
          
          
          l8 = new JLabel();
          l8.setBounds(250, 310, 150, 25);
          add(l8);
          
          
          l9 = new JLabel("Number");
          l9.setBounds(40, 350, 150, 25);
           l9.setFont(new Font("Tahoma",Font.PLAIN,16));
          add(l9);
          
          
          l10 = new JLabel();
          l10.setBounds(250, 350, 150, 25);
          add(l10);
          
           l11 = new JLabel("Phone");
          l11.setFont(new Font("Tahoma",Font.PLAIN,16));
          l11.setBounds(40, 390, 150, 25);
          add(l11);
          
          
          l12 = new JLabel();
          l12.setBounds(250, 390, 200, 25);
          add(l12);
          
          
          l13 = new JLabel("Total Price");
          l13.setBounds(40, 430, 150, 25);
           l13.setFont(new Font("Tahoma",Font.PLAIN,16));
          add(l13);
          
          
          l14 = new JLabel();
          l14.setBounds(250, 430, 150, 25);
          add(l14);
          
          
          
          try{
                
                Conn c = new Conn();
                String query = "select * from customer where username = '"+username+"'";
                ResultSet rs = c.s.executeQuery(query);
                
                
                while(rs.next())
                {
                    l2.setText(rs.getString("username"));
                    l8.setText(rs.getString("id"));
                    l10.setText(rs.getString("number"));
                    l12.setText(rs.getString("phone"));
                   
                    
                    
                }    
            }catch(Exception ae)
            {
                ae.printStackTrace();
            }
          
           b1 = new JButton("Check Price");
          b1.setBounds(60,490,120,25);
          b1.setBackground(Color.BLACK);
          b1.setForeground(Color.WHITE);
          b1.addActionListener(this);
          add(b1);
          
          
           b2 = new JButton("Book Hotel");
          b2.setBounds(200,490,120,25);
          b2.setBackground(Color.BLACK);
          b2.setForeground(Color.WHITE);
           b2.addActionListener(this);
          add(b2);
          
           b3 = new JButton("Back");
          b3.setBounds(340,490,120,25);
          b3.setBackground(Color.BLACK);
          b3.setForeground(Color.WHITE);
          b3.addActionListener(this);
          add(b3);
          
           ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
          Image i2 = i1.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
          ImageIcon i3 = new ImageIcon(i2);
          JLabel l13 = new JLabel(i3);
          l13.setBounds(500,50,600,400);
          add(l13);
          
          
          setVisible(true);
    }
    
     public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == b1)
        {
            try
            {
                 Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from hotel where name = '"+c1.getSelectedItem()+"'");
            
            while(rs.next())
            {
                int cost = Integer.parseInt(rs.getString("costperperson"));
                int food =  Integer.parseInt(rs.getString("foodincluded"));
                int ac =  Integer.parseInt(rs.getString("acroom"));
                
                 int persons = Integer.parseInt(t1.getText());
                  int days = Integer.parseInt(t2.getText());
                  
                  String acselected = c2.getSelectedItem();
                   String foodselected = c3.getSelectedItem();
                   
                   if(persons * days > 0)
                   {
                       int total =0;
                       total += acselected.equals("AC") ? ac :0;
                       total += foodselected.equals("Yes") ? food :0;
                       total += cost;
                       
                       total  = total * persons * days;
                       l14.setText("RS " + total);
                   }else{
                       JOptionPane.showMessageDialog(null,"Please enter a valid number");
                   }
            }
            
           
            
          
          }catch(Exception ae)
            {
                ae.printStackTrace();
            }
            
        }else if(e.getSource() == b2)
        {
            try{
                
                Conn c = new Conn();
                c.s.executeUpdate("insert into bookhotel values('"+l2.getText()+"', '"+c1.getSelectedItem()+"','"+t1.getText()+"','"+t2.getText()+"','"+c2.getSelectedItem()+"','"+c3.getSelectedItem()+"','"+l8.getText()+"','"+l10.getText()+"','"+l12.getText()+"','"+l14.getText()+"')");
                
                JOptionPane.showMessageDialog(null,"Hotel Booked Successfully");
                setVisible(false);
                
                   
            }catch(Exception ae)
            {
                ae.printStackTrace();
            }
        }else{
            setVisible(false);
        }
    }
    public static void main(String[] args)
    {
        new BookHotel("akash@123");
    }
    
}
