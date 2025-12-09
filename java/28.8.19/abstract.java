abstract class test
{
abstract void show();
void display()
{
System.out.println("class test");
}
}
class test1 extends test
{
void show()
{
System.out.println("class test1");
}
}
class test2 extends test
{
void show()
{
System.out.println("class test2");

}
public static void main(String args[])
{
test t=new test1();
t.display();
t.show();
t=new test2();
t.display();
t.show();
}
}

