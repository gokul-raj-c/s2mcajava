import java.util.*;
class Person
{
String name;
int age;
Person(String nm,int a)
{
name=nm;
age=a;
}
}

class Employee extends Person
{
int salary;
Employee(String nm,int a,int s)
{
super(nm,a);
salary=s;
}
void display()
{
System.out.println("Name: "+name);
System.out.println("Age: "+age);
System.out.println("Salary: "+salary);
}
}

class PersonDetailsCons
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
Employee e1=new Employee(nm,ag,sa);
System.out.println("Person Details");
e1.display();
}
}
