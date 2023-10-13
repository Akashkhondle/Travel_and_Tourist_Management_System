
package travel.management.system;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener{
    JButton b1,b2,b3;
     JTextField t1,t2;
    
    Login(){
         setSize(900,400);
          setLocation(200,100);
          setLayout(null);
          
          getContentPane().setBackground(Color.WHITE);
          JPanel p1 = new JPanel();
          p1.setBackground(new Color(131,193,233));
          p1.setBounds(0,0,400,400);
          p1.setLayout(null);
          add(p1); 
          
          
          ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
          Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
          ImageIcon i3 = new ImageIcon(i2);
          JLabel l1 = new JLabel(i3);
          l1.setBounds(100,120,200,200);
          p1.add(l1);
          
          JPanel p2 = new JPanel();
          p2.setLayout(null);
          p2.setBounds(400,30,450,300);
          add(p2);
          
          JLabel l2 = new JLabel("Username");
          l2.setBounds(60, 20, 100, 25);
          l2.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
          p2.add(l2);
          
          t1 = new JTextField();
          t1.setBounds(60,60,300,30);
          t1.setBorder(BorderFactory.createEmptyBorder());
          p2.add(t1);
          
          JLabel l3 = new JLabel("Password");
          l3.setBounds(60, 110, 100, 25);
          l3.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
          p2.add(l3);
          
           t2 = new JTextField();
          t2.setBounds(60,150,300,30);
          t2.setBorder(BorderFactory.createEmptyBorder());
          p2.add(t2);
          
           b1 = new JButton("Login");
          b1.setBounds(60,200,130,30);
          b1.setBackground(new Color(133,193,233));
          b1.setForeground(Color.WHITE);
          b1.setBorder(new LineBorder(new Color(133,193,233)));
           b1.addActionListener(this);
          p2.add(b1);
          
           b2 = new JButton("Signup");
          b2.setBounds(230,200,130,30);
          b2.setBackground(new Color(133,193,233));
          b2.setForeground(Color.WHITE);
          b2.setBorder(new LineBorder(new Color(133,193,233)));
           b2.addActionListener(this);
          p2.add(b2);
          
           b3 = new JButton("Forget Password");
          b3.setBounds(150,250,130,30);
          b3.setBackground(new Color(133,193,233));
          b3.setForeground(Color.WHITE);
          b3.setBorder(new LineBorder(new Color(133,193,233)));
           b3.addActionListener(this);
          p2.add(b3);
          
          
          JLabel l4 = new JLabel("Trouble in login....");
          l4.setBounds(300, 250, 150, 20);
          l4.setForeground(Color.RED);
          p2.add(l4);
          
          
          setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == b1)
        {
            try{
                    String username = t1.getText();
                String pass = t2.getText();

                String query = "select * from account where username = '"+username+"' AND password = '"+pass+"'";
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                if(rs.next())
                {
                    setVisible(false);
                    new Loading(username);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Incorrect username or password");
                }
            }
            catch(Exception ae)
            {
                ae.printStackTrace();
            }
            
            
            
            
        }else if(e.getSource() == b2)
        {
            setVisible(false);
            new Signup();
        }else
        {
             setVisible(false);
            new ForgetPassword();
        }
    }
    public static void main(String[] args)
    {
        new Login();
    }
    
}
