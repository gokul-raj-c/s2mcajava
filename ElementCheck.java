import java.io.*;
class ElementCheck
{
public static void main(String args[]) throws IOException
{
DataInputStream x=new DataInputStream(System.in);
System.out.println("enter limit of array");
int n=Integer.parseInt(x.readLine());
int a[]=new int[n];
System.out.println("enter elements");
for(int i=0;i<n;i++)
{
a[i]=Integer.parseInt(x.readLine());
}
System.out.println("elements");
for(int i=0;i<n;i++)
{
System.out.print(a[i]+" ");
}
System.out.println();
int c=1,flag=0;
System.out.println("enter element to check");
int y=Integer.parseInt(x.readLine());
for(int i=0;i<n;i++)
{
if(a[i]==y)
{
flag=1;
break;
}
c=c+1;
}
if(flag==1)
{
System.out.println("element found at position "+c);
}
else
{
System.out.println("element not found");
}
}
}
