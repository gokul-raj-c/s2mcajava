class ArgExcptn
{
public static void main(String args[]) 
{
int sum = 0;
int count = 0;
for (String arg : args) 
{
try 
{
int num = Integer.parseInt(arg);
sum=sum+num;
} 
catch (NumberFormatException e) 
{
count++;
}
}
System.out.println("Sum of valid=" + sum);
System.out.println("No of invalid=" + count);
}
}
