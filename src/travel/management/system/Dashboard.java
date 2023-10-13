
package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Dashboard extends JFrame implements ActionListener {
    String username;
    JButton b1,b2,b3,b5,b6,b7,b8,b9,b11,b10,b12,b13,b14,b15,b4,b16;
    Dashboard(String username)
    {
        this.username = username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0,0,1400,50);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
          Image i2 = i1.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
          ImageIcon i3 = new ImageIcon(i2);
          JLabel l1 = new JLabel(i3);
          l1.setBounds(5,0,50,50);
          p1.add(l1);
        
        
        JLabel l2 = new JLabel("Dashboard");
        l2.setBounds(80,10,300,40);
        l2.setFont(new Font("Tahoma",Font.BOLD,30));
        l2.setForeground(Color.WHITE);
         p1.add(l2);
         
         JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0,50,300,800);
        add(p2);
        
         b1 = new JButton("Add Personal Details");
           b1.setBackground(new Color(0,0,102));
           b1.setBounds(0,5,300,45);
           b1.setForeground(Color.WHITE);
           b1.setFont(new Font("Tahoma",Font.PLAIN,20));
           b1.setMargin(new Insets(0,0,0,60));
            b1.addActionListener(this);
           p2.add(b1);
           
           
           b2 = new JButton("Update Personal Details");
           b2.setBackground(new Color(0,0,102));
           b2.setBounds(0,45,300,45);
           b2.setForeground(Color.WHITE);
           b2.setFont(new Font("Tahoma",Font.PLAIN,20));
           b2.setMargin(new Insets(0,0,0,30));
            b2.addActionListener(this);
           p2.add(b2);
           
            b3 = new JButton("View Details");
           b3.setBackground(new Color(0,0,102));
           b3.setBounds(0,85,300,45);
           b3.setForeground(Color.WHITE);
           b3.setFont(new Font("Tahoma",Font.PLAIN,20));
           b3.setMargin(new Insets(0,0,0,130));
           b3.addActionListener(this);
           p2.add(b3);
           
           b4 = new JButton("Delete Personal Details");
           b4.setBackground(new Color(0,0,102));
           b4.setBounds(0,125,300,45);
           b4.setForeground(Color.WHITE);
           b4.setFont(new Font("Tahoma",Font.PLAIN,20));
           b4.setMargin(new Insets(0,0,0,30));
           b4.addActionListener(this);
           p2.add(b4);
           
            b5 = new JButton("Check Package");
           b5.setBackground(new Color(0,0,102));
           b5.setBounds(0,165,300,45);
           b5.setForeground(Color.WHITE);
           b5.setFont(new Font("Tahoma",Font.PLAIN,20));
           b5.setMargin(new Insets(0,0,0,110));
           b5.addActionListener(this);
           p2.add(b5);
           
            b6 = new JButton("Book Package");
           b6.setBackground(new Color(0,0,102));
           b6.setBounds(0,205,300,45);
           b6.setForeground(Color.WHITE);
           b6.setFont(new Font("Tahoma",Font.PLAIN,20));
           b6.setMargin(new Insets(0,0,0,120));
            b6.addActionListener(this);
           p2.add(b6);
           
           b7 = new JButton("View Package");
           b7.setBackground(new Color(0,0,102));
           b7.setBounds(0,245,300,45);
           b7.setForeground(Color.WHITE);
           b7.setFont(new Font("Tahoma",Font.PLAIN,20));
           b7.setMargin(new Insets(0,0,0,120));
            b7.addActionListener(this);
           p2.add(b7);
           
           b8 = new JButton("View Hotels");
           b8.setBackground(new Color(0,0,102));
           b8.setBounds(0,285,300,45);
           b8.setForeground(Color.WHITE);
           b8.setFont(new Font("Tahoma",Font.PLAIN,20));
           b8.setMargin(new Insets(0,0,0,130));
            b8.addActionListener(this);
           p2.add(b8);
           
             b9 = new JButton("Book Hotel");
           b9.setBackground(new Color(0,0,102));
           b9.setBounds(0,325,300,45);
           b9.setForeground(Color.WHITE);
           b9.setFont(new Font("Tahoma",Font.PLAIN,20));
           b9.setMargin(new Insets(0,0,0,140));
           b9.addActionListener(this);
           p2.add(b9);
           
            b10 = new JButton("View Booked Hotel");
           b10.setBackground(new Color(0,0,102));
           b10.setBounds(0,365,300,45);
           b10.setForeground(Color.WHITE);
           b10.setFont(new Font("Tahoma",Font.PLAIN,20));
           b10.setMargin(new Insets(0,0,0,70));
            b10.addActionListener(this);
           p2.add(b10);
           
           b11 = new JButton("Destinations");
           b11.setBackground(new Color(0,0,102));
           b11.setBounds(0,405,300,45);
           b11.setForeground(Color.WHITE);
           b11.setFont(new Font("Tahoma",Font.PLAIN,20));
           b11.setMargin(new Insets(0,0,0,125));
            b11.addActionListener(this);
           p2.add(b11);
           
            b12 = new JButton("Payments");
           b12.setBackground(new Color(0,0,102));
           b12.setBounds(0,445,300,45);
           b12.setForeground(Color.WHITE);
           b12.setFont(new Font("Tahoma",Font.PLAIN,20));
           b12.setMargin(new Insets(0,0,0,155));
            b12.addActionListener(this);
           p2.add(b12); 
           
           b13 = new JButton("Calculator");
           b13.setBackground(new Color(0,0,102));
           b13.setBounds(0,485,300,45);
           b13.setForeground(Color.WHITE);
           b13.setFont(new Font("Tahoma",Font.PLAIN,20));
           b13.setMargin(new Insets(0,0,0,145));
            b13.addActionListener(this);
           p2.add(b13); 
           
            b14 = new JButton("NotePad");
           b14.setBackground(new Color(0,0,102));
           b14.setBounds(0,525,300,45);
           b14.setForeground(Color.WHITE);
           b14.setFont(new Font("Tahoma",Font.PLAIN,20));
           b14.setMargin(new Insets(0,0,0,155));
            b14.addActionListener(this);
           p2.add(b14); 
           
           
           b15 = new JButton("About");
           b15.setBackground(new Color(0,0,102));
           b15.setBounds(0,565,300,45);
           b15.setForeground(Color.WHITE);
           b15.setFont(new Font("Tahoma",Font.PLAIN,20));
           b15.setMargin(new Insets(0,0,0,175));
            b15.addActionListener(this);
           p2.add(b15);
           
            b16 = new JButton("log out");
           b16.setBackground(new Color(0,0,102));
           b16.setBounds(0,605,300,45);
           b16.setForeground(Color.WHITE);
           b16.setFont(new Font("Tahoma",Font.PLAIN,20));
           b16.setMargin(new Insets(0,0,0,175));
            b16.addActionListener(this);
           p2.add(b16);
           
           
           
            ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
          Image i5 = i4.getImage().getScaledInstance(1400, 800, Image.SCALE_DEFAULT);
          ImageIcon i6 = new ImageIcon(i5);
          JLabel l3 = new JLabel(i6);
          l3.setBounds(0,0,1400,800);
          add(l3);
           
          
           JLabel l4 = new JLabel("Travel and Tourism Management System");
          l4.setBounds(400, 60, 1000, 60);
          l4.setForeground(Color.WHITE);
          l4.setFont(new Font("Raleway",Font.PLAIN,50));
          l3.add(l4);
           
           
           
           
           
           
         
        setVisible(true);
     }
    
     public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == b1)
        {
            new AddCustomer(username);
        }else if(e.getSource() == b3)
        {
            new ViewCustomer(username);
        }else if(e.getSource() == b2)
        {
            new UpdateCustomer(username);
        }else if(e.getSource() == b5)
        {
            new CheckPackage();
        }
        else if(e.getSource() == b6)
        {
            new BookPackage(username);
        }else if(e.getSource() == b7)
        {
             new ViewPackage(username);
        }else if(e.getSource() == b8)
        {
             new CheckHotels();
        }else if(e.getSource() == b11)
        {
             new Destinations();
        }else if(e.getSource() == b9)
        {
            new BookHotel(username);
        }else if(e.getSource() == b10)
        {
             new ViewBookedHotel(username);
        }else  if(e.getSource() == b12)
        {   
                new Payment();       
        }else  if(e.getSource() == b13)
        {   
               try{
                   Runtime.getRuntime().exec("calc.exe");
               }catch(Exception ae)
               {
                   ae.printStackTrace();
               }
        }else  if(e.getSource() == b14)
        {   
                try{
                   Runtime.getRuntime().exec("notepad.exe");
               }catch(Exception ae)
               {
                   ae.printStackTrace();
               }       
        }else  if(e.getSource() == b15)
        {   
                new About();       
        }else if(e.getSource() == b4)
        {
            new DeleteDetails(username);
        }else if(e.getSource() == b16)
        {
            setVisible(false);
            new Login();
        }
        
    }
    public static void main(String[] args)
    {
        new Dashboard("");
    }
    
}
