// Perform all arithmetic operations using AWT components
import java.awt.*;
import java.awt.event.*;
class Calculator1 implements ActionListener
{
Label lb1,lb2,lb3;
TextField txt1,txt2,txt3;
Button btn1,btn2,btn3,btn4,btn5,btn6;
Frame f;
Calculator1 ()
{
f=new Frame("Calculator");
f.setSize(500,500);
f.setVisible(true);
lb1 = new Label("Number 1");
lb2 = new Label("Number 2");
lb3 = new Label("Result");
txt1 = new TextField(10);
txt2 = new TextField(10);
txt3 = new TextField(10);
btn1 = new Button("Add");
btn2 = new Button("Sub");
btn3 = new Button("Multi");
btn4 = new Button("Div");
btn5 = new Button("Mod");
btn6 = new Button("Reset");
lb1.setBounds(20, 50, 80, 20);
txt1.setBounds(120, 50, 100, 20);
lb2.setBounds(20, 80, 80, 20);
txt2.setBounds(120, 80, 100, 20);
lb3.setBounds(20, 110, 80, 20);
txt3.setBounds(120, 110, 100, 20);
btn1.setBounds(20,140,50,30);
btn2.setBounds(80,140,50,30);
btn3.setBounds(140,140,50,30);
btn4.setBounds(200,140,50,30);
btn5.setBounds(260,140,50,30);
btn6.setBounds(300,140,50,30);
f.add(lb1);
f.add(txt1);
f.add(lb2);
f.add(txt2);
f.add(lb3);f.add(txt3);
f.add(btn1);
f.add(btn2);
f.add(btn3);
f.add(btn4);
f.add(btn5);
f.add(btn6);
btn1.addActionListener(this);
btn2.addActionListener(this);
btn3.addActionListener(this);
btn4.addActionListener(this);
btn5.addActionListener(this);
btn6.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
double a=0,b=0,c=0;
try
{
a = Double.parseDouble(txt1.getText());
}
catch (NumberFormatException e)
{
txt1.setText("Invalid input"); }
try
{
b = Double.parseDouble(txt2.getText());
}
catch (NumberFormatException e)
{
txt2.setText("Invalid input");
}
if(ae.getSource()==btn1)
{
c = a + b;
txt3.setText(String.valueOf(c));
}
else if(ae.getSource()==btn2)
{
c = a - b;
txt3.setText(String.valueOf(c));
}
else if(ae.getSource()==btn3)
{
c = a * b;
txt3.setText(String.valueOf(c));
}
else if(ae.getSource()==btn4)
{
c = a / b;
txt3.setText(String.valueOf(c));
}
else if(ae.getSource()==btn5)
{
c = a % b;
txt3.setText(String.valueOf(c));
}
else //if(ae.getSource()==btn6)
{
txt1.setText("0");
txt2.setText("0");
txt3.setText("0");
System.exit(0);
}
}
}
class ButtonDemo3
{
public static void main(String args[])
{
Calculator1 obj = new Calculator1();
}
}
