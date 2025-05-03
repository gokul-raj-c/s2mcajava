class TernaryCline
{
public static void main(String args[])
{
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int c=(a>b)?a:b;
System.out.println(a);
System.out.println(b);
System.out.println("largest is "+c);
}
}
