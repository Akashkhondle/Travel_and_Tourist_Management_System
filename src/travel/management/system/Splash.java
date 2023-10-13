
package travel.management.system;

import javax.swing.*;
import java.awt.*;
public class Splash extends JFrame implements Runnable{
    Thread thread;
    
      Splash(){
//          setSize(900,400);
//          setLocation(200,100);
          
          ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));
          Image i2 = i1.getImage().getScaledInstance(1000, 400, Image.SCALE_DEFAULT);
          ImageIcon i3 = new ImageIcon(i2);
          JLabel l1 = new JLabel(i3);
          add(l1);
          setVisible(true);
          thread =new Thread(this);
          thread.start();
          
    
}
    public void run()
    {
        try{
              Thread.sleep(7000);
              // new Login();
              setVisible(false);
              
          }catch (Exception e){}
    }
    
    public static void main(String[] args)
    {
      Splash frame=  new Splash();
      int x=1;
      for(int i=1; i <=400;x+=5,i+=4)
      {
          frame.setLocation(550-(x+i)/3,250-(i/3));
          frame.setSize(x+i,i);
          try{
              Thread.sleep(10);
              
          }catch (Exception e){}
      }
    }
    
}
