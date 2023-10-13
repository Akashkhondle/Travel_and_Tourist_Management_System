
package travel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Payment extends JFrame implements ActionListener{
    JButton b1,b2;
    
    Payment(){
        
        setBounds(350,80,750,550);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/paytm.jpeg"));
          Image i2 = i1.getImage().getScaledInstance(750,550,Image.SCALE_DEFAULT);
          ImageIcon i3 = new ImageIcon(i2);
          JLabel l1 = new JLabel(i3);
          l1.setBounds(0,0,750,550);
          add(l1);
        
           b1 = new JButton("Pay");
           b1.setBounds(400,0,80,40);
          b1.addActionListener(this);
           l1.add(b1);
           
           b2 = new JButton("Back");
           b2.setBounds(500,0,80,40);
           b2.addActionListener(this);
           l1.add(b2);
           
           
        setVisible(true);
        
    }
    
      public void actionPerformed(ActionEvent e)
    {
        
        if(e.getSource() == b1)
        {
              setVisible(false);
                new Paytm();
            
        }else
        {
              setVisible(false);
        }
    }
    public static void main(String[] args)
    {
        new Payment();
    }
}
