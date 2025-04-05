import java.io.*;
class Student
{
int rollno;
String name;
void insert(int r,String s)
{
rollno=r;
name=s;
}
void display()
{
System.out.println("roll no:"+rollno);
System.out.println("name:"+name);
}
}
class StudentExample
{
public static void main(String args[]) throws IOException
{
DataInputStream x= new DataInputStream(System.in);
Student s1=new Student();
System.out.println("Enter rollno");
int n=Integer.parseInt(x.readLine());
System.out.println("Enter name");
String s=x.readLine();
s1.insert(n,s);
s1.display();
}
}

