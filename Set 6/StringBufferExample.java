import java.io.*;
class StringBufferExample
{
public static void main(String args[]) throws IOException
{
DataInputStream d = new DataInputStream(System.in);
System.out.println("Enter a string:");
String str = (d.readLine());
StringBuffer s = new StringBuffer(str);
System.out.println("Capacity is "+s.capacity());
s.reverse();
String s2 = s.toString().toUpperCase();
StringBuffer ss = new StringBuffer(s2);
System.out.println("After resversing and converting to uppercase: "+ss);
System.out.println("Enter a string to append:");
String s1 = (d.readLine());
System.out.println("New String: "+ss.append(s1));
}
}
