class Employee
{
int id;
String name;
int b_salary;
Employee(int i,String n,int s)
{
id=i;
name=n;
b_salary=s;
}
void calculateSalary()
{
System.out.println("Employee Details");
System.out.println("Id:"+id);
System.out.println("Name:"+name);
System.out.println("Salary:"+b_salary);
}
}

class Manager extends Employee
{
Manager(int i,String n,int s)
{
super(i,n,s);
}
void calculateSalary()
{
super.calculateSalary();
System.out.println("Manager Details");
System.out.println("Id:"+id);
System.out.println("Name:"+name);
System.out.println("Salary:"+b_salary);
}
}

class Programmer extends Employee
{
Programmer(int i,String n,int s)
{
super(i,n,s);
}
void calculateSalary()
{
super.calculateSalary();
System.out.println("Programmer Details");
System.out.println("Id:"+id);
System.out.println("Name:"+name);
System.out.println("Salary:"+b_salary);
}
}


class SalaryOverrideSuper
{
public static void main(String args[])
{
    Manager m = new Manager(1,"gokul",50000);
    Programmer p = new Programmer(2,"abhijith",30000);
    m.calculateSalary();
    p.calculateSalary();
}
}
