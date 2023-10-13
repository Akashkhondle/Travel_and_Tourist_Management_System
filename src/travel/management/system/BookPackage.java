package travel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.border.LineBorder;

public class BookPackage extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
    JTextField t1 = new JTextField();
    JButton b1,b2,b3;
    Choice c1;
    String username;
    BookPackage(String username)
    {
        this.username=username;
        setBounds(300,150,1100,500);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
         JLabel l = new JLabel("BOOK PACKAGE");
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
          
          l3 = new JLabel("Select Package");
          l3.setBounds(40, 110, 150, 20);
           l3.setFont(new Font("Tahoma",Font.PLAIN,16));
          add(l3);
          
          
          c1 = new Choice();
          c1.add("Gold Package");
           c1.add("Silver Package");
           c1.add("Bronze Package");
           c1.setBounds(250, 110, 200, 20);
           add(c1);
          
          l4 = new JLabel("Total Persons");
          l4.setBounds(40, 150, 150, 25);
           l4.setFont(new Font("Tahoma",Font.PLAIN,16));
          add(l4);
          
          t1 = new JTextField("1");
           t1.setBounds(250, 150, 200, 25);
          add(t1);
          
          
          
          
          
          l5 = new JLabel("ID");
          l5.setFont(new Font("Tahoma",Font.PLAIN,16));
          l5.setBounds(40, 190, 150, 25);
          add(l5);
          
          
          l6 = new JLabel();
          l6.setBounds(250, 190, 200, 25);
          add(l6);
          
          
          l7 = new JLabel("Number");
          l7.setBounds(40, 230, 150, 25);
           l7.setFont(new Font("Tahoma",Font.PLAIN,16));
          add(l7);
          
          
          l8 = new JLabel();
          l8.setBounds(250, 230, 150, 25);
          add(l8);
          
           l9 = new JLabel("Phone");
          l9.setFont(new Font("Tahoma",Font.PLAIN,16));
          l9.setBounds(40, 270, 150, 25);
          add(l9);
          
          
          l10 = new JLabel();
          l10.setBounds(250, 270, 200, 25);
          add(l10);
          
          
          l11 = new JLabel("Total Price");
          l11.setBounds(40, 310, 150, 25);
           l11.setFont(new Font("Tahoma",Font.PLAIN,16));
          add(l11);
          
          
          l12 = new JLabel();
          l12.setBounds(250, 310, 150, 25);
          add(l12);
          
          
          
          try{
                
                Conn c = new Conn();
                String query = "select * from customer where username = '"+username+"'";
                ResultSet rs = c.s.executeQuery(query);
                
                
                while(rs.next())
                {
                    l2.setText(rs.getString("username"));
                    l6.setText(rs.getString("id"));
                    l8.setText(rs.getString("number"));
                    l10.setText(rs.getString("phone"));
                   
                    
                    
                }    
            }catch(Exception ae)
            {
                ae.printStackTrace();
            }
          
           b1 = new JButton("Check Price");
          b1.setBounds(60,380,120,25);
          b1.setBackground(Color.BLACK);
          b1.setForeground(Color.WHITE);
          b1.addActionListener(this);
          add(b1);
          
          
           b2 = new JButton("Book Package");
          b2.setBounds(200,380,120,25);
          b2.setBackground(Color.BLACK);
          b2.setForeground(Color.WHITE);
           b2.addActionListener(this);
          add(b2);
          
           b3 = new JButton("Back");
          b3.setBounds(340,380,120,25);
          b3.setBackground(Color.BLACK);
          b3.setForeground(Color.WHITE);
          b3.addActionListener(this);
          add(b3);
          
           ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bookpackage.jpg"));
          Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
          ImageIcon i3 = new ImageIcon(i2);
          JLabel l13 = new JLabel(i3);
          l13.setBounds(550,50,500,300);
          add(l13);
          
          
          setVisible(true);
    }
    
     public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == b1)
        {
            String pack = c1.getSelectedItem();
            int cost =0;
            if(pack.equals("Gold Package"))
            {
                cost += 12000;
            }else  if(pack.equals("Silver Package")){
                cost +=24000;
            }else{
                cost +=32000;
            }
            
            int persons = Integer.parseInt(t1.getText());
            cost *=persons;
            
            l12.setText("Rs " + cost);
            
        }else if(e.getSource() == b2)
        {
            try{
                
                Conn c = new Conn();
                c.s.executeUpdate("insert into bookpackage values('"+l2.getText()+"', '"+c1.getSelectedItem()+"','"+t1.getText()+"','"+l6.getText()+"','"+l8.getText()+"','"+l10.getText()+"','"+l12.getText()+"')");
                
                JOptionPane.showMessageDialog(null,"Package Booked Successfully");
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
        new BookPackage("akash@123");
    }
    
}
