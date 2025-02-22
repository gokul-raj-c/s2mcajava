class ArmstrongNumber 
{
public static void main(String args[]) 
{
int num=Integer.parseInt(args[0]);
int num1=num;
int nofdigit = 0;
int temp = num;
while (temp != 0) 
{
temp=temp/10;
nofdigit=nofdigit+1;
}
int sum=0;
temp = num;  
while (temp != 0) 
{
int digit = temp % 10;  
sum=sum+(int) Math.pow(digit, nofdigit);
temp=temp/10;
}
if (sum == num1) 
{
System.out.println(num1+" is Armstrong");
} 
else 
{
System.out.println(num1+" is Armstrong");
}
}
}
