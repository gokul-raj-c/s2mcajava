import java.awt.*;
import java.awt.event.*;

class SimpleCalculator extends Frame implements ActionListener 
{
TextField tf;
double num1 = 0, num2 = 0, result = 0;
char operator;

SimpleCalculator() 
{
setLayout(null);
tf = new TextField();
tf.setBounds(30, 50, 240, 30);
add(tf);
String[] labels = {
"7", "8", "9", "/",
"4", "5", "6", "*",
"1", "2", "3", "-",
"0", "C", "=", "+"
};

int x = 30, y = 100;
for (int i = 0; i < labels.length; i++) 
{
Button b = new Button(labels[i]);
b.setBounds(x, y, 50, 50);
b.addActionListener(this);
add(b);

x += 60;
if ((i + 1) % 4 == 0) 
{
x = 30;
y += 60;
}
}

setTitle("Calculator");
setSize(320, 400);
setVisible(true);
}

public void actionPerformed(ActionEvent e) 
{
String cmd = e.getActionCommand();
if (cmd.charAt(0) >= '0' && cmd.charAt(0) <= '9' || cmd.equals(".")) 
{
tf.setText(tf.getText() + cmd);
} 
else if (cmd.equals("C")) 
{
tf.setText("");
num1 = num2 = result = 0;
} 
else if (cmd.equals("=")) 
{
num2 = Double.parseDouble(tf.getText());
switch (operator) 
{
case '+': 
result = num1 + num2; 
break;
case '-': 
result = num1 - num2; 
break;
case '*': 
result = num1 * num2; 
break;
case '/': 
if (num2 == 0) 
{
tf.setText("Error");
return;
}
result = num1 / num2;
break;
}
tf.setText("" + result);
} 
else 
{
num1 = Double.parseDouble(tf.getText());
operator = cmd.charAt(0);
tf.setText("");
}
}
}

class Calculator
{
public static void main(String args[]) 
{
new SimpleCalculator();
}
}
