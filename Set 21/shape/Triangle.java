package shape;
public class Triangle
{
public double findArea(int a,int b,int c)
{
float s=(a+b+c)/2;
double area=s*(s-a)*(s-b)*(s-c);
return Math.sqrt(area);
}
}
