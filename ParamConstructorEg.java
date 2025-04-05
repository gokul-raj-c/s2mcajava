class Student
{
int rollno;
String name;
Student(int r,String s)
{
rollno=r;
name=s;
}
void display()
{
System.out.println("roll no:"+rollno);
System.out.println("name:"+name);
}
}
class ParamConstructorEg
{
public static void main(String args[])
{
Student s1=new Student(29,"gokul");
s1.display();
}
}

