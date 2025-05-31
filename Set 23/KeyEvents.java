import java.awt.*;
import java.awt.event.*;
class KeyEventExample extends Frame implements KeyListener 
{
Label l;
TextField tf;
KeyEventExample() 
{
setTitle("Key Event Example");
l = new Label("Press any key...");
l.setBounds(50, 100, 300, 20);
tf = new TextField();
tf.setBounds(50, 50, 200, 30);
tf.addKeyListener(this);  
add(tf);
add(l);
setSize(400, 200);
setLayout(null);
setVisible(true);
}
public void keyTyped(KeyEvent e) 
{
l.setText("Key Typed: " + e.getKeyChar());
}
public void keyPressed(KeyEvent e) 
{
l.setText("Key Pressed: " + e.getKeyChar());
}
public void keyReleased(KeyEvent e) 
{
l.setText("Key Released: " + e.getKeyChar());
}
}

class KeyEvents
{
public static void main(String args[]) 
{
new KeyEventExample();
}
}
