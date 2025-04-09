import java.io.*;
class Matrix
{
int row;
int cols;
int arr[][];
int arr1[][];
int arr2[][];
Matrix(int r,int c)
{
row=r;
cols=c;
arr=new int[r][c];
}

void readMatrix(DataInputStream x) throws IOException
{
for(int i=0;i<row;i++)
{
for(int j=0;j<cols;j++)
{
arr[i][j]=Integer.parseInt(x.readLine());
}
}
}

void displayMatrix()
{
for(int i=0;i<row;i++)
{
for(int j=0;j<cols;j++)
{
System.out.print(arr[i][j]+" ");
}
System.out.println();
}
}

void addMatrix(Matrix other)
{
if((row != other.row) || (cols != other.cols))
{
System.out.println("addition not possible");
}
else
{
arr1=new int[row][cols];
for(int i=0;i<row;i++)
{
for(int j=0;j<cols;j++)
{
arr1[i][j]=arr[i][j]+other.arr[i][j];
System.out.print(arr1[i][j] +" ");
}
System.out.println();
}
}
}

void mulMatrix(Matrix other)
{
if(other.row != other.cols)
{
System.out.println("multiplication not possible");
}
else
{
arr2=new int[row][other.cols];
for(int i=0;i<row;i++)
{
for(int j=0;j<other.cols;j++)
{
for(int k=0;k<cols;k++)
{
arr2[i][j]=arr2[i][j]+(arr[i][k]*other.arr[k][j]);
}
System.out.print(arr2[i][j] +" ");
}
System.out.println();
}
}
}

}

class MatrixAddMul
{
public static void main(String args[]) throws IOException
{
DataInputStream x = new DataInputStream(System.in);
System.out.println("enter row of matrix1:");
int r1=Integer.parseInt(x.readLine());
System.out.println("enter column of matrix1:");
int c1=Integer.parseInt(x.readLine());
Matrix m1 = new Matrix(r1,c1);
System.out.println("enter values of matrix1:");
m1.readMatrix(x);

System.out.println("enter row of matrix2:");
int r2=Integer.parseInt(x.readLine());
System.out.println("enter column of matrix2:");
int c2=Integer.parseInt(x.readLine());
Matrix m2 = new Matrix(r2,c2);
System.out.println("enter values of matrix1:");
m2.readMatrix(x);

System.out.println("matrix1:");
m1.displayMatrix();
System.out.println("matrix2:");
m2.displayMatrix();

System.out.println("matrix addition:");
m1.addMatrix(m2);
System.out.println("matrix multiplication:");
m1.mulMatrix(m2);

}
}
