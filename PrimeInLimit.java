import java.io.*;
class PrimeInLimit
{
public static void main(String args[]) throws IOException
{
DataInputStream x=new DataInputStream(System.in);
System.out.println("Enter Limit");
int n=Integer.parseInt(x.readLine());
System.out.println("Prime numbers up to "+n+":");
for(int num = 2; num <= n; num++)
{
int flag=0;
for (int i = 2; i<num/2; i++) 
{
if (num % i == 0) 
{
flag=1; 
break;
}
}
if(flag==0)
{
System.out.println(num);
}
}
}
}
