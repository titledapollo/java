class methodoverloading
{
double a,c;
void arpm(float x)
{
a=(22/7)*x*x;
c=2*(22/7)*x;
System.out.println("The area of circle is="+a);
System.out.println("The perimeter of circle is="+c);
}
void arpm(int x)
{
a=x*x;
c=(4*x);
System.out.println("The area square is="+a);
System.out.println("The perimeter square is="+c);
}
void arpm(int x,int y,int z)
{
a=(1/2)*x*y;
c=(x+y+z);
System.out.println("The area of triangle is="+a);
System.out.println("The perimeter of triangle is="+c);
}
public static void main(String args[])
{
methodoverloading m=new methodoverloading();
m.arpm(7.0f);
m.arpm(4);
m.arpm(4,6,8);
}
}
