class test
{
int i;
test(int x)
{
i=10;
}
void show()
{
System.out.println(i);
}
}
class test1 extends test
{
int i;
test1()
{
super(10);
i=20;
}
void add()
{
i=super.i+i;
}
void show()
{
super.show();
System.out.println(i);
}
public static void main(String args[])
{
test1 t=new test1();
t.add();
t.show();
}
}  