import java.util.*;
import shape.Circle;
import shape.Rectangle;
import shape.Square;
import shape.Triangle;

class ShapeAreas
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Square s=new Square();
Circle c=new Circle();
Rectangle r=new Rectangle();
Triangle t=new Triangle();
System.out.println("enter side of square");
int a=sc.nextInt();
sc.nextLine();
System.out.println("area of square: "+s.findArea(a));
System.out.println("enter length of rectangle");
int l=sc.nextInt();
sc.nextLine();
System.out.println("enter breadth of rectangle");
int b=sc.nextInt();
sc.nextLine();
System.out.println("area of rectangle: "+r.findArea(l,b));
System.out.println("enter radius of circle");
int rd=sc.nextInt();
sc.nextLine();
System.out.println("area of circle: "+c.findArea(rd));
System.out.println("enter side1 of triangle");
int s1=sc.nextInt();
sc.nextLine();
System.out.println("enter side2 of triangle");
int s2=sc.nextInt();
sc.nextLine();
System.out.println("enter side3 of triangle");
int s3=sc.nextInt();
sc.nextLine();
System.out.println("area of triangle: "+t.findArea(s1,s2,s3));
}
}

