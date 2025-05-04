class Student 
{
String name;
int age;
double grade;

Student() 
{
name = "Unknown";
age = 0;
grade = 0.0;
}

Student(String n) 
{
name = n;
age = 0;
grade = 0.0;
}

Student(String n, int a, double g) 
{
name = n;
age = a;
grade = g;
}

void display() {
System.out.println("Name: " +name);
System.out.println("Age: " +age);
System.out.println("Grade: " +grade);
}
}

class ConstructorOverloadEg
{
public static void main(String args[]) 
{
Student s1 = new Student();
s1.display();

Student s2 = new Student("Alice");
s2.display();

Student s3 = new Student("Bob", 20, 89.5);
s3.display();
}
}
