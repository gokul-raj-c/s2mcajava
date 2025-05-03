class PrimeNumberCheck 
{
public static void main(String args[]) 
{
int num = Integer.parseInt(args[0]);
if (num <= 1) 
{
System.out.println(num+" is not prime");
}
int flag=0;
for (int i = 2; i<num/2; i++) 
{
if (num % i == 0) 
{
flag=1; 
break;
}
}
if (flag==0) 
{
System.out.println(num+" is prime");
} 
else 
{
System.out.println(num+" is not prime");
}
}
}
