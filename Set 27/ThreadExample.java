class TableThread extends Thread  
{ 
public void run()  
{ 
System.out.println("Multiplication Table of 5:"); 
for (int i = 1; i <= 10; i++) 
{ 
System.out.println("5 x " + i + " = " + (5 * i)); 
} 
} 
} 
class PrimeThread extends Thread  
{ 
int n; 
PrimeThread(int n)  
{ 
this.n = n; 
} 
public void run()  
{ 
System.out.println("\nFirst " + n + " Prime Numbers:"); 
int count = 0, num = 2; 
while (count < n)  
{ 
if (isPrime(num))  
{ 
System.out.print(num + " "); 
count++; 
} 
num++; 
} 
System.out.println();  
} 
boolean isPrime(int x)  
{ 
if (x <= 1) 
return false; 
for (int i = 2; i <= Math.sqrt(x); i++)  
{ 
if (x % i == 0) 
return false; 
} 
return true; 
} 
} 
public class ThreadExample  
{ 
public static void main(String args[]) 
{ 
TableThread t1 = new TableThread(); 
PrimeThread t2 = new PrimeThread(10);  
t1.start(); 
t2.start(); 
} 
} 