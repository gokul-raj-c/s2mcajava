import java.io.*;
class NameSort
{
public static void main(String args[]) throws IOException
{
DataInputStream x=new DataInputStream(System.in);
System.out.println("Enter limit");
int n=Integer.parseInt(x.readLine());
String str[]=new String[n];
String temp;
System.out.println("Enter names");
for(int i=0;i<n;i++)
{
str[i]=x.readLine();
}
for (int i=0;i<n;i++)
{
for (int j=0;j<n;j++)
{
if(str[i].compareTo(str[j]) > 0)
{
temp=str[i];
str[i]=str[j];
str[j]=temp;
}
}
}
System.out.println();
System.out.println("Names");
for(int i=0;i<n;i++)
{
System.out.println(str[i]);
}
}
}
