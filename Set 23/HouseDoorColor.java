import java.awt.*;
import java.awt.event.*;

class MouseListenerExample extends Frame implements MouseListener 
{
Color doorColor = Color.BLUE;
public MouseListenerExample() 
{
setTitle("House with Mouse Events");
setSize(600, 400);
addMouseListener(this);
setVisible(true);
}

public void paint(Graphics g) 
{
super.paint(g);

// Draw sky
g.setColor(new Color(135, 206, 235));
g.fillRect(0, 0, getWidth(), getHeight());
// Draw ground
g.setColor(new Color(34, 139, 34));
g.fillRect(0, 300, getWidth(), 100);

// House base
g.setColor(new Color(210, 180, 140));
g.fillRect(100, 200, 200, 100);
g.setColor(Color.BLACK);
g.drawRect(100, 200, 200, 100);

// Roof
Polygon roof = new Polygon();
roof.addPoint(100, 200);
roof.addPoint(200, 120);
roof.addPoint(300, 200);
g.setColor(new Color(178, 34, 34));
g.fillPolygon(roof);
g.setColor(Color.BLACK);
g.drawPolygon(roof);

// Door with current color
g.setColor(doorColor);
g.fillRect(180, 250, 40, 50);
g.setColor(Color.BLACK);
g.drawRect(180, 250, 40, 50);

// Window
g.setColor(Color.WHITE);
g.fillRect(130, 220, 40, 40);
g.setColor(Color.BLACK);
g.drawRect(130, 220, 40, 40);
g.drawLine(130, 240, 170, 240);
g.drawLine(150, 220, 150, 260);
}

public void mouseClicked(MouseEvent e) 
{
// Toggle door color on click
if (doorColor == Color.BLUE) 
{
doorColor = Color.RED;
} 
else 
{
doorColor = Color.BLUE;
}
repaint();
}
public void mouseEntered(MouseEvent e) 
{}
public void mouseExited(MouseEvent e) 
{}
public void mousePressed(MouseEvent e) 
{}
public void mouseReleased(MouseEvent e) 
{}

}


class HouseDoorColor
{
public static void main(String args[]) 
{
new MouseListenerExample();
}
}
   