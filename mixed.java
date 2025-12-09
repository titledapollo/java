class Test
{
int a;
Test(int x)
{
a=x;
}
void show()
{
System.out.println(a);
}
}
class Test1 extends Test
{
int b;
Test1(int x,int y)
{
super(x);
b=y;
}
void show1()
{
super.show();
System.out.println(b);
}
public static void main(String[] args)
{
Test1 t= new Test1(10,20);
t.show();
t.show1();
}
}
