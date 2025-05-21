import java.util.*;
interface Shape 
{
double area();
double perimeter();
}

class Circle implements Shape 
{
private double radius;
Circle(double radius) 
{
this.radius = radius;
}

public double area() 
{
return Math.PI * radius * radius;
}
public double perimeter() 
{
return 2 * 3.12 * radius;
}
}

class Rectangle implements Shape 
{
private double length, width;
Rectangle(double length, double width) 
{
this.length = length;
this.width = width;
}
public double area() 
{
return length * width;
}
public double perimeter() 
{
return 2 * (length + width);
}
}

class AreaPerimeter 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
int ch;
do 
{
System.out.println("\nMenu:\n1.Circle\n2.Rectangle\n3.Exit");
System.out.print("Enter your choice: ");
ch=sc.nextInt();
switch(ch) 
{
case 1:
System.out.print("Enter radius of circle: ");
double r = sc.nextDouble();
Circle circle = new Circle(r);
System.out.printf("Area of Circle: %.2f\n", circle.area());
System.out.printf("Perimeter of Circle: %.2f\n", circle.perimeter());
break;
case 2:
System.out.print("Enter length of rectangle: ");
double length = sc.nextDouble();
System.out.print("Enter width of rectangle: ");
double width = sc.nextDouble();
Rectangle rectangle = new Rectangle(length, width);
System.out.printf("Area of Rectangle: %.2f\n", rectangle.area());
System.out.printf("Perimeter of Rectangle: %.2f\n", rectangle.perimeter());
break;
case 3:
System.out.println("User exit");
break;
default:
System.out.println("Invalid choice! Try again.");
}
} 
while(ch != 3);
}
}
