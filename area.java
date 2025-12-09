class area
{
area (double l, double b)
{
System.out.println("Area="+(l*b));
}
area (float r)
{
System.out.println("Area="+(3.14*r*r));
}
area (int ba,int h)
{
System.out.println("Area="+(0.5*ba*h));
}
public static void main(String args[])
{
area obj=new area(4.2,5.2);
area obj1=new area(3.2);
area obj2=new area(6,3);
}
}
