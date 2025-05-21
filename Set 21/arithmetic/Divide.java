package arithmetic;
public class Divide 
{
public double divide(double a, double b) 
{
if (b == 0) 
{
throw new ArithmeticException("Cannot divide by zero.");
}
return a / b;
}
}
