import java.util.*;
public class StackRemoveByPosition  
{
public static <T> void removeAtPosition(Stack<T> stk, int position) 
{
if (position < 0 || position >= stk.size()) 
{
System.out.println("Invalid position.");
return;
}
Stack<T> temp = new Stack<>();
for (int i = 0; i < position; i++) 
{
temp.push(stk.pop());
}
T removedElement = stk.pop();
System.out.println("Removed element: " + removedElement);
while (!temp.isEmpty()) 
{
stk.push(temp.pop());
}
}
public static void main(String args[]) 
{
Scanner sc = new Scanner(System.in);
Stack<Integer> stk = new Stack<>();
stk.push(10);
stk.push(15);
stk.push(30);
stk.push(20);
stk.push(5);
System.out.println("Initial Stack: " + stk);
System.out.println("The element at top of stack: " + stk.peek());
System.out.print("Enter the position (0 = top) of element to remove: ");
int position = sc.nextInt();
removeAtPosition(stk, position);
System.out.println("Stack after removal: " + stk);
if (!stk.isEmpty()) 
{
System.out.println("The element at the top of the stack is: " + stk.peek());
} 
else 
{
System.out.println("Stack is empty now.");
}
sc.close();
}
}
