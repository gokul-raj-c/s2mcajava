import java.awt.*;
import java.awt.event.*;

class WindowListenerExample extends Frame implements WindowListener 
{
Label l;
WindowListenerExample() 
{
setTitle("Window Listener Example");
l = new Label("Perform a window action");
l.setBounds(50, 100, 300, 20);
add(l);
setSize(400, 300);
setLayout(null);
setVisible(true);
addWindowListener(this);
}
public void windowOpened(WindowEvent e)  
{ 
System.out.println("Window Opened"); 
} 
public void windowClosing(WindowEvent e)  
{ 
System.out.println("Window Closing"); 
dispose(); 
} 
public void windowClosed(WindowEvent e)  
{ 
System.out.println("Window Closed"); 
} 
public void windowIconified(WindowEvent e)  
{ 
System.out.println("Window Minimized"); 
} 
public void windowDeiconified(WindowEvent e)  
{ 
System.out.println("Window Restored"); 
} 
public void windowActivated(WindowEvent e)  
{ 
System.out.println("Window Activated"); 
}
public void windowDeactivated(WindowEvent e)  
{ 
System.out.println("Window Deactivated"); 
} 
}

class WindowEvents
{
public static void main(String args[]) 
{
new WindowListenerExample();
}
}
