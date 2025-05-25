import java.awt.*;
import java.awt.event.*;

class FindMax implements ActionListener 
{
Label lb1,lb2,lb3,lb4;
TextField txt1, txt2, txt3, result;
Button btn1;
FindMax()
{
Frame f=new Frame("max of three");
f.setSize(500, 500);
f.setVisible(true);
lb1 = new Label("Number 1");
lb2 = new Label("Number 2");
lb3 = new Label("Number 3");
lb4 = new Label("Result");
txt1 = new TextField(10);
txt2 = new TextField(10);
txt3 = new TextField(10);
result = new TextField(10);
result.setEditable(false);  // Optional: Prevent user editing
btn1 = new Button("Find Max");
lb1.setBounds(20, 50, 80, 20);
lb2.setBounds(20, 80, 80, 20);
lb3.setBounds(20, 110, 80, 20);
lb4.setBounds(20, 140, 80, 20);

txt1.setBounds(120, 50, 100, 20);
txt2.setBounds(120, 80, 100, 20);
txt3.setBounds(120, 110, 100, 20);
result.setBounds(120, 140, 100, 20);


btn1.setBounds(130,130,50,30);

f.add(lb1);
f.add(txt1);
f.add(lb2);
f.add(txt2);
f.add(lb3);
f.add(txt3);
f.add(lb4);
f.add(result);
f.add(btn1);

btn1.addActionListener(this);
}
public void actionPerformed(ActionEvent e) 
{
int a = Integer.parseInt(txt1.getText());
int b = Integer.parseInt(txt2.getText());
int c = Integer.parseInt(txt3.getText());
if(a>b && a>c)
{
int max=a;
result.setText(String.valueOf(max));
}
else if(b>c)
{
int max=b;
result.setText(String.valueOf(max));
}
else
{
int max=c;
result.setText(String.valueOf(max));
}
}
}


class MaxThree
{
public static void main(String args[]) 
{
new FindMax();
}
}

