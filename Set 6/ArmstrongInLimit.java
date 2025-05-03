import java.io.*;
class ArmstrongInLimit
{
public static void main(String args[]) throws IOException
{
DataInputStream x=new DataInputStream(System.in);
System.out.println("Enter Limit 1");
int num1=Integer.parseInt(x.readLine());
System.out.println("Enter Limit 2");
int num2=Integer.parseInt(x.readLine());
System.out.println("Armstrong Numbers:");
for (int i = num1; i<num2; i++)
{
int n=0;
int temp=i;
while (temp != 0) 
{
temp=temp/10;
n=n+1;
}
int sum=0;
temp=i;  
while (temp != 0) 
{
int digit=temp%10;  
sum=sum+(int)Math.pow(digit,n);
temp=temp/10;
}
if (sum==i) 
{
System.out.println(i);
} 
}
}
}
