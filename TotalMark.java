class Student
{
int rollno;
String name;
int eng;
int math;
int total;
Student(int r,String s,int e,int m)
{
rollno=r;
name=s;
eng=e;
math=m;
}
void totalmark()
{
total=eng+math;
}
void display()
{
System.out.println("roll no: "+rollno);
System.out.println("name: "+name);
System.out.println("english mark: "+eng);
System.out.println("maths mark: "+math);
System.out.println("total mark: "+total);
}
}
class TotalMark
{
public static void main(String args[])
{
int r=Integer.parseInt(args[0]);
String s=args[1];
int e=Integer.parseInt(args[2]);
int m=Integer.parseInt(args[3]);
Student s1=new Student(r,s,e,m);
s1.totalmark();
s1.display();
}
}
