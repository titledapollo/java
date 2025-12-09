class chaining
{
 int x;
 double y;
 chaining()
 {
  System.out.println("Hello SKFGI");
 }
 chaining(int a)
 {
   this();
   this.x=a;
 }
 chaining(double a)
 {
  this(10);
  this.y=a;
 }
 void show()
 {
  System.out.println("x="+x);
  System.out.println("y="+y);
 }
 public static void main(String args[])
 {
  chaining c=new chaining(10.5);
  c.show();
 }
}