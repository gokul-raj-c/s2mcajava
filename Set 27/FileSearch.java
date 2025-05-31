import java.io.File;
import java.util.*; 
class FileSearch 
{
public static void main(String args[]) 
{
try 
{
Scanner obj = new Scanner(System.in);
System.out.println("Enter the directory path:");
String dirPath = obj.nextLine();
File f = new File(dirPath);
if (!f.exists() || !f.isDirectory()) 
{
System.out.println("Invalid directory path!");
return;
}
File[] list = f.listFiles();
System.out.println("Contents of the directory:");
for (int i = 0; i < list.length; i++) 
{
if (list[i].isDirectory()) 
{
System.out.println("[DIR]  " + list[i].getName());
} 
else 
{
System.out.println("[FILE] " + list[i].getName());
}
}
System.out.println("Enter file name to search:");
String searchName = obj.nextLine();
boolean found = false;
for (int i = 0; i < list.length; i++) 
{
if (list[i].getName().equalsIgnoreCase(searchName)) 
{
System.out.println("File found at: " + list[i].getAbsolutePath());
found = true;
break;
}
}
if (!found) 
{
System.out.println("File not found in the directory.");
}
} 
catch (Exception e) 
{
System.out.println(e);
}
}
}
