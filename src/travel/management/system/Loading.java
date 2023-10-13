package travel.management.system;

import java.awt.*;
import javax.swing.*;

public class Loading extends JFrame implements Runnable{
    Thread t;
    JProgressBar bar;
    String username;
    
    public void run()
    {
        try{
            for(int i=1; i <=101;i++)
            {
                int max = bar.getMaximum();
                int value = bar.getValue();
                
                if(value < max)
                {
                    bar.setValue(bar.getValue()+1);
                }
                else
                {
                    setVisible(false);
                    new Dashboard(username);
                }
                Thread.sleep(50);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    Loading(String username)
    {
        t = new Thread(this);
        this.username = username;
        setBounds(200,100,900,400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel l1 = new JLabel("Travel and Tourism Application");
        l1.setBounds(310,20,600,40);
        l1.setFont(new Font("Tahoma",Font.BOLD,14));
        l1.setForeground(Color.BLUE);
         add(l1);
        
         bar= new JProgressBar();
        bar.setBounds(300,60,300,35);
        bar.setStringPainted(true);
        
        add(bar);
        
        
        JLabel l2 = new JLabel("Loading, please wait....");
        l2.setBounds(300,100,150,30);
        l2.setFont(new Font("Tahoma",Font.BOLD,16));
        l2.setForeground(Color.RED);
         add(l2);
         
         
        JLabel l3 = new JLabel("Welcome "+username);
        l3.setBounds(20,310,400,40);
        l3.setFont(new Font("Tahoma",Font.BOLD,14));
        l3.setForeground(Color.RED);
         add(l3);
        
                
        t.start();
       setVisible(true);
    }
    
    public static void main(String[] args)
    {
        new Loading("");
    }
    
}
