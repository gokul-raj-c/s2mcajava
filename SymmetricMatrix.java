import java.io.*;
class SymmetricMatrix
{
public static void main(String args[]) throws IOException
{
int flag=0;
DataInputStream x=new DataInputStream(System.in);
System.out.println("Enter order of matrix");
int n=Integer.parseInt(x.readLine());
int a[][]=new int[n][n];
System.out.println("Enter elements of Matrix");
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
a[i][j]=Integer.parseInt(x.readLine());
}
}
System.out.println("Matrix elements");
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if(a[i][j]!=a[j][i])
{
flag=1;
break;
}
}
}
if(flag==0)
{
System.out.println("Matrix is Symmetric");
}
else
{
System.out.println("Matrix is not Symmetric");
}
}
}
