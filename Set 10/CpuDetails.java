import java.util.*;
class CPU 
{
int price;
CPU(int price) 
{
this.price = price;
}
void display()
{ 
System.out.println("CPU Info:");
System.out.println("CPU Price:" +price+ " Rs");
} 

class Processor 
{
int cores;
String manufacturer;
Processor(int cores, String manufacturer) 
{
this.cores = cores;
this.manufacturer = manufacturer;
}
void displayProcessorInfo() 
{
System.out.println("Processor Info:");
System.out.println("Cores: " + cores);
System.out.println("Manufacturer: " + manufacturer);
}
}


static class RAM 
{
int memory;
String manufacturer;
RAM(int memory, String manufacturer) 
{
this.memory = memory;
this.manufacturer = manufacturer;
}
void displayRAMInfo() 
{
System.out.println("RAM Info:");
System.out.println("Memory: " + memory + " GB");
System.out.println("Manufacturer: " + manufacturer);
}
}
}

class CpuDetails 
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in); 
System.out.print("Enter Processor Price"); 
int price=sc.nextInt(); 
CPU c1=new CPU(price); 

System.out.print("Enter Number of Cores"); 
int cor=sc.nextInt(); 
sc.nextLine(); 
System.out.print("Enter Processor Manufacturer"); 
String manf=sc.nextLine(); 
CPU.Processor p1 = c1.new Processor(cor, manf); 
     
System.out.print("Enter Memory"); 
int mem = sc.nextInt(); 
sc.nextLine(); 
System.out.print("Enter RAM Manufacturer"); 
String manf1 = sc.nextLine(); 
CPU.RAM r1 = new CPU.RAM(mem, manf1); 

c1.display(); 
p1.displayProcessorInfo(); 
r1.displayRAMInfo();
}
}





