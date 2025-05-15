import java.util.*;
class Employee
{
int empid;
String name;
int salary;
String address;
Employee(int id,String nm,int s,String ad)
{
empid=id;
name=nm;
salary=s;
address=ad;
}
}

class Teacher extends Employee
{
String dept;
String sub;
Teacher(int id,String nm,int s,String ad,String dp,String sb)
{
super(id,nm,s,ad);
dept=dp;
sub=sb;
}
void displayDetails()
{
System.out.println("Employee Id:"+empid);
System.out.println("Employee Name:"+name);
System.out.println("Employee Salary:"+salary);
System.out.println("Employee Address:"+address);
System.out.println("Teacher Department:"+dept);
System.out.println("Teacehr Subject:"+sub);
System.out.println();
}
}

class EmployeeTeacherDetails
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter no of values");
int n=sc.nextInt();
sc.nextLine();
Teacher t1[]=new Teacher[n];
for(int i=0;i<n;i++)
{
System.out.println("enter employee id");
int eid=sc.nextInt();
sc.nextLine();
System.out.println("enter employee name");
String ename=sc.nextLine();
System.out.println("enter employee salary");
int esal=sc.nextInt();
sc.nextLine();
System.out.println("enter employee address");
String eadd=sc.nextLine();
System.out.println("enter teacher department");
String edep=sc.nextLine();
System.out.println("enter teacher subject");
String esub=sc.nextLine();
t1[i]=new Teacher(eid,ename,esal,eadd,edep,esub);
}
System.out.println();
System.out.println("Employee Details");
for(int i=0;i<n;i++)
{
t1[i].displayDetails();
}
}
}

