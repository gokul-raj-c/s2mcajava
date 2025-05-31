import java.io.*;
import java.util.*; 
class File
{
public static void main(String args[])
{
try
{
Scanner obj = new Scanner(System.in);
FileOutputStream fout = new FileOutputStream("employee2.txt"); 
int empno;
String empname; 
int salary;
System.out.println("Enter the no of employees:"); 
int limit=obj.nextInt();
for(int j=0;j<limit;j++)
{
System.out.println("Enter the employee number:"); 
empno=obj.nextInt();
String a = String.valueOf(empno); 
byte a1[]=a.getBytes(); 
fout.write(a1);
fout.flush(); 
fout.write("\r\n".getBytes()); 
obj.nextLine();
System.out.println("Enter the employee name:"); 
empname=obj.nextLine();
byte b[]=empname.getBytes(); 
fout.write(b);
fout.flush(); 
fout.write("\r\n".getBytes());
System.out.println("Enter the employee salary:"); 
salary=obj.nextInt();
String c = String.valueOf(salary); 
byte c1[]=c.getBytes(); 
fout.write(c1);
fout.flush(); 
fout.write("\r\n".getBytes());
}
fout.close();
}
catch(Exception e)
{
 System.out.println(e);
}
try
{
FileInputStream fin = new FileInputStream("employee2.txt"); 
System.out.println("Total size is:" + fin.available());
int n =fin.available(); 
for(int i=0;i<n;i++)
{
System.out.print((char)fin.read());
}
fin.close();
}
catch(Exception e)
{
System.out.print(e);
}
}
}
