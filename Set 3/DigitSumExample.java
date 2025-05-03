class DigitSumExample
{
public static void main(String args[])
{
int n=Integer.parseInt(args[0]);
int sum = 0, d;
System.out.println("Number="+n);
while (n != 0) 
{
d=n % 10;  
sum=sum+d;      
n = n / 10;   
}
System.out.println("sum="+sum);
}
}
