 
class FibonacciGenerator implements Runnable  
{ 
private int count; 
public FibonacciGenerator(int count)  
{ 
this.count = count; 
} 
public void run()  
{ 
System.out.println("Fibonacci Series (" + count + " terms):"); 
int a = 0, b = 1; 
System.out.print(a + " " + b + " "); 
for (int i = 2; i < count; i++)  
{ 
int c = a + b; 
System.out.print(c + " "); 
a = b; 
b = c; 
} 
System.out.println(); 
} 
} 
class EvenNumberPrinter implements Runnable  
{ 
private int start, end; 
public EvenNumberPrinter(int start, int end)  
{ 
this.start = start; 
this.end = end; 
} 
public void run()  
{ 
System.out.println("Even Numbers from " + start + " to " + end + ":"); 
for (int i = start; i <= end; i++)  
{ 
if (i % 2 == 0) 
{ 
System.out.print(i + " "); 
} 
} 
System.out.println(); 
} 
} 
public class RunnableExample  
{ 
public static void main(String args[])  
{ 
Runnable fibTask = new FibonacciGenerator(10);  
Runnable evenTask = new EvenNumberPrinter(1, 20);  
Thread t1 = new Thread(fibTask); 
Thread t2 = new Thread(evenTask); 
t1.start(); 
t2.start(); 
} 
}