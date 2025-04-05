class Complex 
{
double real;
double imag;
Complex(double r, double i) 
{
real = r;
imag = i;
}

Complex add(Complex other) 
{
return new Complex(real + other.real, imag + other.imag);
}

void display() 
{
System.out.println(real + " + " + imag + "i");
}
}

public class ComplexAddition 
{
public static void main(String[] args) 
{
Complex c1 = new Complex(3.5, 2.5);
Complex c2 = new Complex(1.5, 4.5);
Complex sum = c1.add(c2);
System.out.print("Sum = ");
sum.display();
}
}
