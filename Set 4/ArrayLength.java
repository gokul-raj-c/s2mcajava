class ArrayLength
{
public static void main(String args[])
{
int arr[]=new int[5];
for (int i=0;i<5;i++)
{
arr[i]=Integer.parseInt(args[i]);
}
int n=arr.length;
System.out.println("array length="+n);
}
}
