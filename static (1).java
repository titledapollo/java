
class static_test
{ 
static 
{
System.out.println("SKFGI");
}
static int a;
static_test()
{
a=a+15;
}
static void show()
{
System.out.println(a);
}
public static void main(String args[]){
static_test t=new static_test();
static_test.show();
}
}
class test
{
static int a=1;
test(int x)
{
a=a+x;
}
static void show()
{	a++;
System.out.println("final output:"+a);
}
public static void main(String args[])
{
test t=new test(10);
test.show();
}
}

class test1
{
static int a;
test1()
{	a=a+1;
}
void show()
{
System.out.println(a);
}
public static void main(String args[])
{
test1 t= new test1();
t.show();
test1 t1=new test1();
t1.show();
}
}

class a { 
void show()
{
System.out.println("choise");
}
}
class b extends a
{
 void show1()
 {
 System.out.println(" is matter");
 }
 }
 class c extends b
{
void show1()
{ System.out.println("hi so what your choice?");
}
public static void main(String args[])
{
c c1=new c();
c1.show();
c1.show1();
b m=new b();
m.show();
m.show1();
}
}

