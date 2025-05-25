import javax.swing.*;
public class SimpleFrm
{
SimpleFrm()
{
JFrame f=new JFrame("Swing Frame");//creating instance of JFrame
JButton b=new JButton("Submit");//creating instance of JButton
b.setBounds(130,100,100, 40);
f.add(b);//adding button in JFrame
f.setSize(400,500);//400 width and 500 height
f.setVisible(true);//making the frame visible
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String args[ ])
{
new SimpleFrm();
}
}
