class superprog
{
int i;
superprog(int x)
{
 i=x;
}
void show()
{
 System.out.println("Result="+i);
}
}
class superprog1 extends superprog
{
 int i;
 superprog1()
 {
  super(10);
  i=20;
 }
 void add()
 {
  i=super.i+1;
 }
 void show()
 {
  super.show();
  System.out.println("Result="+i);
 }
 public static void main(String args[])
 {
  superprog1 s=new superprog1();
  s.add();
  s.show();
 }
}