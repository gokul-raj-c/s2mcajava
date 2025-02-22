class LargestNumber
{
public static void main(String args[])
{
int num1=Integer.parseInt(args[0]);
int num2=Integer.parseInt(args[1]);
int num3=Integer.parseInt(args[2]);
if(num1>num2)
{
if(num1>num3)
{
System.out.println(num1+" is largest");
}
else
{
System.out.println(num3+" is largest");
}
}
else
{
if(num2>num3)
{
System.out.println(num2+" is largest");
}
else
{
System.out.println(num3+" is largest");
}
}
}
}
