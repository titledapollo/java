class a{
void show()
{
System.out.println("Hi,I am parent");
}
}
class B extends a
{
void show1()
{
System.out.println("Hi,I am child");
}
}
class C extends a{
void show1()
{
System.out.println("Hi,I am child");
}
public static void main(String []args)
{
C c1= new C();
c1.show();
c1.show1();
B b=new B();
b.show();
b.show1();
}
}