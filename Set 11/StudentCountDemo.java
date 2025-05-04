class Student 
{
int rollNo;
String name;
static int count = 0;
Student(int rollNo, String name) 
{
rollNo = rollNo;
name = name;
count++; 
}

void display() 
{
System.out.println("Roll No: " + rollNo);
System.out.println("Name: " + name);
}

static void displayCount() 
{
System.out.println("Total number of students: " + count);
}

}

class StudentCountDemo 
{
public static void main(String args[]) 
{
Student s1 = new Student(101, "Gokul");
Student s2 = new Student(102, "Abhijith");
Student s3 = new Student(103, "Ravi");

s1.display();
s2.display();
s3.display();

Student.displayCount();
}
}
