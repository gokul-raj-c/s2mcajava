import java.io.*;
class Employee
{
int empno;
String empname;
int salary;
Employee(int r,String n,int s)
{
empno=r;
empname=n;
salary=s;
}
void display()
{
System.out.println("employee no: "+empno);
System.out.println("employee name: "+empname);
System.out.println("salary: "+salary);
}
}
class EmployeeDetails
{
public static void main(String args[]) throws IOException
{
DataInputStream x=new DataInputStream(System.in);
System.out.println("enter employee no");
int r=Integer.parseInt(x.readLine());
System.out.println("enter employee name");
String n=x.readLine();
System.out.println("enter employee salary");
int s=Integer.parseInt(x.readLine());
Employee e1=new Employee(r,n,s);
e1.display();
}
}
