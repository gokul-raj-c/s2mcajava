import java.util.*;

class Fact 
{
static int findFactorial(int n) 
{
if (n == 0 || n == 1)
return 1;
else
return n * factorial(n - 1);
}
}

class FactorialDemo
{
public static void main(String args[]) 
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number to find its factorial: ");
int num = sc.nextInt();

if (num < 0) 
{
System.out.println("Factorial is not defined for negative numbers.");
} 
else 
{
int result = Fact.findFactorial(num);
System.out.println("Factorial of " + numb + " is: " + result);
}

sc.close();
}
}
