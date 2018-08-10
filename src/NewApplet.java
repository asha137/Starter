/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Nisha
 */
public class NewApplet extends Applet implements ActionListener {

    TextField t1,t2,t3;
    Button b1,b2,b3,b4;
    public void init() {
        setLayout(new GridLayout(5,2));
        setBackground(Color.BLUE);
        Label one=new Label("Enter first number");
        t1=new TextField();
        Label two=new Label("Enter second number");
        t2=new TextField();
        b1=new Button("add");
        b2=new Button("sub");
        b3=new Button("div");
        b4=new Button("mul");
        t3=new TextField();
        add(one);
        add(t1);
        add(two);
        add(t2);
        add(b1);
        b1.addActionListener(this);
        add(b2);
        b2.addActionListener(this);
        add(b3);
        b3.addActionListener(this);
        add(b4);
        b4.addActionListener(this);
        add(t3);
        t1.setBounds(8, 8,8, 8);
        t2.setBounds(12, 12, 8, 8);
        b1.setBounds(16, 16, 10, 10);
        b2.setBounds(16, 22, 10, 10);
        b3.setBounds(20, 22, 10, 10);
        b4.setBounds(20, 22, 10, 10);
        
    }
    public void paint(Graphics g)
    {  
    }
public void actionPerformed(ActionEvent e)
{
  int n1=Integer.parseInt(t1.getText());
  int n2=Integer.parseInt(t2.getText());
  int sum=0;
  if(e.getSource()==b1)
  {
      sum=n1+n2;
  t3.setText(String.valueOf(sum));
  }
  if(e.getSource()==b2)
  {
      sum=n1-n2;
  t3.setText(String.valueOf(sum));
  }
  if(e.getSource()==b3)
  {
      sum=n1/n2;
  t3.setText(String.valueOf(sum));
  }
 
  if(e.getSource()==b4)
  {
      sum=n1*n2;
  t3.setText(String.valueOf(sum));
  }
}
  
}
