import java.io.*;
class StringOperations
{
public static void main(String args[]) throws IOException
{
DataInputStream x=new DataInputStream(System.in);
System.out.println("1.Length of string");
System.out.println("Enter a string");
String s=x.readLine();
System.out.println("string is: "+s);
System.out.println("length of string is: "+s.length());
System.out.println();

System.out.println("2.Character At Position");
System.out.println("Character at second position: "+s.charAt(1));
System.out.println("Character at fourth position: "+s.charAt(3));
System.out.println();

System.out.println("3.Substring Using Start Index");
System.out.println("Enter start index");
int st=Integer.parseInt(x.readLine());
System.out.println("Substring from start index: "+s.substring(st));
System.out.println();

System.out.println("4.Substring Using Start and End Index");
System.out.println("Enter start index");
int st1=Integer.parseInt(x.readLine());
System.out.println("Enter end index");
int ed=Integer.parseInt(x.readLine());
System.out.println("Substring from start to end index: "+s.substring(st1,ed));
System.out.println();

System.out.println("5.Compare Strings");
System.out.println("Enter a new string1");
String s8=x.readLine();
System.out.println("Enter a new string2");
String s9=x.readLine();
if(s8.equals(s9))
{
System.out.println("String equal");
}
else
{
System.out.println("String not equal");
}
System.out.println();

System.out.println("6.Compare Strings");
System.out.println("Enter a new string1");
String s10=x.readLine();
System.out.println("Enter a new string2");
String s11=x.readLine();
if(s10.equalsIgnoreCase(s11))
{
System.out.println("String equal");
}
else
{
System.out.println("String not equal");
}
System.out.println();

System.out.println("7.Concatenate Strings");
System.out.println("Enter a new string1");
String s1=x.readLine();
System.out.println("Enter a new string2");
String s2=x.readLine();
System.out.println("After Concatenate: "+s1.concat(s2));
System.out.println();

System.out.println("8.Character Replace");
System.out.println("Enter a new string");
String s3=x.readLine();
System.out.println("Enter a character to replace");
char ch1=(x.readLine().charAt(0));
System.out.println("Enter new character");
char ch2=(x.readLine().charAt(0));
System.out.println("After Replace: "+s3.replace(ch1,ch2));
System.out.println();

System.out.println("9.Start With a String");
System.out.println("Enter a new string");
String s4=x.readLine();
System.out.println("Enter start string");
String s5=x.readLine();
if(s4.startsWith(s5))
{
System.out.println("String start with "+s5);
}
else
{
System.out.println("String not start with "+s5);
}
System.out.println();

System.out.println("10.Uppercase");
System.out.println("Enter a new string");
String s6=x.readLine();
System.out.println("Uppercase: "+s6.toUpperCase());
System.out.println();

System.out.println("11.Lowercase");
System.out.println("Enter a new string");
String s7=x.readLine();
System.out.println("Lowercase: "+s7.toLowerCase());
}
}



















