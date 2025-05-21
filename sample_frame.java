import java.awt.*;
class First
{
public void create()
{
Frame f=new Frame("New Frame");
f.setSize(300,300);
f.setVisible(true);
}
}
class sample_frame
{
public static void main(String args[])
{
First obj=new First();
obj.create();
}
}
