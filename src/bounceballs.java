
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

class balls

{
  int x,y,p,q,radius,dx,dy;
  Color BallColor; 

 public balls(int x,int y,int radius,int dx,int dy,Color bColor)
 {
  this.x=x;
  this.y=y;
  this.radius=radius;
  this.dx=dx;
  this.dy=dy;
  BallColor=bColor;
 }

}

public class bounceballs extends Applet implements Runnable{
balls redBall,blackBall,greenBall,blueBall,pinkBall,CYANBall,ORANGEBall,orangeBall,MAGENTABall,
    yellowBall;

  public void init()
  {
    CYANBall=new balls(400,150,20,5,6,Color.CYAN);
     ORANGEBall=new balls(360,140,21,6,6,Color.ORANGE);
     orangeBall=new balls(320,130,22,8,6,Color.orange);
     MAGENTABall=new balls(280,120,23,6,8,Color.MAGENTA);
     yellowBall=new balls(240,110,24,7,6,Color.yellow);
     blueBall=new balls(200,100,25,4,6,Color.blue);
     pinkBall=new balls(160,90,26,8,4,Color.pink);
    redBall=new balls(120,80,27,2,4,Color.red);
    blackBall=new balls(80,70,28,4,2,Color.black);
    greenBall=new balls(40,60,29,6,2,Color.green);

    Thread t=new Thread(this);
    t.start();
  }

 public void paint(Graphics g)

 {
     g.setColor(CYANBall.BallColor);
    g.fillOval(CYANBall.x, CYANBall.y, CYANBall.radius, CYANBall.radius);
    
    g.setColor(ORANGEBall.BallColor);
    g.fillOval(ORANGEBall.x, ORANGEBall.y, ORANGEBall.radius, ORANGEBall.radius);
    
    g.setColor(orangeBall.BallColor);
    g.fillOval(orangeBall.x, orangeBall.y, orangeBall.radius, orangeBall.radius);
    
    g.setColor(MAGENTABall.BallColor);
    g.fillOval(MAGENTABall.x, MAGENTABall.y, MAGENTABall.radius,MAGENTABall.radius);
    
    g.setColor(yellowBall.BallColor);
    g.fillOval(yellowBall.x, yellowBall.y, yellowBall.radius, yellowBall.radius);

      g.setColor(blueBall.BallColor);
    g.fillOval(blueBall.x, blueBall.y, blueBall.radius, blueBall.radius);
    
     g.setColor(pinkBall.BallColor);
    g.fillOval(pinkBall.x, pinkBall.y, pinkBall.radius, pinkBall.radius);
    
    g.setColor(redBall.BallColor);
    g.fillOval(redBall.x, redBall.y, redBall.radius, redBall.radius);
    
    g.setColor(blackBall.BallColor);
    g.fillOval(blackBall.x, blackBall.y, blackBall.radius, blackBall.radius);
    
     g.setColor(greenBall.BallColor);
    g.fillOval(greenBall.x, greenBall.y, greenBall.radius, greenBall.radius);
 }
  public void run()
 {
    while(true)
  {
      try
      {
          displacementOperation(CYANBall);
          displacementOperation(ORANGEBall);
          displacementOperation(orangeBall);
          displacementOperation(MAGENTABall);
          displacementOperation(yellowBall);
          displacementOperation(blueBall);
          displacementOperation(pinkBall);
          displacementOperation(redBall);
          displacementOperation(blackBall);
          displacementOperation(greenBall);
           Thread.sleep(20);
           repaint();

        }

    catch(Exception e){}

    }

  }

//This method checks the boundary condition of ball movement

public void displacementOperation(balls ball)

 {

  if(ball.y >= 400 || ball.y <= 0)
  {
    ball.dy=-ball.dy;
  }
  if(ball.x >= 500 || ball.x <= 0)

  {
    ball.dx=-ball.dx;
  }
   ball.y=ball.y-ball.dy;
   ball.x=ball.x-ball.dx;
}

}
