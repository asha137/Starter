/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Nisha
 */
public class bubble extends Applet implements Runnable {
 Thread t;
 int x=0,y=0,p=0,q=0;
    public void init() {}
    public void paint(Graphics g)
    {
      g.drawOval(x,y,20, 20);
      g.drawOval(p, q,20,20);
      g.setColor(Color.red);
      g.fillOval(x, y, WIDTH, HEIGHT);
    }
 public void start() {
      t = new Thread(this);
      t.start();
   }
    @Override
    public void run() {
        try
      {
      for(;;)
       {
                for(;;)
            {
                 if(y == 120)
                     {
                      break;
                     }
    else if (x == 390)
        {
     x = 0;
     y = 0;
    repaint();
         }
                    else
                     {
                     y = y +3;
                      x = x +3;
                     Thread.sleep(100);
               repaint();
               }
                }
           for(;;)
              {
               if(y==0)
                   {
                        break;
                        }
               else if (x == 390)
           {
          x = 0;
          y = 0;
                 repaint();
    }
    else
                 {
        y = y-3;
               x = x +3;
               Thread.sleep(100);
                repaint();
               }
                } 
              run();
       }
        
    }
catch(InterruptedException e)
    {
    }
        try
      {
      for(;;)
       {
                for(;;)
            {
                 if(q== 170)
                     {
                      break;
                     }
    else if (p == 290)
        {
     p = 0;
     q = 0;
    repaint();
         }
                    else
                     {
                     q = q +3;
                      p = p +3;
                     Thread.sleep(100);
               repaint();
               }
                }
           for(;;)
              {
               if(q==0)
                   {
                        break;
                        }
               else if (p == 290)
           {
          p = 0;
          q = 0;
                 repaint();
    }
    else
                 {
        q = q-3;
               p = p +3;
               Thread.sleep(100);
                repaint();
               }
                } 
              run();
       }
        
    }
catch(InterruptedException d)
    {
    }
    }
}
