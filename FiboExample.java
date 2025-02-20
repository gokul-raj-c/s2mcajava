class FiboExample
{
public static void main(String args[])
{
int n=Integer.parseInt(args[0]);
int a=0;
int b=1;
int c=a+b;
System.out.println(a);
System.out.println(b);
while (c <= n) 
{
System.out.println(c);
a = b;
b = c;
c = a + b;
}
}
}
