class Vehicle
{
int sno;
String type,name;
Vehicle(int s,String t,String n)
{
sno=s;
type=t;
name=n;
}
void display()
{
System.out.println("Serial No:"+sno);
System.out.println("Type:"+type);
System.out.println("Name:"+name);
}
}

class Car extends Vehicle
{
Car(int s, String t, String n) 
{
super(s, t, n); 
}
void display()
{
System.out.println("Serial No:"+sno);
System.out.println("Type:"+type);
System.out.println("Name:"+name);
}
}

class VehicleDetails
{
public static void main(String args[])
{
Vehicle v=new Vehicle(101,"abc","xyz");
v.display();
v=new Car(102,"mno","pqr");
v.display();
}
}
