import java.util.ArrayList; 
class ExampleArray  
{ 
public static void main(String[] args)  
{ 
ArrayList<String> languages = new ArrayList<>(); 
languages.add("C"); 
languages.add("Python"); 
System.out.println("ArrayList: " + languages); 
String str = languages.get(1); 
System.out.println("Element at index 1: " + str); 
languages.set(1, "Java"); 
System.out.println("Modified ArrayList: " + languages); 
String removed = languages.remove(1); 
System.out.println("Updated ArrayList: " + languages); 
System.out.println("Removed Element: " + removed); 
} 
}