import java.util.*;
class Person
{
String name;
int age;
void setPerson(String nm,int a)
{
name=nm;
age=a;
}
void display1()
{
System.out.println("Name: "+name);
System.out.println("Age: "+age);
}
}

class Employee extends Person
{
int salary;
void setSalary(int s)
{
salary=s;
}
void display2()
{
System.out.println("Name: "+name);
System.out.println("Age: "+age);
System.out.println("Salary: "+salary);
}
}

class PersonDetails
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter person name");
String nm=sc.nextLine();
System.out.println("enter person age");
int ag=sc.nextInt();
sc.nextLine();
System.out.println("enter person salary");
int sa=sc.nextInt();
sc.nextLine();
Person p1=new Person();
p1.setPerson(nm,ag);
Employee e1=new Employee();
e1.setSalary(sa);
System.out.println("Person Details");
p1.display1();
e1.display1();
e1.display2();
}
}
