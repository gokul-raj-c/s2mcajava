class Product 
{ 
int price; 
String pcode, pname; 
Product(String code, String name, int pri) 
{ 
pcode = code; 
pname = name; 
price = pri; 
} 
void display() 
{ 
System.out.println("Code: " +pcode); 
System.out.println("Name: " +pname);
System.out.println("Price: " +price);
} 
} 

class ProductDetails 
{ 
public static void main(String args[]) 
{ 
Product p1 = new Product("p1", "Mobile", 13000); 
Product p2 = new Product("p2", "Watch", 6500);
Product p3 = new Product("p3", "TV", 16000); 
System.out.println("Product with the lowest price");
if (p1.price < p2.price && p1.price < p3.price) 
{  
p1.display();
} 
else if (p2.price < p3.price) 
{ 
p2.display();
} 
else
{
p3.display();
}
} 
}