class ArmstrongNumber 
{
public static void main(String args[]) 
{
int num=Integer.parseInt(args[0]);
int n=0;
int temp=num;
while (temp != 0) 
{
temp=temp/10;
n=n+1;
}
int sum=0;
temp=num;  
while (temp != 0) 
{
int digit=temp%10;  
sum=sum+(int)Math.pow(digit,n);
temp=temp/10;
}
if (sum==num) 
{
System.out.println(num+" is Armstrong");
} 
else 
{
System.out.println(num+" is not Armstrong");
}
}
}
