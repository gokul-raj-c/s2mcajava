import java.util.*;
class Method1
{
void add(int a,int b)
{
int sum1=a+b;
System.out.println("sum="+sum1);
}
void add(double c,double d,double e)
{
double sum2=c+d+e;
System.out.println("sum="+sum2);
}
void add(int f,double g)
{
double sum3=f+g;
System.out.println("sum="+sum3);
}
}

class MethodOverloadEg
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Method1 m1=new Method1();
System.out.println("Enter Integer number 1");
int num1= sc.nextInt();
sc.nextLine();
System.out.println("Enter Integer number 2");
int num2= sc.nextInt();
sc.nextLine();
m1.add(num1,num2);
System.out.println("Enter Double number 1");
double num3= sc.nextDouble();
sc.nextLine();
System.out.println("Enter Double number 2");
double num4= sc.nextDouble();
sc.nextLine();
System.out.println("Enter Double number 3");
double num5= sc.nextDouble();
sc.nextLine();
m1.add(num3,num4,num5);
System.out.println("Enter Integer number 1");
int num6= sc.nextInt();
sc.nextLine();
System.out.println("Enter Double number 1");
double num7= sc.nextDouble();
sc.nextLine();
m1.add(num6,num7);
}
}
