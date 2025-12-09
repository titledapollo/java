class B{
class C{
void show()
{
System.out.println("Welcome");
}
}
public static void main(String args[])
{
B b=new B();
B.C c = b.new C();
c.show();
}
}

