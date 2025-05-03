class MatrixOpearations
{
public static void main(String args[])
{
int a[][]=new int[2][2];
int b[][]=new int[2][2];
int c[][]=new int[2][2];
int d[][]=new int[2][2];
int l=args.length;
int k=0;
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
a[i][j]=Integer.parseInt(args[k]);
k=k+1;
}
}
k=l-k;
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
b[i][j]=Integer.parseInt(args[k]);
k=k+1;
}
}
System.out.println("matrix1");
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
System.out.print(a[i][j] +" ");
}
System.out.println();
}
System.out.println("matrix2");
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
System.out.print(b[i][j] +" ");
}
System.out.println();
}
System.out.println("addition");
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
c[i][j]=a[i][j]+b[i][j];
System.out.print(c[i][j] +" ");
}
System.out.println();
}

System.out.println("multiplication");
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
d[i][j]=0;
for(int m=0;m<2;m++)
{
d[i][j]=d[i][j]+(a[i][m]*b[m][j]);
}
System.out.print(d[i][j] +" ");
}
System.out.println();
}
}
}
