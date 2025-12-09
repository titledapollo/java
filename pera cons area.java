class darea
{
darea(int x)
{
int a;
a=x*x;
System.out.println("Area="+a);
}
darea(int x,int y)
{
int a;
a=x*y;
System.out.println("Area="+a);
}
darea(float x)
{
float a;
a=(22.0f/7.0f)*x*x;
System.out.println("Area="+a);
}
darea(float x,float y)
{
float a;
a=(1.0f/2.0f)*x*y;
System.out.println("Area="+a);
}
public static void main(String args[])
{
darea b=new darea(4);
darea c=new darea(4,5);
darea d=new darea(7);
darea f=new darea(4.5f,5.4f);
}
}