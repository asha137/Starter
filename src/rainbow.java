import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class rainbow extends Applet implements Runnable{
    public void init() {
    Thread t=new Thread(this);
    t.start();
    
    }
    
    public void paint(Graphics g)
    {
    g.drawOval(60, 50, 200, 200);
    g.setColor(Color.red);
    g.fillOval(60, 50, 200, 200);
    
    g.drawOval(85, 85, 150, 150);
    g.setColor(Color.CYAN);
    g.fillOval(85, 85, 150, 150);
    
    g.drawOval(105, 100, 100, 100);
    g.setColor(Color.ORANGE);
    g.fillOval(105, 100, 100, 100);
    
    g.drawOval(120, 110, 50, 50);
    g.setColor(Color.YELLOW);
    g.fillOval(120, 110, 50, 50);
    
    } 

    @Override
    public void run() {
        try{    }
        catch(Exception e)
                {}
    }
}
