import java.io.*;
import java.util.*; 
class EvenOddSeparator 
{
public static void main(String args[]) 
{
try 
{
Scanner input = new Scanner(new java.io.File("numbers.txt"));
FileOutputStream evenOut = new FileOutputStream("even.txt");
FileOutputStream oddOut = new FileOutputStream("odd.txt");
while (input.hasNextInt()) 
{
int num = input.nextInt();
String data = num + "\r\n";
if (num % 2 == 0) 
{
evenOut.write(data.getBytes());
evenOut.flush();
} 
else 
{
oddOut.write(data.getBytes());
oddOut.flush();
}
}
input.close();
evenOut.close();
oddOut.close();
System.out.println("Even and odd numbers have been separated into 'even.txt' and 'odd.txt'.");
} 
catch (Exception e) 
{
System.out.println(e);
}
try 
{
System.out.println("\nContents of even.txt:");
FileInputStream finEven = new FileInputStream("even.txt");
int ch;
while ((ch = finEven.read()) != -1) 
{
System.out.print((char) ch);
}
finEven.close();
System.out.println("\nContents of odd.txt:");
FileInputStream finOdd = new FileInputStream("odd.txt");
while ((ch = finOdd.read()) != -1) 
{
System.out.print((char) ch);
}
finOdd.close();
} 
catch (Exception e)
{
System.out.println(e);
}
}
}
