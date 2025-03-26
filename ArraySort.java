class ArraySort
{
public static void main(String args[])
{
int arr[]=new int[5];
int n=arr.length;
System.out.println("array length="+n);
for (int i=0;i<n;i++)
{
arr[i]=Integer.parseInt(args[i]);
}
System.out.println("elements");
for (int i=0;i<n;i++)
{
System.out.println(arr[i]+" ");
}
for (int i=0;i<n;i++)
{
for (int j=0;j<n;j++)
{
if(arr[i]<arr[j])
{
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
System.out.println("after sorting:");
for (int i=0;i<n;i++)
{
System.out.println(arr[i]+" ");
}
}
}
