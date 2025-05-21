import java.util.*;
interface Bill
{
void calculate_total();
}
class BillCalculate implements Bill
{
int product_id,quantity;
float unit_price,total_price;
String product_name;
static float net_total=0;
BillCalculate(int pid,String pname,int qty,float price)
{
product_id = pid;
product_name = pname;
quantity = qty;
unit_price = price;
calculate_total();
}
public void calculate_total()
{
total_price = quantity * unit_price;
calculate_net_total();
}
void calculate_net_total()
{
net_total+=total_price;
}
void display()
{
System.out.println(product_id+"\t\t"+product_name+"\t\t"+quantity+"\t\t"+unit_price+"\t\t"+total_price);
System.out.println("------------------------------------------------------------------------");
}
static void display_net_total(){
System.out.println("\t\t\tNet Amount\t"+net_total);
}
}
class ProductBill 
{
public static void main(String args[]) 
{
Scanner sc =new Scanner(System.in);
int pid,qty;
String pname;
float price;
System.out.println("Product list\n----------");
System.out.println("Product id\tProduct name\tPrice\n----------------------");
System.out.println("101\t\tA\t\t20");
System.out.println("102\t\tB\t\t40");
System.out.println("Enter the number of products needed : ");
int n = sc.nextInt();
sc.nextLine();
BillCalculate bc[] = new BillCalculate[n];
for(int i=0;i<n;i++)
{
System.out.println("Enter product id");
pid = sc.nextInt();
sc.nextLine();
System.out.println("Enter product name");
pname = sc.nextLine();
System.out.println("Enter no of quantity");
qty = sc.nextInt();
sc.nextLine();
System.out.println("Enter unit price");
price = sc.nextFloat();
sc.nextLine();
bc[i] = new BillCalculate(pid,pname,qty,price);
}
System.out.println("Product id\tProduct name\tQuantity\tUnit Price\tTotal");
System.out.println("------------------------------------------------------------------------");
for(BillCalculate b:bc)
{
b.display();
}
BillCalculate.display_net_total();
}    
}
