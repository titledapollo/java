class A
{
    void show()
    {
        System.out.println("PARENT");
    }
}
class B extends A
{
    void show1()
    {
        System.out.println("CHILD");
    }
}
class C extends A
{
    void show1()
    {
        System.out.println("CHILD1");
    }
    public static void main(String args[])
    {
        C c=new C();
        c.show();
        c.show1();
        B b=new B();
        b.show();
        b.show1();
    }
}