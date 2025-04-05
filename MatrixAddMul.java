import java.util.*;
class Matrix
{
int row;
int cols;
int arr[][];

Matrix(int r,int c)
{
row=r;
cols=c;
arr=new int[r][c];
}

void readMatrix (Scanner sc)
{
for(int i=0;i<row;i++)
{
for(int j=0;j<cols;j++)
{
arr[i][j]=sc.nextInt();
}
}
}

void displayMatrix ()
{
for(int i=0;i<row;i++)
{
for(int j=0;j<cols;j++)
{
System.out.print(arr[i][j] +" ");
}
System.out.println();
}
}

Matrix addMatrix (Matrix other)
{
if((row != other.row) || (cols != other.cols))
{
System.out.println("Addition Not Possible");
return NULL;
}
else
{
Matrix res=new Matrix(row,cols);
for(int i=0;i<row;i++)
{
for(int j=0;j<cols;j++)
{
res.arr[i][j]=arr[i][j]+other.arr[i][j];
}
}
return res;
}
}

Matrix mulMatrix (Matrix other)
{
if( cols != other.row )
{
System.out.println("Multiplication Not Possible");
return NULL;
}
else
{
Matrix res=new Matrix(row,other.cols);
for(int i=0;i<row;i++)
{
for(int j=0;j<other.cols;j++)
{
for(int k=0;k<cols;k++)
{
res.arr[i][j]=res.arr[i][j]+(arr[i][k]*other.arr[k][j]);
}
}
}
return res;
}
}

}

class MatrixAddMul
{
public static void main(String args[]) 
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter rows of matrix1");
int r = sc.nextInt();
System.out.print("Enter rows of matrix2");
int c = sc.nextInt();
Matrix m1 = new Matrix(r, c);
System.out.print("Enter rows of matrix1");
int r = sc.nextInt();
System.out.print("Enter rows of matrix2");
int c = sc.nextInt();
Matrix m2 = new Matrix(r, c);
m1.readMatrix(sc);
m2.readMatrix(sc);
System.out.println("Matrix 1:");
m1.displayMatrix();
System.out.println("Matrix 2:");
m2.displayMatrix();
Matrix sum = m1.addMatrix(m2);
if (sum != null) 
{
System.out.println("Sum of matrices:");
sum.displayMatrix();
}
Matrix product = m1.mulMatrix(m2);
if (product != null) 
{
System.out.println("Product of matrices:");
product.displayMatrix();
}
}
}