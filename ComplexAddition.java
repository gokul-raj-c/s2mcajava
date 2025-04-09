import java.io.*;
class Complex 
{
int real;
int imag;
Complex(int r,int i) 
{
real = r;
imag = i;
}

void addNumber(Complex other) 
{
int real1;
int imag1;
real1=real+other.real;
imag1=imag+other.imag;
System.out.println(real1 + " + " + imag1 + "i");
}

void display() 
{
System.out.println(real + " + " + imag + "i");
}
}

public class ComplexAddition 
{
public static void main(String args[]) throws IOException
{
int a1,a2,b1,b2;
DataInputStream x=new DataInputStream(System.in);
System.out.println("Complex number 1");
System.out.println("Enter complex parts:");
a1= Integer.parseInt(x.readLine());
System.out.println("Enter imaginary parts:");
b1= Integer.parseInt(x.readLine());
Complex c1=new Complex(a1,b1);
System.out.println("Complex number 2");
System.out.println("Enter complex parts:");
a2= Integer.parseInt(x.readLine());
System.out.println("Enter imaginary parts:");
b2= Integer.parseInt(x.readLine());
Complex c2=new Complex(a2,b2);

System.out.println("Complex number 1");
c1.display();
System.out.println("Complex number 2");
c2.display();
System.out.println("Complex number addition");
c1.addNumber(c2);
}
}
