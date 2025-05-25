
import java.awt.*;
import java.awt.event.*;

class SwapNumbers implements ActionListener
{
Label lb1,lb2;
TextField txt1,txt2;
Button btn1;
Frame f;
SwapNumbers ()
{
f=new Frame("Number Swap");
f.setSize(500,500);
f.setVisible(true);
lb1 = new Label("Number 1");
lb2 = new Label("Number 2");

txt1 = new TextField(10);
txt2 = new TextField(10);

btn1 = new Button("Swap");
lb1.setBounds(20, 50, 80, 20);
txt1.setBounds(120, 50, 100, 20);
lb2.setBounds(20, 80, 80, 20);
txt2.setBounds(120, 80, 100, 20);

btn1.setBounds(140,140,50,30);

f.add(lb1);
f.add(txt1);
f.add(lb2);
f.add(txt2);
f.add(btn1);

btn1.addActionListener(this);

}
public void actionPerformed(ActionEvent ae)
{
int a,b;
a = Integer.parseInt(txt1.getText());
b = Integer.parseInt(txt2.getText());
if(ae.getSource()==btn1)
{
txt1.setText(String.valueOf(b));
txt2.setText(String.valueOf(a));
}

}
}
class SwapNumDemo
{
public static void main(String args[])
{
SwapNumbers obj = new SwapNumbers();
}
}
