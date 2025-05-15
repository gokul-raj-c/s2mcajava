import java.util.*;
class Person
{
String name;
String gender;
String address;
int age;
Person(String nm,String gn,String ad,int ag)
{
name=nm;
gender=gn;
address=ad;
age=ag;
}
}

class Employee extends Person
{
int empid;
String cname;
String qualfy;
int salary;
Employee(String nm,String gn,String ad,int ag,int eid,String cnm,String qf,int sf)
{
super(nm,gn,ad,ag);
empid=eid;
cname=cnm;
qualfy=qf;
salary=sf;
}
}

class Teacher extends Employee
{
int teachid;
String subject;
String dept;
Teacher(String nm,String gn,String ad,int ag,int eid,String cnm,String qf,int sf,int tid,String sub,String dep)
{
super(nm,gn,ad,ag,eid,cnm,qf,sf);
teachid=tid;
subject=sub;
dept=dep;
}
void displayDetails()
{
System.out.println("Person Name:"+name);
System.out.println("Person gender:"+gender);
System.out.println("Person Address:"+address);
System.out.println("Person Age:"+age);
System.out.println("Employee Id:"+empid);
System.out.println("Employee Company Name:"+cname);
System.out.println("Employee Qualification:"+qualfy);
System.out.println("Employee Salary:"+salary);
System.out.println("Teacher Id:"+teachid);
System.out.println("Teacher Subject:"+subject);
System.out.println("Teacher Department:"+dept);
}
}

class PersonEmployeeTeacherDetails
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
System.out.println("enter person name");
String pname=sc.nextLine();
System.out.println("enter person gender");
String pgen=sc.nextLine();
System.out.println("enter person address");
String padd=sc.nextLine();
System.out.println("enter person age");
int pae=sc.nextInt();
sc.nextLine();
System.out.println("enter employee id");
int ed=sc.nextInt();
sc.nextLine();
System.out.println("enter employee company name");
String ecname=sc.nextLine();
System.out.println("enter employee qualification");
String eqlf=sc.nextLine();
System.out.println("enter employee salary");
int esal=sc.nextInt();
sc.nextLine();
System.out.println("enter teacher id");
int td=sc.nextInt();
sc.nextLine();
System.out.println("enter teacher subject");
String tsub=sc.nextLine();
System.out.println("enter teacher department");
String tdep=sc.nextLine();
t1[i]=new Teacher(pname,pgen,padd,pae,ed,ecname,eqlf,esal,td,tsub,tdep);
}
System.out.println();
System.out.println("Details");
for(int i=0;i<n;i++)
{
t1[i].displayDetails();
System.out.println();
}
}
}
