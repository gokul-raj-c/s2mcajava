import java.awt.*;
import javax.swing.*;
public class Shapes extends JFrame
{
Shapes()
{
setSize(400, 350);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
public void paint(Graphics g) 
{
g.setColor(Color.RED);
g.drawLine(60, 150, 100, 50);
g.drawLine(140, 150, 100, 50);
g.drawOval(60, 145, 80, 10);

g.setColor(Color.BLUE);
g.drawOval(200, 50, 80, 20);
g.drawLine(200, 60, 200, 130);
g.drawLine(280, 60, 280, 130);
g.drawOval(200, 120, 80, 20);

g.setColor(Color.GREEN);
g.drawOval(60, 200, 80, 80);
g.drawRect(75, 215, 50, 50);

g.setColor(Color.MAGENTA);
g.drawRoundRect(200, 200, 80, 80, 20, 20);
g.drawOval(215, 215, 50, 50);
}

public static void main(String args[]) 
{
new Shapes();      
}
}
