class PrimeNumbers
{
public static void main(String args[])
{
int n=Integer.parseInt(args[0]);
System.out.println("Prime numbers up to "+n+":");
for(int num = 2; num <= n; num++)
{
boolean isPrime = true;
for(int i = 2; i <= Math.sqrt(num); i++)
{
if(num % i == 0)
{
isPrime = false;
break;
}
}
if(isPrime)
{
System.out.println(num);
}
}
}
}
