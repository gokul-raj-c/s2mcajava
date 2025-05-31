import java.awt.*; 
import java.awt.event.*; 
class ShapeDrawer extends Frame implements ActionListener, ItemListener  
{ 
Choice shapeChoice; 
TextField input1, input2; 
Button drawButton; 
String shape = "Rectangle"; 
int val1 = 0, val2 = 0; 
public ShapeDrawer()  
{ 
setTitle("Shape Drawer"); 
setSize(500, 500); 
setLayout(null); 
Label shapeLabel = new Label("Select Shape:"); 
shapeLabel.setBounds(50, 50, 100, 20); 
add(shapeLabel); 
shapeChoice = new Choice(); 
shapeChoice.add("Rectangle"); 
shapeChoice.add("Circle"); 
shapeChoice.add("Square"); 
shapeChoice.add("Triangle"); 
shapeChoice.setBounds(160, 50, 100, 20); 
shapeChoice.addItemListener(this); 
add(shapeChoice); 
input1 = new TextField(); 
input1.setBounds(50, 90, 100, 20); 
add(input1); 
input2 = new TextField(); 
input2.setBounds(160, 90, 100, 20); 
add(input2); 
drawButton = new Button("Draw"); 
drawButton.setBounds(270, 90, 80, 20); 
drawButton.addActionListener(this); 
add(drawButton); 
setVisible(true); 
} 
public void itemStateChanged(ItemEvent e)  
{ 
shape = shapeChoice.getSelectedItem(); 
input1.setText(""); 
input2.setText(""); 
switch (shape) { 
case "Rectangle": 
case "Triangle": 
input1.setEnabled(true); 
input2.setEnabled(true); 
break; 
case "Square": 
case "Circle": 
input1.setEnabled(true); 
input2.setEnabled(false); 
break; 
} 
} 
public void actionPerformed(ActionEvent e)  
{ 
try  
{ 
val1 = Integer.parseInt(input1.getText()); 
if (input2.isEnabled())  
{ 
val2 = Integer.parseInt(input2.getText()); 
} 
repaint(); 
}  
catch (Exception ex) 
{ 
System.out.println("Invalid input");
} 
} 
public void paint(Graphics g)  
{ 
super.paint(g); 
g.setColor(Color.black); 
switch (shape) 
{ 
case "Rectangle": 
g.drawRect(100, 150, val1, val2); 
break; 
case "Circle": 
g.drawOval(100, 150, val1, val1); 
break; 
case "Square": 
g.drawRect(100, 150, val1, val1); 
break; 
case "Triangle": 
int[] xPoints = {100, 100 + val1 / 2, 100 + val1}; 
int[] yPoints = {150 + val2, 150, 150 + val2}; 
g.drawPolygon(xPoints, yPoints, 3); 
break; 
} 
} 
}

class DrawShape
{
public static void main(String[] args)  
{ 
new ShapeDrawer(); 
} 
} 