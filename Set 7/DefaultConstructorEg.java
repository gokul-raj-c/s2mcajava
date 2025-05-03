class Rectangle
{
int length;
int breadth;
Rectangle()
{
length=10;
breadth=20;
}
void display()
{
System.out.println("length: "+length);
System.out.println("breadth: "+breadth);
}
}
class DefaultConstructorEg
{
public static void main(String args[])
{
Rectangle r1=new Rectangle();
r1.display();
}
}
