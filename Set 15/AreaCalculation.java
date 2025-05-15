import java.util.*;
import java.math.*;
class Area
{
void findArea(int r)
{
double area1=3.14*r*r;
System.out.println("Area of circle:"+area1);
}
void findArea(int l,int b)
{
int area2=l*b;
System.out.println("Area of Rectangle:"+area2);
}
void findArea(int x,int y,int z)
{
float s=(float)(x+y+z)/2;
float area=s*(s-x)*(s-y)*(s-z);
double area3=Math.sqrt(area);
System.out.println(s);
System.out.println("Area of Triangle:"+area3);
}
}

class AreaCalculation
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Area a1=new Area();
System.out.println("enter radius of circle");
int rd=sc.nextInt();
sc.nextLine();
a1.findArea(rd);
System.out.println("enter length of rectangle");
int lh=sc.nextInt();
sc.nextLine();
System.out.println("enter breadth of rectangle");
int bh=sc.nextInt();
sc.nextLine();
a1.findArea(lh,bh);
System.out.println("enter side1 of triangle");
int s1=sc.nextInt();
sc.nextLine();
System.out.println("enter side2 of triangle");
int s2=sc.nextInt();
sc.nextLine();
System.out.println("enter side3 of triangle");
int s3=sc.nextInt();
sc.nextLine();
a1.findArea(s1,s2,s3);
}
}
