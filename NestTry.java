class NestTry
{
public static void main(String args[]) 
{
try 
{
int a = args.length;
/* If no command-line args are present, a divide-by-zero exception is generated.
*/
int b = 42 / a;
System.out.println("a = " + a);
try
{
// nested try block
/* If one command-line arg is used then a divide-by-zero exception will be
generated by the following code. */
if(a==1)
a = a/(a-a); // division by zero
if(a==2)
{
int c[ ] = { 11,22 };
c[42] = 99;
// generate an out-of-bounds exception
}
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Array index out-of-bounds: " + e);
}
}
catch(ArithmeticException e)
{
System.out.println("Divide by 0: " + e);
}
}
}



/*
mits@mits-Veriton-M200-H510:~/gokul java$ javac NestTry.java
mits@mits-Veriton-M200-H510:~/gokul java$ java NestTry
Divide by 0: java.lang.ArithmeticException: / by zero
mits@mits-Veriton-M200-H510:~/gokul java$ java NestTry 1
a = 1
Divide by 0: java.lang.ArithmeticException: / by zero
mits@mits-Veriton-M200-H510:~/gokul java$ java NestTry 2 3
a = 2
Array index out-of-bounds: java.lang.ArrayIndexOutOfBoundsException: Index 42 out of bounds for length 2
*/





