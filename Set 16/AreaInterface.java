import java.util.*;

interface Shape {
	double area();
}

class Rectangle implements Shape {
	double length, width;

	Rectangle(double l, double w) {
    	length = l;
    	width = w;
	}

	public double area() {
    	return length * width;
	}
}


class Triangle implements Shape {
	double base, height;

	Triangle(double b, double h) {
    	base = b;
    	height = h;
	}

	public double area() {
    	return 0.5 * base * height;
	}
}


class Circle implements Shape {
	double radius;

	Circle(double r) {
    	radius = r;
	}

	public double area() {
    	return 3.14 * radius * radius;
	}
}

public class AreaInterface {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);


    	System.out.print("Enter length and width of rectangle: ");
    	double length = sc.nextDouble();
    	double width = sc.nextDouble();
    	Shape rect = new Rectangle(length, width);
    	System.out.println("Area of Rectangle: " + rect.area());


    	System.out.print("Enter base and height of triangle: ");
    	double base = sc.nextDouble();
    	double height = sc.nextDouble();
    	Shape tri = new Triangle(base, height);
    	System.out.println("Area of Triangle: " + tri.area());

 
    	System.out.print("Enter radius of circle: ");
    	double radius = sc.nextDouble();
    	Shape circ = new Circle(radius);
    	System.out.println("Area of Circle: " + circ.area());

    	sc.close();
	}
}
