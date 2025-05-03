import java.util.*;
class Employee
{
int empid;
String empname;
float b_salary,g_salary,hra,da;

Employee(int i,String n,float b)
{
empid=i;
empname=n;
b_salary=b;
}

void calculate()
{
hra=(b_salary*5)/100;
da=(b_salary*5)/10;
g_salary=b_salary+hra+da;
}

void display()
{
System.out.println("Employee Id: "+empid);
System.out.println("Employee Name: "+empname);
System.out.println("Gross Salary: "+g_salary);
}

}
class EmployeeSalary
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Employee e1[]=new Employee[5];
int id;
String name;
float salary;
System.out.println("Enter no of Employees:");
int n=sc.nextInt();
for(int i=0;i<n;i++)
{
System.out.println("Enter Employee Id:");
id=sc.nextInt();
sc.nextLine(); //skip the newline character
System.out.println("Enter Employee Name:");
name=sc.nextLine();
System.out.println("Enter Basic Salary:");
salary=sc.nextFloat();
e1[i]=new Employee(id,name,salary);
e1[i].calculate();
System.out.println();
}
System.out.println("Employee Details:");
for(int i=0;i<n;i++)
{
e1[i].display();
System.out.println();
}
}
}
