// Base Class
class A
{
int num1,num2;
A( int a, int b)
{
num1=a;
num2=b;
}
void show()
{
System.out.println("Number1="+num1);
System.out.println("Number2="+num2);
}
}
//Derived class
class B extends A
{
int num3;
B(int a, int b, int c)
{
super(a,b);
num3=c;
}
void show()
{
super.show();
System.out.println("Number3="+num3);
}
}
class MethodOverrideEg2
{
public static void main(String args[])
{
B ob=new B(10,20,30);
ob.show();
}
}
