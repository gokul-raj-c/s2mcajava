import java.util.*;
class Employee 
{ 
int eNo; 
String eName; 
double eSalary; 
Employee(int no, String name,double salary) 
{ 
eNo = no; 
eName = name; 
eSalary = salary; 
} 
void display() { 
System.out.println("Employee Number: " + eNo); 
System.out.println("Employee Name: " + eName); 
System.out.println("Employee Salary: " + eSalary); 
} 
} 
class EmployeeSearch 
{ 
public static void main(String[] args) 
{ 
Scanner sc = new Scanner(System.in); 
System.out.print("Enter number of employees"); 
int n = sc.nextInt(); 
sc.nextLine(); 
Employee e1[] = new Employee[n]; 
for (int i = 0; i < n; i++) 
{ 
System.out.print("Enter Employee Number"); 
int no=sc.nextInt(); 
sc.nextLine(); 
System.out.print("Enter Employee Name"); 
String name = sc.nextLine(); 
System.out.print("Enter Employee Salary"); 
double salary = sc.nextDouble(); 
e1[i] = new Employee(no, name, salary); 
} 
System.out.print("Enter Employee Number to Search"); 
int sNo = sc.nextInt(); 
int flag=0; 

for (int k = 0; k < n; k++) 
{
if (e1[k] != null && e1[k].eNo == sNo) 
{
flag=1;
System.out.println("Employee Found"); 
e1[k].display();
break;
}
}
if (flag==0) 
{ 
System.out.println("Employee not found"); 
} 
} 
}