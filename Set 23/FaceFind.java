import java.awt.*;
import java.awt.event.*;

class FindPercentage extends Frame implements ActionListener 
{
TextField t1,t2,t3,t4,t5,t6;
Button b1;
Label l1,l2,l3,l4,l5,l6;
double percentage = -1;
FindPercentage()
{
setTitle("Percentage Calculator with Face");
setSize(600, 600);
setVisible(true);
setLayout(null); 

l1=new Label("enter mark 1");
l2=new Label("enter mark 2");
l3=new Label("enter mark 3");
l4=new Label("enter mark 4");
l5=new Label("enter mark 5");
l6=new Label("percentage");
t1 = new TextField(10);
t2 = new TextField(10);
t3 = new TextField(10);
t4 = new TextField(10);
t5 = new TextField(10);
t6 = new TextField(10);
t6.setEditable(false);
b1 = new Button("Calculate");

l1.setBounds(20,50,80,20);
l2.setBounds(20,80,80,20);
l3.setBounds(20,110,80,20);
l4.setBounds(20,140,80,20);
l5.setBounds(20,170,80,20);
l6.setBounds(20,200,80,20);

t1.setBounds(120,50,100,20);
t2.setBounds(120,80,100,20);
t3.setBounds(120,110,100,20);
t4.setBounds(120,140,100,20);
t5.setBounds(120,170,100,20);
t6.setBounds(120,200,100,20);

b1.setBounds(250,250,50,30);

add(l1);
add(l2);
add(l3);
add(l4);
add(l5);
add(l6);

add(t1);
add(t2);
add(t3);
add(t4);
add(t5);
add(t6);
 
add(b1);
b1.addActionListener(this);
}

public void paint(Graphics g) 
{
super.paint(g);
if (percentage == -1) return;  
int x = 250, y = 350, size = 100;
g.drawOval(x, y, size, size);      
g.fillOval(x + 25, y + 30, 15, 15);
g.fillOval(x + 60, y + 30, 15, 15);
if (percentage > 50) 
{
g.drawArc(x + 25, y + 50, 50, 30, 180, 180);
} 
else 
{
g.drawArc(x + 25, y + 70, 50, 30, 0, 180);
}
}

public void actionPerformed(ActionEvent ae) 
{
int a,b,c,d,e,total;
a = Integer.parseInt(t1.getText());
b = Integer.parseInt(t2.getText());
c = Integer.parseInt(t3.getText());
d = Integer.parseInt(t4.getText());
e = Integer.parseInt(t5.getText());
total=a+b+c+d+e;
percentage = total / 5.0;
t6.setText(String.valueOf(percentage));
repaint();
}


}

class FaceFind
{
public static void main(String args[]) 
{
new FindPercentage();
}
}
        