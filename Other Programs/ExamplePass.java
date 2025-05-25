import javax.swing.*;
import java.awt.event.*;
public class ExamplePass implements ActionListener
{
JLabel label,l1,l2;
JPasswordField value;
JButton b;
JTextField text;
ExamplePass()
{
JFrame f=new JFrame("Password Field Example");
label = new JLabel();
label.setBounds(20,150, 200,50);
value = new JPasswordField();
value.setBounds(100,75,100,30);
l1=new JLabel("Username:");
l1.setBounds(20,20, 80,30);
l2=new JLabel("Password:");
l2.setBounds(20,75, 80,30);
b = new JButton("Login");
b.setBounds(100,120, 80,30);
text = new JTextField();
text.setBounds(100,20, 100,30);
f.add(l1);
f.add(value);
f.add(l2);
f.add(text);
f.add(b);
f.add(label);
f.setSize(400,400);
f.setVisible(true);
b.addActionListener(this);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent e)
{
String data = "Username " + text.getText();
data += ", Password: " + new String(value.getPassword());
label.setText(data);
}
public static void main(String args[ ])
{
new ExamplePass();
}
}
