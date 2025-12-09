class IC
{
 class B
 {
   void show()
   {
	   System.out.println("SKFGI");
   }
 }
public static void main(String args[])
{
 IC a=new IC();
 IC.B b=a.new B();
 b.show();
}
}