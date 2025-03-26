class LoopExample
{
public static void main(String args[])
{
int n=Integer.parseInt(args[0]);
System.out.println("using for-loop");
int sum1 = 0;
for (int i = 1; i <= n; i++) 
{
sum1=sum1+i;
}
System.out.println("sum="+sum1);
System.out.println("using while-loop");
int sum2 = 0;
int j = 1;
while (j <= n) 
{
sum2=sum2+j;
j++;
}
System.out.println("sum="+sum2);
System.out.println("using do-while-loop");
int sum3 = 0;
int k = 1;
do 
{
sum3=sum3+k;
k++;
} 
while (k<= n);
System.out.println("sum="+sum3);
}
}
