import java.io.*;
class FileProperty
{
public static void main(String args[])
{
String fname=args[0];
File f= new File(fname);
System.out.println("File Name:"+f.getName());
System.out.println("Path:"+f.getPath());
System.out.println("Absolute Path:"+f.getAbsolutePath());
System.out.println("Parent:"+f.getParent());
System.out.println("Exists:"+f.exists());
if(f.exists())
{
System.out.println("Is Writtable:"+f.canWrite());
System.out.println("Is Readable:"+f.canRead());
System.out.println("Is a Directory:"+f.isDirectory());
System.out.println("File Size in Bytes:"+f.length());
}
}
}
