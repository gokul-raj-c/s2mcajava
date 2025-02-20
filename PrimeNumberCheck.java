class PrimeNumberCheck 
{
public static void main(String args[]) 
{
int num = Integer.parseInt(args[0]);
if (num <= 1) 
{
System.out.println(num+" is not prime");
}
boolean isPrime = true;
for (int i = 2; i * i <= num; i++) 
{
if (num % i == 0) {
isPrime = false; 
break;
}
}
if (isPrime) 
{
System.out.println(num+" is prime");
} 
else 
{
System.out.println(num+" is not prime");
}
}
}
