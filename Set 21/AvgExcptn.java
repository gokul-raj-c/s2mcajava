import java.util.*;
class AvgExcptn
{
static class NegativeNumberException extends Exception 
{
public NegativeNumberException(String message) 
{
super(message);
}
}
public static void main(String args[]) 
{
Scanner sc = new Scanner(System.in);
int n;
double sum = 0;
int count = 0;
System.out.println("enter limit");
n = sc.nextInt();
System.out.println("Enter numbers");
for (int i = 1; i <= n; i++) 
{
int num = sc.nextInt();
try 
{
if (num < 0) 
{
throw new NegativeNumberException("Negative number entered: " + num);
}
sum += num;
count++;
} catch (NegativeNumberException e) 
{
System.out.println("Error: " + e.getMessage());
}
}

if (count > 0) 
{
System.out.println("Average=" + (sum / count));
} 
else 
{
System.out.println("invalid number");
}
}
}

