class copy
{
 int x;
 copy(int y)
 {
  x=y;
 }
 copy(copy a)
 {
  x=a.x;
  System.out.println("Result="+x);
 }
 public static void main(String args[])
 {
  copy c=new copy(10);
  copy c1=new copy(c);
 }
}