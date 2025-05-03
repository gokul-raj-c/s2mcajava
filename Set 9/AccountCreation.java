import java.util.*;
class Account
{
int acno;
String name;
String actype;
int balance,amt1,amt2;
Account(int n,String p,String t,int amt)
{
acno=n;
name=p;
actype=t;
balance=amt;
}

void deposit(int amt1)
{
balance=balance+amt1;
System.out.println();
System.out.println("Amount "+amt1+" credited");
System.out.println("Available Balance "+balance+"Rs");
}

void withdraw(int amt2)
{
if(balance<=0)
{
System.out.println("Insufficient Balance");
}
else
{
balance=balance-amt2;
System.out.println();
System.out.println("Amount "+amt2+" debited");
System.out.println("Available Balance "+balance+"Rs");
}
}

void display()
{
System.out.println();
System.out.println("Account Details");
System.out.println("Account No: "+acno);
System.out.println("User Name: "+name);
System.out.println("Account Type: "+actype);
System.out.println("Balance: "+balance+"Rs");
}

}

class AccountCreation
{
public static void main(String args[])
{
int no,ch,bal,ano;
String name,type;
Scanner sc=new Scanner(System.in);
Account a1[]=new Account[5];
System.out.println("Enter no of Account Holders:");
int n=sc.nextInt();
for(int i=0;i<n;i++)
{
System.out.println();
System.out.println("Enter an account no");
no=sc.nextInt();
sc.nextLine();
System.out.println("Enter user name");
name=sc.nextLine();
System.out.println("Enter Account Type");
type=sc.nextLine();
System.out.println("Enter Amount");
bal=sc.nextInt();
a1[i]=new Account(no,name,type,bal);
}
do
{
System.out.println();
System.out.println("1.deposit amount\n2.withdraw amount\n3.display details\n4.exit");
System.out.println("choose operation");
ch=sc.nextInt();
switch(ch)
{
case 1:
{
System.out.println("Deposit");
System.out.println("Enter account no:");
ano=sc.nextInt();
int j=findaccount(ano,a1,n);
if(j<0)
{
System.out.println("Enter valid account no");
break;
}
else
{
System.out.println("Enter amount to deposit");
int amt=sc.nextInt();
a1[j].deposit(amt);
break;
}
}

case 2:
{
System.out.println("Withdraw");
System.out.println("Enter account no:");
ano=sc.nextInt();
int j=findaccount(ano,a1,n);
if(j<0)
{
System.out.println("Enter valid account no");
break;
}
else
{
System.out.println("Enter amount to withdraw");
int amt1=sc.nextInt();
a1[j].withdraw(amt1);
break;
}
}

case 3:
{
System.out.println("Display Details");
System.out.println("Enter account no:");
ano=sc.nextInt();
int j=findaccount(ano,a1,n);
if(j<0)
{
System.out.println("Enter valid account no");
break;
}
else
{
a1[j].display();
break;
}
}
case 4:
{
System.out.println("User exit");
break;
}
default:
System.out.println("Enter valid no");
break;
}
}while(ch!=4);
}

static int findaccount(int ano,Account a1[],int n)
{
int v=-1;
for (int k = 0; k < n; k++) 
{
if (a1[k] != null && a1[k].acno == ano) 
{
v=k;
return v;
}
}
return v;
}

}


