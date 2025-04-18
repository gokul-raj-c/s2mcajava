import java.io.*;
class Account
{
int acno;
String name;
String actype;
int balance=0;
Account(int n,String p,String t)
{
acno=n;
name=p;
actype=t;
}

void deposit(int amt)
{
balance=balance+amt;
System.out.println(balance);
}

void withdraw(int amt1)
{
if(balance<=0)
{
System.out.println("Insufficient Balance");
}
else
{
balance=balance-amt1;
}
}

}

class AccountCreation
{
public static void main(String args[]) throws IOException
{
DataInputStream x=new DataInputStream(System.in);
int ch;
do
{
System.out.println("1.create an account\n2.deposit amount\n3.withdraw amount\n4.display details\n5.exit");
System.out.println("choose operation");
ch=Integer.parseInt(x.readLine());
switch(ch)
{
case 1:
{
System.out.println("Enter an account no");
int n=Integer.parseInt(x.readLine());
System.out.println("Enter user name");
String p=x.readLine();
System.out.println("Enter Account Type");
String t=x.readLine();
Account n=new Account(n,p,t);
break;
}
case 2:
{
System.out.println("Deposit");
int n=Integer.parseInt(x.readLine());
System.out.println("Enter amount to deposit");
int amt=Integer.parseInt(x.readLine());
n.deposit(amt);
break;
}
case 3:
{
System.out.println("Withdraw");
int n=Integer.parseInt(x.readLine());
System.out.println("Enter amount to withdraw");
int amt1=Integer.parseInt(x.readLine());
n.withdraw(amt1);
break;
}
case 4:
{
display();
break;
}
case 5:
{
System.out.println("User exit");
break;
}
default:
System.out.println("Enter valid no");
break;
}
}while(ch!=5);
}
}

