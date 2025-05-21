import arithmetic.Add;
import arithmetic.Divide;
import arithmetic.Multiply;
import arithmetic.Subtract;
import java.util.*;

class ArithmeticOperations 
{
public static void main(String args[]) 
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter number 1");
double num1 = sc.nextDouble();
System.out.println("Enter number 1");
double num2 = sc.nextDouble();
Add a1 = new Add();
Subtract s1 = new Subtract();
Multiply m1 = new Multiply();
Divide d1 = new Divide();
System.out.println("Addition: " + a1.add(num1, num2));
System.out.println("Subtraction: " + s1.subtract(num1, num2));
System.out.println("Multiplication: " + m1.multiply(num1, num2));
       
try 
{
System.out.println("Division: " + d1.divide(num1, num2));
} 
catch (ArithmeticException e) 
{
System.out.println("Error: " + e.getMessage());
}
}
}
