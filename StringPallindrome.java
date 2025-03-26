import java.io.*;
class StringPallindrome
{
public static void main(String args[]) throws IOException
{
DataInputStream x=new DataInputStream(System.in);
System.out.println("Enter a string");
String s1=x.readLine();
String s2="";
System.out.println("String:"+s1);
int l = s1.length();
for(int i=l-1;i>=0;i--)
{
s2=s2+s1.charAt(i);
}
System.out.println("Reversed String:"+s2);
if(s1.equals(s2))
{
System.out.println("pallindrome");
}
else
{
System.out.println("not pallindrome");
}
}
}
