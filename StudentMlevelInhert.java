import java.util.*;
class StudDetails
{
private int sno;
private String sname;
void SetStud(int no,String name)
{
sno = no;
sname = name;
}
void PutStud()
{
System.out.println("Student No : " + sno);
System.out.println("Student Name : " + sname);
}
}
class Marks extends StudDetails
{
protected int mark1,mark2,mark3;
public void SetMarks(int m1,int m2,int m3)
{
mark1 = m1;
mark2 = m2;
mark3 = m3;
}
public void PutMarks()
{
System.out.println("Mark1 : " + mark1);
System.out.println("Mark2 : " + mark2);
System.out.println("Mark3 : " + mark3);
}
}
class Total extends Marks
{
private int total;
void Calculate()
{
total = mark1 + mark2 + mark3;
}
public void PutTotal()
{
System.out.println("Total : " + total );
}
}
class StudentMlevelInhert
{
public static void main(String args[])
{
Total t1 = new Total();
Scanner sc=new Scanner(System.in);
System.out.println("enter student no");
int no=sc.nextInt();
sc.nextLine();
System.out.println("enter student name");
String nm=sc.nextLine();
System.out.println("enter mark1");
int mk1=sc.nextInt();
sc.nextLine();
System.out.println("enter mark2");
int mk2=sc.nextInt();
sc.nextLine();
System.out.println("enter mark3");
int mk3=sc.nextInt();
sc.nextLine();
System.out.println("Student Details");
t1.SetStud(no,nm);
t1.SetMarks(mk1,mk2,mk3);
t1.Calculate();
t1.PutStud();
t1.PutMarks();
t1.PutTotal();
}
}
