class StringReverse
{
public static void main(String args[])
{
String s1="gokul";
System.out.println("String is:"+s1);
int l = s1.length();
System.out.println("Reversed String");
for(int i=l-1;i>=0;i--)
{
System.out.print(s1.charAt(i));
}
System.out.println();
}
}
