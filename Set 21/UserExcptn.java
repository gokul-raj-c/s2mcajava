import java.util.*;
class UserExcptn 
{
static class AuthException extends Exception 
{
public AuthException(String message) 
{
super(message);
}
}
public static void main(String args[]) 
{
String correctUsername = "admin";
String correctPassword = "admin123";
Scanner sc = new Scanner(System.in);
System.out.println("Enter username");
String username = sc.nextLine();
System.out.println("Enter password");
String password = sc.nextLine();
try 
{
if (!username.equals(correctUsername) || !password.equals(correctPassword)) 
{
throw new AuthException("Invalid username or password.");
}
System.out.println("Login successful!");
} 
catch (AuthException e) 
{
System.out.println(e.getMessage());
}
}
}
