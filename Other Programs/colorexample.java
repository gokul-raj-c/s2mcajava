//Handling color class
import java.awt.*;
public class colorexample extends Frame {
Color c1;
public colorexample ()
{
setVisible(true);
setSize(300, 300);
setBackground(Color.YELLOW);
c1=new Color(190,120,40);
}
public void paint(Graphics g)
{
g.setColor(Color.RED);
g.drawString("Welcome",50,50);
g.setColor(c1);
g.drawLine(20,30,20,300);
g.drawRect(50, 60, 50, 20);
g.drawRoundRect(50, 90, 50, 20, 10, 10);
g.fillRect(50, 120, 50, 20);
g.fillRoundRect(50, 150, 50, 20, 10, 10);
}
public static void main(String[] args)
{
new colorexample();
}
}
