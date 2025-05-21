public class TestThrow1
{
static void validate(int age)
{
if(age<18)
throw new ArithmeticException("not valid");
else
System.out.println("welcome to vote");
}
public static void main(String args[]) {
validate(13);
System.out.println("rest of the code...");
}
}


/*
mits@mits-Veriton-M200-H510:~/gokul java$ javac TestThrow1.java
mits@mits-Veriton-M200-H510:~/gokul java$ java TestThrow1
Exception in thread "main" java.lang.ArithmeticException: not valid
	at TestThrow1.validate(TestThrow1.java:6)
	at TestThrow1.main(TestThrow1.java:11)
*/
