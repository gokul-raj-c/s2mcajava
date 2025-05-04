class Outer 
{
static class Inner 
{
void display() 
{
System.out.println("This is a static inner class.");
}
}
}

class StaticInnerEg
{
public static void main(String args[]) 
{
Outer.Inner innerObj = new Outer.Inner();
innerObj.display();
}
}
