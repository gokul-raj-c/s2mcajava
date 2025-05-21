class UncaughtExe
{
public static void main(String args[])
{
int i=10;
int j=10;
try
{
int d=i/(i-j);
System.out.println("Division =" +d);
}
catch(ArithmeticException eobj)
{
System.out.println("exception type" +eobj);
}
int s=i+j;
System.out.println("Sum=" +s);
}
}




/*mits@mits-Veriton-M200-H510:~/gokul java$ javac UncaughtExe.java
mits@mits-Veriton-M200-H510:~/gokul java$ java UncaughtExe
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at UncaughtExe.main(UncaughtExe.java:7)
mits@mits-Veriton-M200-H510:~/gokul java$ javac UncaughtExe.java
mits@mits-Veriton-M200-H510:~/gokul java$ java UncaughtExe
exception typejava.lang.ArithmeticException: / by zero
Sum=20
mits@mits-Veriton-M200-H510:~/gokul java$  */

